package com.cristina;

public class DBSingleton {
    private static DBSingleton instance = null;
    private DBSingleton() {}
    public static DBSingleton getInstance() {
        // Lazy loading of the singleton
        // NOTE: NOT thread safe
        if (instance == null) {
            instance = new DBSingleton();
        }
        return instance;
    }
}
