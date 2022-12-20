package com.solicionio.server.response.constants;

import com.solicionio.essential.response.handlers.IMessageHandler;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum SuccessMessage implements IMessageHandler {

    LOGIN_SUCCESS(101, "Login Success.");

    private int statusCode;
    private String message;

    @Override
    public int getStatusCode() {
        return this.statusCode;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public boolean isError() {
        return false;
    }
}
