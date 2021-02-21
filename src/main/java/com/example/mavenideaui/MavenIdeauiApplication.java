package com.example.mavenideaui;

import com.example.mavenideaui.ui.Landing;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.swing.*;
import java.awt.*;

@SpringBootApplication
public class MavenIdeauiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        var ctx = new SpringApplicationBuilder(MavenIdeauiApplication.class).headless(false).run(args);
        EventQueue.invokeLater(() -> {
            var ex = ctx.getBean(Landing.class);
            ex.pack();
            ex.setVisible(true);
            ex.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        });
    }


    @Override
    public void run(String... args) throws Exception {

    }
}
