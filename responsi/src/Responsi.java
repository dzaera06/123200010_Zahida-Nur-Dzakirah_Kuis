import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Responsi{
    private JFrame frame;
    private JPanel loginPanel;
    private JPanel menuPanel;
    private JPanel animalPanel;
    private JPanel employeePanel;

    public Responsi() {
        frame = new JFrame("Zoo Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        loginPanel = new JPanel();
        menuPanel = new JPanel();
        animalPanel = new JPanel();
        employeePanel = new JPanel();
    }

    public void showLoginPanel() {
        frame.add(loginPanel, BorderLayout.CENTER);
        frame.revalidate();
        frame.repaint();
    }

    public void showMenuPanel(String username) {
        menuPanel.add(new JLabel("Welcome, " + username + "!"));
        frame.add(menuPanel, BorderLayout.CENTER);
        frame.revalidate();
        frame.repaint();
    }

    public void showAnimalPanel() {
        animalPanel.add(new JLabel("Animal Name:"));
        animalPanel.add(new JTextField(10));
        animalPanel.add(new JLabel("Animal Type:"));
        animalPanel.add(new JTextField(10));
        animalPanel.add(new JButton("Search"));
        frame.add(animalPanel, BorderLayout.CENTER);
        frame.revalidate();
        frame.repaint();
    }

    public void showEmployeePanel() {
        employeePanel.add(new JLabel("Employee Name:"));
        employeePanel.add(new JTextField(10));
        employeePanel.add(new JLabel("Employee Role:"));
        employeePanel.add(new JTextField(10));
        employeePanel.add(new JButton("Add"));
        frame.add(employeePanel, BorderLayout.CENTER);
        frame.revalidate();
        frame.repaint();
    }
}