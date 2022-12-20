package com.solicionio.server;

import com.solicionio.essential.Essential;
import com.solicionio.essential.adapters.RequestAdapter;
import com.solicionio.server.providers.Login;
import com.solicionio.server.providers.Register;
import org.springframework.boot.SpringApplication;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        configurateRequestAdapter();
        RequestAdapter.registerModules();

        SpringApplication.run(Main.class, args);
        Essential.enable();
    }

    private static void configurateRequestAdapter(){
        RequestAdapter.moduleList = Arrays.asList(
                new Login(),
                new Register()
        );
    }
}