import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UniqueToDoListApp {
    private JFrame mainFrame;
    private DefaultTableModel tableModel;
    private JTable taskTable;
    private JFrame inputFrame;

    public UniqueToDoListApp() {
        // initialize the main window
        mainFrame = new JFrame("My Unique To-Do List");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(600, 400);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.getContentPane().setBackground(new Color(220, 240, 255)); // soft blue background

        // table model and JTable setup
        String[] columnNames = {"Task", "Details", "Priority"};
        tableModel = new DefaultTableModel(columnNames, 0);
        taskTable = new JTable(tableModel);
        taskTable.setBackground(new Color(255, 255, 204)); // light yellow
        taskTable.setFillsViewportHeight(true);

        // add components to the main frame
        mainFrame.add(new JScrollPane(taskTable), BorderLayout.CENTER);
        JButton addButton = createAddButton();
        mainFrame.add(addButton, BorderLayout.SOUTH);

        // make the main window visible
        mainFrame.setVisible(true);
    }

    private JButton createAddButton() {
        JButton addButton = new JButton("Add New Task");
        addButton.setBackground(new Color(135, 206, 250)); // sky blue
        addButton.setFocusPainted(false);
        addButton.addActionListener(new AddTaskActionListener());
        return addButton;
    }

    private void openInputForm() {
        // Prevent opening multiple forms
        if (inputFrame != null && inputFrame.isVisible()) {
            return; // do nothing if the form is already open
        }

        // initialize the input form window
        inputFrame = new JFrame("Task Input Form");
        inputFrame.setSize(350, 300);
        inputFrame.setLayout(new GridLayout(5, 2));
        inputFrame.getContentPane().setBackground(new Color(255, 228, 196)); // light peach

        // text fields for task input
        JTextField taskField = new JTextField();
        JTextArea detailArea = new JTextArea(3, 20);
        detailArea.setLineWrap(true);
        detailArea.setWrapStyleWord(true);
        String[] priorities = {"Low", "Medium", "High"};
        JComboBox<String> priorityComboBox = new JComboBox<>(priorities);
        JButton submitButton = createSubmitButton(taskField, detailArea, priorityComboBox);

        // add components to the input frame
        inputFrame.add(new JLabel("Task:"));
        inputFrame.add(taskField);
        inputFrame.add(new JLabel("Details:"));
        inputFrame.add(new JScrollPane(detailArea)); // Use JScrollPane for text area
        inputFrame.add(new JLabel("Priority:"));
        inputFrame.add(priorityComboBox);
        inputFrame.add(submitButton);
        
        // make the input window visible
        inputFrame.setVisible(true);
    }

    private JButton createSubmitButton(JTextField taskField, JTextArea detailArea, JComboBox<String> priorityComboBox) {
        JButton submitButton = new JButton("Add Task");
        submitButton.setBackground(new Color(144, 238, 144)); // light green

        // action listener for the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String taskName = taskField.getText();
                String taskDetails = detailArea.getText();
                String priority = (String) priorityComboBox.getSelectedItem();

                if (!taskName.trim().isEmpty()) {
                    tableModel.addRow(new Object[]{taskName, taskDetails, priority});
                    taskField.setText("");
                    detailArea.setText("");
                    inputFrame.dispose(); // Close input window after adding
                    inputFrame = null; // reset input frame reference
                } else {
                    JOptionPane.showMessageDialog(inputFrame, "Task cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        return submitButton;
    }

    // action listener for the "Add Task" button
    private class AddTaskActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            openInputForm();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(UniqueToDoListApp::new);
    }
}