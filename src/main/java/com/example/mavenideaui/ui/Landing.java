package com.example.mavenideaui.ui;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

@Component
public class Landing extends JFrame {
    private JButton yesButton;
    private JPanel rootPane;

    @PostConstruct
    public void post() {
        yesButton.setText("HAHAHAHA");
        System.out.println(rootPane);
    }

}
