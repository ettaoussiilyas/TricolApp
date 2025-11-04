package com.tricol.util;

// Pure Java class for Java Config
public class LoggingUtil {
    
    public void logInfo(String message) {
        System.out.println("[INFO] " + message);
    }
    
    public void logError(String message) {
        System.err.println("[ERROR] " + message);
    }
}