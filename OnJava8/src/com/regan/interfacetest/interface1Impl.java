package com.regan.interfacetest;

/**
 *@className: interface1Impl
 *@description:
 *@author: weida.shi
 *@date: 2019/12/12 18:58
 *@version: V1.0
 **/
public class interface1Impl implements Interface1 {

    @Override
    public void warpResult() {
        System.out.println("this  is interface1Impl warpResult");
        Interface1.sysOut();
    }

    public static void main(String[] args) {
        interface1Impl interface1 = new interface1Impl();
//         实现类无法直接使用接口中的静态方法
//        interface1.sysOut();

        interface1.defaultMethod();
        interface1.warpResult();
    }
}