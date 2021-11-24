package me.sungbin.demospring53;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        while (true) {
            System.out.println(applicationContext.getMessage("greeting", new String[]{"sungbin"}, Locale.KOREA));
            System.out.println(applicationContext.getMessage("greeting", new String[]{"sungbin"}, Locale.getDefault()));
            Thread.sleep(1000L);
        }
    }
}
