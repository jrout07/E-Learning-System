package ui;

import javax.swing.*;
import java.awt.*;

public class LoginDialog extends JDialog {

    JTextField emailField;
    JPasswordField passField;
    JButton loginBtn, signupBtn;

    public LoginDialog(JFrame parent) {
        super(parent, "E-Learning Login", true); // Modal dialog
        setLayout(null);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setResizable(false);

        JLabel label1 = new JLabel("Welcome!");
        label1.setForeground(Color.black);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(20, 180, 425, 40);
        add(label1);

        JPanel verticalline = new JPanel();
        verticalline.setBackground(Color.decode("#8a2be2"));
        verticalline.setBounds(250, 0, 6, 480);
        add(verticalline);

        JLabel emaillabel = new JLabel("Email");
        emaillabel.setFont(new Font("Roboto", Font.PLAIN, 20));
        emaillabel.setForeground(Color.black);
        emaillabel.setBounds(310, 50, 375, 30);
        add(emaillabel);

        emailField = new JTextField(15);
        emailField.setBounds(310, 90, 300, 40);
        emailField.setFont(new Font("Arial", Font.PLAIN, 14));
        emailField.setBorder(BorderFactory.createLineBorder(Color.decode("#8a2be2"), 2));
        add(emailField);

        JLabel passlabel = new JLabel("Password:");
        passlabel.setFont(new Font("Roboto", Font.PLAIN, 20));
        passlabel.setForeground(Color.black);
        passlabel.setBounds(310, 135, 375, 30);
        add(passlabel);

        passField = new JPasswordField(15);
        passField.setBounds(310, 175, 300, 40);
        passField.setBorder(BorderFactory.createLineBorder(Color.decode("#8a2be2"), 2));
        passField.setFont(new Font("Arial", Font.PLAIN, 14));
        add(passField);

        loginBtn = new JButton("Login");
        loginBtn.setFont(new Font("Roboto", Font.BOLD, 20));
        loginBtn.setForeground(Color.white);
        loginBtn.setBackground(Color.decode("#8a2be2"));
        loginBtn.setBounds(310, 250, 300, 40);
        loginBtn.setFocusable(false);
        loginBtn.addActionListener(e -> login());
        add(loginBtn);

        JLabel signupText = new JLabel("Don't have an account?");
        signupText.setFont(new Font("Roboto", Font.PLAIN, 20));
        signupText.setForeground(Color.black);
        signupText.setBounds(360, 300, 375, 30);
        add(signupText);

        signupBtn = new JButton("Sign up");
        signupBtn.setFont(new Font("Roboto", Font.BOLD, 20));
        signupBtn.setForeground(Color.white);
        signupBtn.setBackground(Color.decode("#8a2be2"));
        signupBtn.setFocusable(false);
        signupBtn.setBounds(310, 350, 300, 40);
        signupBtn.addActionListener(e -> {
            this.dispose();
            SignupDialog signupDialog = new SignupDialog(parent);
            signupDialog.setVisible(true);
        });
        add(signupBtn);

        try {
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/WhiteSignupBG.png"));
            Image i2 = i1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(0, 0, 850, 480);
            add(image);
        } catch (Exception _) {

        }

        setSize(850, 480);
        setLocationRelativeTo(parent);
    }

    private void login() {
        String email = emailField.getText().trim();
        String password = new String(passField.getPassword()).trim();

        if (email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter both Email and Password.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Login Successful!\nEmail: " + email);
            this.dispose();
        }
    }
}
