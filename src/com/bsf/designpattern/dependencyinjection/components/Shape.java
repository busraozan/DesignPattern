package com.bsf.designpattern.dependencyinjection.components;

import com.bsf.designpattern.dependencyinjection.IComponent;

public class Shape implements IComponent {
    @Override
    public void execute() {
        System.out.println("Shape");
    }
}
