package es.ulpgc.software.imageviewer.app.gui;

import es.ulpgc.software.imageviewer.architecture.commands.Command;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

import static java.awt.BorderLayout.SOUTH;
import static java.awt.FlowLayout.CENTER;

public class Desktop extends JFrame {
    private final Map<String, Command> commands;

    public static Desktop create(SwingImageDisplay imageDisplay) {
        return new Desktop(imageDisplay);
    }

    private Desktop(SwingImageDisplay imageDisplay) throws HeadlessException {
        commands = new HashMap<>();
        this.setTitle("Image Viewer");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLayout(new BorderLayout());
        this.createToolBar();
        this.setLocationRelativeTo(null);
        this.getContentPane().add(imageDisplay);
    }

    private void createToolBar() {
        this.getContentPane().add(toolbar(), SOUTH);
    }

    private JPanel toolbar() {
        JPanel panel = new JPanel(new FlowLayout(CENTER));
        panel.add(button("prev"));
        panel.add(button("next"));
        return panel;
    }

    private JButton button(String name) {
        JButton button = new JButton(name);
        button.addActionListener(e -> commands.get(name).execute());
        return button;
    }

    public Desktop put(String name, Command command) {
        commands.put(name, command);
        return this;
    }
}
