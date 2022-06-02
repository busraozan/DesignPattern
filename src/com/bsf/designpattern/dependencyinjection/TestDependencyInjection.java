package com.bsf.designpattern.dependencyinjection;

public class TestDependencyInjection {
    private final static String PATH = "com.bsf.designpattern.di.components.";

    public static void main(String[] args) {
        try {
            String className = PATH + "Video";
            //shape servis sınıfı gelen objeden soyutlanmış oldu, aradaki bağımlılık azaltıldı.
            IComponent IComponent = (IComponent) Class.forName(className).newInstance();
            RenderComponent renderComponent = new RenderComponent(IComponent);
            renderComponent.execute();
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException e){
            e.printStackTrace();
            System.out.println("Parametre olarak gelen değer için sınıf bulunamadı");
        }
    }
}
