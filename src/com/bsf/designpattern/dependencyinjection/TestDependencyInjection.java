package com.bsf.designpattern.dependencyinjection;

public class TestDependencyInjection {
    private final static String PATH = "com.bsf.designpattern.dependencyinjection.components.";

    public static void main(String[] args) {
        try {
            String className = PATH + "Shape";
            //shape servis sınıfı gelen objeden soyutlanmış oldu, aradaki bağımlılık azaltıldı.
            IComponent component = (IComponent) Class.forName(className).newInstance();
            component.execute();
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException e){
            e.printStackTrace();
            System.out.println("Parametre olarak gelen değer için sınıf bulunamadı");
        }
    }
}
