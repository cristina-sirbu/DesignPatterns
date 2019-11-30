package com.cristina.singleton;

public class DBSingletonDemo {
    public static void main(String[] args) {
        DBSingleton instance = DBSingleton.getInstance();
        DBSingleton instance2 = DBSingleton.getInstance();
        System.out.println("Instance1="+instance);
        System.out.println("Instance2="+instance2);
        if (instance == instance2) {
            System.out.println("Same instance");
        }
    }
}
