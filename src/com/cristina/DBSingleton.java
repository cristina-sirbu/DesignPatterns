package com.cristina;

public class DBSingleton {
    private static volatile DBSingleton instance = null;
    private DBSingleton() {
        // This should stop people from using reflection to instantiate this class
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }
    public static DBSingleton getInstance() {
        if (instance == null) {
            // This should check if other threads has created the instance already or not
            synchronized (DBSingleton.class) {
                if (instance == null) {
                    instance = new DBSingleton();
                }
            }
        }
        return instance;
    }
}
