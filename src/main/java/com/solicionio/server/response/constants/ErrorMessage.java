package com.solicionio.server.response.constants;

import com.solicionio.essential.response.handlers.IMessageHandler;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ErrorMessage implements IMessageHandler {

    LOGIN_ERROR(201, "Username or password is not correct.");

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
        return true;
    }
}
