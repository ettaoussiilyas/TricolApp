package com.tricol.util;

import org.springframework.stereotype.Component;

@Component
public class ValidationUtil {
    
    public boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }
    
    public boolean isValidICE(String ice) {
        return ice != null && ice.length() >= 15;
    }
}