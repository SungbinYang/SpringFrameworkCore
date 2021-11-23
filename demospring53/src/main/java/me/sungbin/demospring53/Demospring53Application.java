package me.sungbin.demospring53;

import me.sungbin.out.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class Demospring53Application {

	@Autowired
	MyService myService;

	public static void main(String[] args) {
//		SpringApplication.run(Demospring53Application.class, args);
		var app = new SpringApplication(Demospring53Application.class);
		app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) applicationContext -> {
			applicationContext.registerBean(MyService.class);
			applicationContext.registerBean(ApplicationRunner.class, () -> args1 -> System.out.println("Functional Bean Definition!"));
		});
		app.run(args);
	}

}
