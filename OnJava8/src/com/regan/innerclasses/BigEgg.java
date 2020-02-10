package com.regan.innerclasses;

import java.sql.SQLOutput;

/**
 *@className: BigEgg
 *@description:
 *@author: weida.shi
 *@date: 2020/2/3 13:04
 *@version: V1.0
 **/
class Egg {
    private Yolk y;

    protected class Yolk {
        //蛋黄
        public Yolk() {
            System.out.println("Egg.Yolk");
        }

    }

    public Egg() {
        System.out.println("new Egg()");
        y = new Yolk();
    }
}

public class BigEgg extends Egg {
    /**
     * 内部类是不会被覆盖的
     */

    public class Yolk {
        public Yolk() {
            System.out.println("BigEgg.Yolk!");
        }
    }

    public static void main(String[] args) {
        new BigEgg();
    }
}