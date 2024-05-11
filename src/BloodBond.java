import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class BloodBond {

    private JFrame frame;
    private JPanel homePanel;
    private JPanel loginPanel;
    private JPanel signupPanel;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                BloodBond window = new BloodBond();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public BloodBond() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("BloodBond");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Full-screen mode

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();
        menuBar.setPreferredSize(new Dimension(0, 65)); // Reduced the height of the menu bar
        frame.setJMenuBar(menuBar);

        // Initialize left panel with buttons
        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        leftPanel.setBorder(BorderFactory.createEmptyBorder(10, 40, 10, 20)); // Add 20px margin to the left and right
                                                                              // sides

        JButton homeButton = new JButton("Home");
        homeButton.addActionListener(e -> showPanel("home"));
        homeButton.setFont(new Font("Arial", Font.BOLD, 20)); // Increase the font size
        homeButton.setMargin(new Insets(5, 5, 5, 5)); // Add padding around the button text
        homeButton.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(43, 45, 66)), // gray border
                BorderFactory.createEmptyBorder(5, 5, 5, 5))); // Add border and padding
        homeButton.setBackground(new Color(237, 242, 244)); // Light white background
        homeButton.setForeground(new Color(239, 35, 60)); // Red text
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeButton.setBackground(new Color(141, 153, 174)); // Darker hover effect
                homeButton.setForeground(new Color(237, 242, 244));
                // on hover text color
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeButton.setBackground(new Color(237, 242, 244)); // Reset background color
                homeButton.setForeground(new Color(239, 35, 60)); // Reset text color
            }
        });
        leftPanel.add(homeButton);

        JButton findBloodButton = new JButton("Find Blood");
        findBloodButton.addActionListener(e -> showPanel("findBlood"));
        findBloodButton.setFont(new Font("Arial", Font.BOLD, 20)); // Increase the font size
        findBloodButton.setMargin(new Insets(5, 5, 5, 5)); // Add padding around the button text
        findBloodButton.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(43, 45, 66)), // gray border
                BorderFactory.createEmptyBorder(5, 5, 5, 5))); // Add border and padding
        findBloodButton.setBackground(new Color(237, 242, 244)); // Light white background
        findBloodButton.setForeground(new Color(239, 35, 60)); // Red text
        findBloodButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                findBloodButton.setBackground(new Color(141, 153, 174)); // Darker hover effect
                findBloodButton.setForeground(new Color(237, 242, 244));
                // on hover text color
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                findBloodButton.setBackground(new Color(237, 242, 244)); // Reset background color
                findBloodButton.setForeground(new Color(239, 35, 60)); // Reset text color
            }
        });
        leftPanel.add(findBloodButton);

        JButton emergencyButton = new JButton("Emergency");
        emergencyButton.addActionListener(e -> showPanel("emergency"));
        emergencyButton.setFont(new Font("Arial", Font.BOLD, 20)); // Increase the font size
        emergencyButton.setMargin(new Insets(5, 5, 5, 5)); // Add padding around the button text
        emergencyButton.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(43, 45, 66)), // gray border
                BorderFactory.createEmptyBorder(5, 5, 5, 5))); // Add border and padding
        emergencyButton.setBackground(new Color(237, 242, 244)); // Light white background
        emergencyButton.setForeground(new Color(239, 35, 60)); // Red text
        emergencyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                emergencyButton.setBackground(new Color(141, 153, 174)); // Darker hover effect
                emergencyButton.setForeground(new Color(237, 242, 244));
                // on hover text color
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                emergencyButton.setBackground(new Color(237, 242, 244)); // Reset background color
                emergencyButton.setForeground(new Color(239, 35, 60)); // Reset text color
            }
        });
        leftPanel.add(emergencyButton);

        JButton othersButton = new JButton("Others");
        othersButton.addActionListener(e -> showPanel("others"));
        othersButton.setFont(new Font("Arial", Font.BOLD, 20)); // Increase the font size
        othersButton.setMargin(new Insets(5, 5, 5, 5)); // Add padding around the button text
        othersButton.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(43, 45, 66)), // gray border
                BorderFactory.createEmptyBorder(5, 5, 5, 5))); // Add border and padding
        othersButton.setBackground(new Color(237, 242, 244)); // Light white background
        othersButton.setForeground(new Color(239, 35, 60)); // Red text
        othersButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                othersButton.setBackground(new Color(141, 153, 174)); // Darker hover effect
                othersButton.setForeground(new Color(237, 242, 244));
                // on hover text color
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                othersButton.setBackground(new Color(237, 242, 244)); // Reset background color
                othersButton.setForeground(new Color(239, 35, 60)); // Reset text color
            }
        });
        leftPanel.add(othersButton);

        menuBar.add(leftPanel);

        // Initialize right panel with login and signup buttons
        JPanel rightPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        rightPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 40)); // Add 20px margin to the left and right
                                                                               // sides

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(e -> showPanel("login"));
        loginButton.setFont(new Font("Arial", Font.BOLD, 20)); // Increase the font size
        loginButton.setMargin(new Insets(5, 5, 5, 5)); // Add padding around the button text
        loginButton.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(43, 45, 66)), // gray border
                BorderFactory.createEmptyBorder(5, 5, 5, 5))); // Add border and padding
        loginButton.setBackground(new Color(237, 242, 244)); // Light white background
        loginButton.setForeground(new Color(239, 35, 60)); // Red text
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButton.setBackground(new Color(141, 153, 174)); // Darker hover effect
                loginButton.setForeground(new Color(237, 242, 244));
                // on hover text color
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButton.setBackground(new Color(237, 242, 244)); // Reset background color
                loginButton.setForeground(new Color(239, 35, 60)); // Reset text color
            }
        });

        JButton signUpButton = new JButton("Sign Up");
        signUpButton.addActionListener(e -> showPanel("signup"));
        signUpButton.setFont(new Font("Arial", Font.BOLD, 20)); // Increase the font size
        signUpButton.setMargin(new Insets(5, 5, 5, 5)); // Add padding around the button text
        signUpButton.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(43, 45, 66)), // gray border
                BorderFactory.createEmptyBorder(5, 5, 5, 5))); // Add border and padding
        signUpButton.setBackground(new Color(237, 242, 244)); // Light white background
        signUpButton.setForeground(new Color(239, 35, 60)); // Red text
        signUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signUpButton.setBackground(new Color(141, 153, 174)); // Darker hover effect
                signUpButton.setForeground(new Color(237, 242, 244));
                // on hover text color
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                signUpButton.setBackground(new Color(237, 242, 244)); // Reset background color
                signUpButton.setForeground(new Color(239, 35, 60)); // Reset text color
            }
        });

        // Find blood panel
        JPanel findBloodPanel = new JPanel();
        findBloodPanel.setLayout(new FlowLayout()); // You can choose a different layout if needed
        leftPanel.add(findBloodPanel); // Add findBloodPanel to the rightPanel

        // Initially set findBloodPanel to invisible
        findBloodPanel.setVisible(false);

        // Add findBloodPanel to the main frame
        frame.add(findBloodPanel, BorderLayout.EAST); // Adjust the layout as needed

        // Create the blood group combo box
        String[] bloodGroups = { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" };
        JComboBox<String> bloodGroupComboBox = new JComboBox<>(bloodGroups);

        // Create the search icon (you can use any icon you like)
        ImageIcon searchIcon = new ImageIcon("16x16.png");
        JButton searchButton = new JButton(searchIcon);

        // Add the combo box and search button to the panel
        findBloodPanel.add(bloodGroupComboBox);
        findBloodPanel.add(searchButton);

        searchButton.addActionListener(e -> {
            // Get the selected blood group
            String selectedBloodGroup = (String) bloodGroupComboBox.getSelectedItem();
            // Fetch live location of donors based on the selected blood group
            // Update the map with donor locations (using Google Maps API)
            // Usage example:
            String apiKey = "AIzaSyAa2Btly3x1sfLRthTbIILcfClMov59_ko";
            LocationService locationService = new LocationService(apiKey);
            locationService.getAddressCoordinates("1600 Amphitheatre Parkway, Mountain View, CA");

            // Other methods and components of your class..
        });

        // Action listener for the findBloodButton
        findBloodButton.addActionListener(e -> {
            // Toggle the visibility of findBloodPanel
            findBloodPanel.setVisible(!findBloodPanel.isVisible());
            frame.revalidate();
            frame.repaint();
        });

        // Refresh the frame to update UI
        frame.revalidate();
        frame.repaint();

        // login panel
        JPanel loginSignupPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        loginSignupPanel.add(loginButton);
        loginSignupPanel.add(signUpButton);

        rightPanel.add(loginSignupPanel);

        menuBar.add(rightPanel);

        // Initialize the home panel
        homePanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(20, 10, 10, 10); // Increased top padding
        gbc.anchor = GridBagConstraints.CENTER;

        JLabel heading = new JLabel("A Bond of Blood, A Bond of Hope");
        heading.setFont(new Font("Arial", Font.BOLD, 50));
        heading.setForeground(new Color(239, 35, 60));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 0;
        homePanel.add(heading, gbc);

        // Create the paragraph with margins and "justification"
        JTextArea paragraph = new JTextArea(
                "At BloodBond, we believe that every blood donation creates a powerful connection—a bond of hope that can change lives. "
                        + "Our mission is to bring together selfless blood donors with patients in urgent need of transfusions, creating a seamless and compassionate network. "
                        + "By becoming a part of Us, you join a community dedicated to the well-being of others, where every drop donated is a symbol of care, compassion and commitment. "
                        + "As a BloodBond donor, you have the power to make a real difference. Our platform matches you with those in need based on blood type, location, and urgency. "
                        + "With real-time notifications, secure communication, and tracking of your donation's impact, you can see firsthand how your contribution transforms lives. "
                        + "Join us in creating a legacy of empathy and humanity.");
        paragraph.setEditable(false);
        paragraph.setFont(new Font("Arial", Font.PLAIN, 20)); // Half the heading's font size
        paragraph.setLineWrap(true);
        paragraph.setWrapStyleWord(true);
        paragraph.setAlignmentX(Component.CENTER_ALIGNMENT); // Center the entire JTextArea
        paragraph.setBackground(new Color(238, 238, 238)); // Light white background
        paragraph.setForeground(new Color(43, 45, 66)); // Dark red text

        JScrollPane scrollPane = new JScrollPane(paragraph);
        scrollPane.setBorder(null);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);

        // Add margins for the paragraph
        scrollPane.setViewportBorder(BorderFactory.createEmptyBorder(10, 100, 20, 100)); // Margins on both sides

        // Add paragraph to the home panel
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.weighty = 0;
        gbc.insets = new Insets(5, 10, 10, 10); // Reduced space between paragraph and buttons
        homePanel.add(scrollPane, gbc);

        // Create the learn more and about us buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton learnMoreButton = new JButton("Learn More");
        JButton aboutUsButton = new JButton("About Us");

        learnMoreButton.addActionListener(e -> showPanel("learnMore"));
        aboutUsButton.addActionListener(e -> showPanel("aboutUs"));

        learnMoreButton.setFont(new Font("Arial", Font.BOLD, 20)); // Increase the font size
        learnMoreButton.setMargin(new Insets(5, 5, 5, 5)); // Add padding around the button text
        learnMoreButton.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(43, 45, 66)), // gray border
                BorderFactory.createEmptyBorder(5, 5, 5, 5))); // Add border and padding
        learnMoreButton.setBackground(new Color(237, 242, 244)); // Light white background
        learnMoreButton.setForeground(new Color(239, 35, 60)); // Red text
        learnMoreButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                learnMoreButton.setBackground(new Color(141, 153, 174)); // Darker hover effect
                learnMoreButton.setForeground(new Color(237, 242, 244));
                // on hover text color
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                learnMoreButton.setBackground(new Color(237, 242, 244)); // Reset background color
                learnMoreButton.setForeground(new Color(239, 35, 60)); // Reset text color
            }
        });

        aboutUsButton.setFont(new Font("Arial", Font.BOLD, 20)); // Increase the font size
        aboutUsButton.setMargin(new Insets(5, 5, 5, 5)); // Add padding around the button text
        aboutUsButton.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(43, 45, 66)), // gray border
                BorderFactory.createEmptyBorder(5, 5, 5, 5))); // Add border and padding
        aboutUsButton.setBackground(new Color(237, 242, 244)); // Light white background
        aboutUsButton.setForeground(new Color(239, 35, 60)); // Red text
        aboutUsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutUsButton.setBackground(new Color(141, 153, 174)); // Darker hover effect
                aboutUsButton.setForeground(new Color(237, 242, 244));
                // on hover text color
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutUsButton.setBackground(new Color(237, 242, 244)); // Reset background color
                aboutUsButton.setForeground(new Color(239, 35, 60)); // Reset text color
            }
        });

        buttonPanel.add(learnMoreButton);
        buttonPanel.add(aboutUsButton);

        // Add button panel to the home panel
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        homePanel.add(buttonPanel, gbc);

        // Initialize login and signup panels
        initializeLoginPanel();
        initializeSignupPanel();

        // Set up CardLayout
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new CardLayout());

        contentPane.add(homePanel, "home");
        contentPane.add(loginPanel, "login");
        contentPane.add(signupPanel, "signup");

        // Show the home panel by default
        showPanel("home");
    }

    private void initializeLoginPanel() {
        loginPanel = new JPanel(new GridBagLayout()); // Re-initialize to prevent null references
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel emailLabel = new JLabel("Email:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        loginPanel.add(emailLabel, gbc);

        JTextField emailField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        loginPanel.add(emailField, gbc);

        JLabel passwordLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        loginPanel.add(passwordLabel, gbc);

        JPasswordField passwordField = new JPasswordField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        loginPanel.add(passwordField, gbc);

        JButton loginSubmitButton = new JButton("Login");
        gbc.gridx = 1;
        gbc.gridy = 2;
        loginPanel.add(loginSubmitButton, gbc);
        JButton backToHomeButton = new JButton("Back to Home");
        backToHomeButton.addActionListener(e -> showPanel("home"));
        gbc.gridx = 1;
        gbc.gridy = 3;
        loginPanel.add(backToHomeButton, gbc);

        // Set the background color
        loginPanel.setBackground(new Color(237, 242, 244)); // Light white background

        // Set the text color
        emailLabel.setForeground(new Color(204, 0, 0)); // Dark red text
        emailField.setForeground(new Color(204, 0, 0)); // Dark red text
        passwordLabel.setForeground(new Color(204, 0, 0)); // Dark red text
        passwordField.setForeground(new Color(204, 0, 0)); // Dark red text
        loginSubmitButton.setForeground(new Color(239, 35, 60)); // Red text
        backToHomeButton.setForeground(new Color(239, 35, 60)); // Red text
    }

    private void initializeSignupPanel() {

        signupPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        int TEXT_FIELD_COLUMNS = 20;
        int LABEL_WIDTH = 100;
        int COMPONENT_HEIGHT = 25;

        // Create labels and text fields
        createLabelAndTextField("Name:", gbc, 0, 0, TEXT_FIELD_COLUMNS);
        createLabelAndTextField("Email:", gbc, 0, 1, TEXT_FIELD_COLUMNS);
        createLabelAndTextField("Phone Number:", gbc, 0, 2, TEXT_FIELD_COLUMNS);
        // Date Field
        JLabel dateOfBirthLabel = new JLabel("Date of birth:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        signupPanel.add(dateOfBirthLabel, gbc);

        try {
            MaskFormatter dateFormatter = new MaskFormatter("##/##/####");
            dateFormatter.setPlaceholderCharacter('_');
            JFormattedTextField dateField = new JFormattedTextField(dateFormatter);
            gbc.gridx = 1;
            gbc.gridy = 3;
            signupPanel.add(dateField, gbc);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        createLabelAndTextField("Age:", gbc, 0, 4, TEXT_FIELD_COLUMNS);
        // ...
        // Create combo boxes
        createComboBox("Gender:", gbc, 0, 5, new String[] { "Male", "Female", "Other" });
        createComboBox("Blood Group:", gbc, 0, 6, new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" });
        // ...

        // Create labels and text fields
        createLabelAndTextField("Height (Feet):", gbc, 0, 7, TEXT_FIELD_COLUMNS);
        createLabelAndTextField("Weight (kg):", gbc, 0, 8, TEXT_FIELD_COLUMNS);
        createLabelAndTextField("Address:", gbc, 0, 9, TEXT_FIELD_COLUMNS);

        // Create combo boxes
        createComboBox("Preferred Contact Method:", gbc, 0, 10, new String[] { "Call", "Message", "Email" });
        createComboBox("Preferred Contact Method:", gbc, 0, 11, new String[] { "Always ready", "Yes", "No", "Later" });

        // Date Field
        JLabel lastDonationDate = new JLabel("Last donation date:");
        gbc.gridx = 0;
        gbc.gridy = 12;
        signupPanel.add(lastDonationDate, gbc);

        try {
            MaskFormatter dateFormatter = new MaskFormatter("##/##/####");
            dateFormatter.setPlaceholderCharacter('_');
            JFormattedTextField dateField = new JFormattedTextField(dateFormatter);
            gbc.gridx = 1;
            gbc.gridy = 12;
            signupPanel.add(dateField, gbc);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Create labels and text fields
        createLabelAndTextField("Medical Conditions:", gbc, 0, 13, TEXT_FIELD_COLUMNS);
        createLabelAndTextField("Emergency Contact:", gbc, 0, 14, TEXT_FIELD_COLUMNS);

        // combo box
        createComboBox("Preferred Donation Method:", gbc, 0, 15, new String[] { "Whole Blood", "Platelets", "Plasma" });

        // CheckBox
        JLabel agreeToTermsLabel = new JLabel("I agree to the terms and conditions:");
        gbc.gridx = 0;
        gbc.gridy = 16;
        signupPanel.add(agreeToTermsLabel, gbc);

        JCheckBox agreeToTermsCheckBox = new JCheckBox();
        gbc.gridx = 1;
        gbc.gridy = 16;
        signupPanel.add(agreeToTermsCheckBox, gbc);
        //
        JLabel healthAgreement = new JLabel("Health and Safety Agreements:");
        gbc.gridx = 0;
        gbc.gridy = 17;
        signupPanel.add(healthAgreement, gbc);

        JCheckBox healthAgreementCheckbox = new JCheckBox();
        gbc.gridx = 1;
        gbc.gridy = 17;
        signupPanel.add(healthAgreementCheckbox, gbc);
        //
        JLabel volunteer = new JLabel("Volunteer Interests:");
        gbc.gridx = 0;
        gbc.gridy = 18;
        signupPanel.add(volunteer, gbc);

        JCheckBox volunteerCheckbox = new JCheckBox();
        gbc.gridx = 1;
        gbc.gridy = 18;
        signupPanel.add(volunteerCheckbox, gbc);

        // Create buttons
        JButton signupSubmitButton = new JButton("SignUp");
        gbc.gridx = 1;
        gbc.gridy = 19;
        gbc.anchor = GridBagConstraints.EAST;
        signupPanel.add(signupSubmitButton, gbc);

        JButton backToHomeButton = new JButton("Back to Home");
        backToHomeButton.addActionListener(e -> showPanel("home"));
        gbc.gridx = 1;
        gbc.gridy = 20;
        gbc.anchor = GridBagConstraints.EAST;
        signupPanel.add(backToHomeButton, gbc);

        // Set background and text colors
        signupPanel.setBackground(new Color(237, 242, 244));
        setComponentForegroundColor(new Color(204, 0, 0), signupPanel);
    }

    private void createLabelAndTextField(String label, GridBagConstraints gbc, int x, int y, int TEXT_FIELD_COLUMNS) {
        JLabel jLabel = new JLabel(label);
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.anchor = GridBagConstraints.WEST;
        signupPanel.add(jLabel, gbc);

        JTextField jTextField = new JTextField(TEXT_FIELD_COLUMNS);
        jTextField.setPreferredSize(new Dimension(250, 30)); // Set preferred size
        gbc.gridx = x + 1;
        gbc.gridy = y;
        gbc.anchor = GridBagConstraints.WEST;
        signupPanel.add(jTextField, gbc);
    }

    private void createComboBox(String label, GridBagConstraints gbc, int x, int y, String[] options) {
        JLabel jLabel = new JLabel(label);
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.anchor = GridBagConstraints.WEST;
        signupPanel.add(jLabel, gbc);

        JComboBox<String> jComboBox = new JComboBox<>(options);
        gbc.gridx = x + 1;
        gbc.gridy = y;
        gbc.anchor = GridBagConstraints.WEST;
        signupPanel.add(jComboBox, gbc);
    }

    private void setComponentForegroundColor(Color color, Container container) {
        for (Component component : container.getComponents()) {
            if (component instanceof JLabel || component instanceof JTextField || component instanceof JComboBox) {
                component.setForeground(color);
            }
        }
    }

    private void showPanel(String panelName) {
        CardLayout cl = (CardLayout) frame.getContentPane().getLayout();
        cl.show(frame.getContentPane(), panelName);
    }
}
