import java.awt.*;
import java.awt.event.*;

public class LabActivity4EmpInfoSystemGUI extends Frame implements ActionListener {
    Label lblFirstName, lblLastName, lblAge, lblHours, lblWage, lblOutput;
    TextField txtFirstName, txtLastName, txtAge, txtHours, txtWage;
    TextArea txtResult;
    Button btnSubmit;

    public LabActivity4EmpInfoSystemGUI() {
        setTitle("LabActivity4EmpInfoSystemGUI");
        setSize(400, 400);
        setLayout(new BorderLayout(10, 10)); // Main layout

        // Form Panel
        Panel formPanel = new Panel(new GridLayout(5, 2, 5, 5));

        lblFirstName = new Label("First Name:");
        txtFirstName = new TextField();

        lblLastName = new Label("Last Name:");
        txtLastName = new TextField();

        lblAge = new Label("Age:");
        txtAge = new TextField();

        lblHours = new Label("Hours Worked:");
        txtHours = new TextField();

        lblWage = new Label("Hourly Rate:");
        txtWage = new TextField();

        formPanel.add(lblFirstName); formPanel.add(txtFirstName);
        formPanel.add(lblLastName);  formPanel.add(txtLastName);
        formPanel.add(lblAge);       formPanel.add(txtAge);
        formPanel.add(lblHours);     formPanel.add(txtHours);
        formPanel.add(lblWage);      formPanel.add(txtWage);

        add(formPanel, BorderLayout.NORTH);

        // Submit Button Panel
        Panel buttonPanel = new Panel(new FlowLayout(FlowLayout.CENTER));
        btnSubmit = new Button("Submit");
        btnSubmit.setPreferredSize(new Dimension(80, 30)); // Smaller button
        btnSubmit.addActionListener(this);
        buttonPanel.add(btnSubmit);
        add(buttonPanel, BorderLayout.CENTER);

        // Output Panel
        Panel outputPanel = new Panel(new BorderLayout(5, 5));
        lblOutput = new Label("Output:");
        txtResult = new TextArea("", 4, 40, TextArea.SCROLLBARS_NONE);
        txtResult.setEditable(false);
        outputPanel.add(lblOutput, BorderLayout.NORTH);
        outputPanel.add(txtResult, BorderLayout.CENTER);
        add(outputPanel, BorderLayout.SOUTH);

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String firstName = txtFirstName.getText().trim();
            String lastName = txtLastName.getText().trim();
            int age = Integer.parseInt(txtAge.getText().trim());
            double hours = Double.parseDouble(txtHours.getText().trim());
            double wage = Double.parseDouble(txtWage.getText().trim());

            if (firstName.isEmpty() || lastName.isEmpty()) {
                txtResult.setText("Error: All fields must be filled out.");
                return;
            }
            if (age <= 0 || hours < 0 || wage < 0) {
                txtResult.setText("Error: Age must be positive; hours and wage must be non-negative.");
                return;
            }

            String fullName = firstName + " " + lastName;
            double salary = hours * wage;

            txtResult.setText("Name: " + fullName +
                              "\nAge: " + age + " years old" +
                              "\nDaily Salary: PHP " + String.format("%.2f", salary));
        } catch (NumberFormatException ex) {
            txtResult.setText("Error: Please enter valid numbers.");
        } catch (Exception ex) {
            txtResult.setText("Unexpected error occurred.");
        }
    }

    public static void main(String[] args) {
        new LabActivity4EmpInfoSystemGUI();
    }
}