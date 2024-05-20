package responsi.pbo;

import java.beans.Statement;
import javax.swing.JOptionPane;
import model.Model;
import view.View;

public class Controller{
    private final Model model;
    private final View view;

    public Controller() {
        model = new Model();
        view = new View();
    }

    public void login(String username, String password) {
        // Check if the username and password are valid
        if (isValidLogin(username, password)) {
            view.showMenuPanel(username);
        } else {
            view.showLoginPanel();
        }
    }

    public void searchAnimals(String animalName, String animalType) {
        ResultSet result = model.searchAnimals(animalName, animalType);
        // Display the search results
        if (result.next()) {
            JOptionPane.showMessageDialog(view.frame, "Animal found: " + result.getString("name"));
        } else {
            JOptionPane.showMessageDialog(view.frame, "No animals found");
        }
    }

    public void addEmployee(String employeeName, String employeeRole) {
        // Add the employee to the database
        Statement stmt = model.conn.createStatement();
        stmt.executeUpdate("INSERT INTO employees (name, role) VALUES ('" + employeeName + "', '" + employeeRole + "')");
        // Show a success message
        JOptionPane.showMessageDialog(view.frame, "Employee added successfully");
    }

    private boolean isValidLogin(String username, String password) {
        // Replace this with your actual database query
        return true;
    }

    private static class ResultSet {

        public ResultSet() {
        }

        private String getString(String name) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private boolean next() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class SQLException {

        public SQLException() {
        }

        private String getMessage() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}