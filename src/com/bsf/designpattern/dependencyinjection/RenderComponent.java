package com.bsf.designpattern.dependencyinjection;

public class RenderComponent {

    private final IComponent component_;

    public RenderComponent(IComponent IComponent) {
        component_ = IComponent;
    }

    public void execute(){
        component_.execute();
    }
}
