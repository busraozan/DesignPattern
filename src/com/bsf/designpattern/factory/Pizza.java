package com.bsf.designpattern.factory;

public interface Pizza {
    default void prepare(){
        System.out.println("prepare");
    }
    default void cut(){
        System.out.println("cut");
    }
    default void box(){
        System.out.println("box");
    }
}
