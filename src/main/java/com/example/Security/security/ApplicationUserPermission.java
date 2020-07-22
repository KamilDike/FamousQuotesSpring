package com.example.Security.security;

public enum  ApplicationUserPermission {
    QUOTATION_WRITE("quotation:write"),
    QUOTATION_READ("quotation:read"),
    QUOTATION_DELETE("quotation:delete");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
