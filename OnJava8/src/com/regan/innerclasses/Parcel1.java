package com.regan.innerclasses;

/**
 *@className: Parcel1
 *@description:
 *@author: weida.shi
 *@date: 2019/12/9 23:20
 *@version: V1.0
 **/
public class Parcel1 {
    static class Contents {
        private int i=11;

        public int value() {
            return i;
        }
    }

    static class Destination {
        private String label;
        Destination(String whereTo) {
            label = whereTo;
        }
        String readLabel(){
            return label;
        }
    }
    public void ship(String dest){
        Contents contents = new Contents();
        Destination destination = new Destination(dest);
        System.out.println(destination.readLabel());
    }
    public static void main(String[] args){
        Parcel1 parcel1 = new Parcel1();
        parcel1.ship("Tasmania");
    }



}