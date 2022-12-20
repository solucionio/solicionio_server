package com.solicionio.server;

import com.solicionio.essential.Configuration;
import com.solicionio.essential.Essential;
import com.solicionio.essential.adapters.RequestAdapter;
import com.solicionio.essential.response.modules.RequestModule;
import com.solicionio.essential.utils.UtilConsole;
import com.solicionio.server.providers.Login;
import com.solicionio.server.providers.Register;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Main extends Essential {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        configurateRequestAdapter();
        enableRedis(Settings.REDIS_HOST, Settings.REDIS_PORT, null);
        enableNetty(Settings.NETTY_PORT);
    }

    private static void configurateRequestAdapter(){
        RequestAdapter.registerModules(Arrays.asList(
                new Login(),
                new Register()
        ));
    }

}