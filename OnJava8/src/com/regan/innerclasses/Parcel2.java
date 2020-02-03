package com.regan.innerclasses;

/**
 *@className: Parcel2
 *@description:
 *@author: weida.shi
 *@date: 2019/12/9 23:28
 *@version: V1.0
 **/
public class Parcel2 {
    static class Contents{
        private int i=11;
        public int value(){
            return i;
        }
    }
    static class Destination{
        private String label;
        Destination  (String whereTo ){
            this.label=whereTo;
        }
        String readLabel(){
            return label;
        }
    }

    public Destination to(String s){
        return new Destination(s);
    }
    public Contents contents(){
        return new Contents();
    }

    public void ship(String dest){
        Contents contents = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }
    public static void main(String[] args){
        Parcel2 parcel2= new Parcel2();
        parcel2.ship("Tasmania");
        Parcel2 q = new Parcel2();
        Parcel2.Contents contents = q.contents();
//        System.out.println(contents.value());
        Parcel2.Destination broneo = q.to("Broneo");

    }
}
