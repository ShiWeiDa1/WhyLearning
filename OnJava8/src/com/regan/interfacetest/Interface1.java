package com.regan.interfacetest;

/**
 *@interfaceName: Interface1
 *@description:
 *@author: weida.shi
 *@date: 2019/12/12 18:51
 *@version: V1.0
 **/
public interface Interface1 {

    void warpResult();

    /**
     * 接口中的静态方法
     */
    static void sysOut(){
        System.out.println("this is interface static way");
    }

    /**
     * 接口中的默认方法
     */
    default void defaultMethod(){
        System.out.println("interface1 defaultMethod");
    }

    public static void main(String[] args){
        Interface1.sysOut();
    }

}