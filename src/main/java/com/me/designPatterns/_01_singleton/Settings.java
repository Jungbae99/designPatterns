package com.me.designPatterns._01_singleton;

// synchronized, eager initialization, double checked locking, static inner
public enum Settings {

    INSTANCE;

//    private Settings() {}
//
//    private static class SettingsHolder {
//        private static final Settings INSTANCE = new Settings();
//    }
//
//    // 멀티스레드 환경에서 안전해야한다.
//    public static Settings getInstance() {
//        return SettingsHolder.INSTANCE;
//    }
//
//    protected Object readResolve() {
//        return getInstance();
//    }

}
