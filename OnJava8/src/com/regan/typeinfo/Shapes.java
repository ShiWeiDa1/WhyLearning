package com.regan.typeinfo;

import java.util.stream.Stream;

/**
 *@className: Shapes
 *@description:
 *@author: Ty
 *@date: 2020/2/3 16:18
 *@version: V1.0
 **/
public class Shapes {
    public static void main(String[] args) {
        Stream.of(
                new Circle(), new Square(), new Triangle())
                .forEach(Shape::draw);
    }
}

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    @Override
    public abstract String toString();
}

class Circle extends Shape {
    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    @Override
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    @Override
    public String toString() {
        return "Triangle";
    }
}
