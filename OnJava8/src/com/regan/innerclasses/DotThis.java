package com.regan.innerclasses;

import sun.security.provider.MD5;

/**
 *@className: DotThis
 *@description:
 *@author: weida.shi
 *@date: 2019/12/10 11:01
 *@version: V1.0
 **/
public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {
        public DotThis outer() {
            return DotThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
       /* DotThis dt = new DotThis();
        DotThis.Inner dti = dt.new Inner();
        dti.outer().f();*/
        String str = " {\"page_number\":10}|2ehVD3QPAx83t5lHNm|2019121215120";
    }


}