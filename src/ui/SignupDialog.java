package ui;

import javax.swing.*;
import java.awt.*;

public class SignupDialog extends JDialog {

    private JTextField firstNameField, lastNameField, emailField;
    private JPasswordField passField, confirmPassField;
    private JButton registerBtn;

    public SignupDialog(JFrame parent) {
        super(parent, "Sign Up", true); // true makes the dialog modal

        setTitle("E-Learning Signup");
        setLayout(null);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setResizable(false);

        JLabel label1 = new JLabel("Sign up with email");
        label1.setForeground(Color.black);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 20));
        label1.setBounds(20, 10, 425, 40);
        add(label1);

        JPanel horizontalline = new JPanel();
        horizontalline.setBackground(Color.decode("#8a2be2"));
        horizontalline.setBounds(20, 50, 170, 4);
        add(horizontalline);

        JLabel firstNameLabel = new JLabel("Enter Your First Name");
        firstNameLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        firstNameLabel.setForeground(Color.black);
        firstNameLabel.setBounds(20, 70, 375, 30);
        add(firstNameLabel);

        firstNameField = new JTextField(15);
        firstNameField.setBounds(20, 100, 300, 40);
        firstNameField.setFont(new Font("Arial", Font.PLAIN, 14));
        firstNameField.setBorder(BorderFactory.createLineBorder(Color.decode("#8a2be2"), 2));
        add(firstNameField);

        JLabel lastNameLabel = new JLabel("Enter Your Last Name");
        lastNameLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        lastNameLabel.setForeground(Color.black);
        lastNameLabel.setBounds(20, 150, 375, 30);
        add(lastNameLabel);

        lastNameField = new JTextField(15);
        lastNameField.setBounds(20, 180, 300, 40);
        lastNameField.setFont(new Font("Arial", Font.PLAIN, 14));
        lastNameField.setBorder(BorderFactory.createLineBorder(Color.decode("#8a2be2"), 2));
        add(lastNameField);

        JLabel emailLabel = new JLabel("Enter Your Email");
        emailLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        emailLabel.setForeground(Color.black);
        emailLabel.setBounds(20, 230, 375, 30);
        add(emailLabel);

        emailField = new JTextField(15);
        emailField.setBounds(20, 260, 300, 40);
        emailField.setFont(new Font("Arial", Font.PLAIN, 14));
        emailField.setBorder(BorderFactory.createLineBorder(Color.decode("#8a2be2"), 2));
        add(emailField);

        JLabel passLabel = new JLabel("Password");
        passLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        passLabel.setForeground(Color.black);
        passLabel.setBounds(20, 310, 375, 30);
        add(passLabel);

        passField = new JPasswordField(15);
        passField.setBounds(20, 340, 300, 40);
        passField.setFont(new Font("Arial", Font.PLAIN, 14));
        passField.setBorder(BorderFactory.createLineBorder(Color.decode("#8a2be2"), 2));
        add(passField);

        JLabel confirmPassLabel = new JLabel("Confirm Password");
        confirmPassLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
        confirmPassLabel.setForeground(Color.black);
        confirmPassLabel.setBounds(20, 390, 375, 30);
        add(confirmPassLabel);

        confirmPassField = new JPasswordField(15);
        confirmPassField.setBounds(20, 420, 300, 40);
        confirmPassField.setFont(new Font("Arial", Font.PLAIN, 14));
        confirmPassField.setBorder(BorderFactory.createLineBorder(Color.decode("#8a2be2"), 2));
        add(confirmPassField);

        registerBtn = new JButton("Sign up");
        registerBtn.setFont(new Font("Roboto", Font.BOLD, 20));
        registerBtn.setForeground(Color.white);
        registerBtn.setBackground(Color.decode("#8a2be2"));
        registerBtn.setBounds(20, 490, 300, 40);
        registerBtn.setFocusable(false);
        registerBtn.addActionListener(e -> Signup());
        add(registerBtn);

        setSize(520, 632);
        setLocationRelativeTo(parent);
    }
    private void Signup() {}
}

