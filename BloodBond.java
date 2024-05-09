
/*After updating your provided code some other errors is appeared. I am given the error massage at the end of the code block.*/
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
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
        signupPanel = new JPanel(new GridBagLayout()); // Re-initialize to prevent null references
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel nameLabel = new JLabel("Name:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        signupPanel.add(nameLabel, gbc);

        JTextField nameField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        signupPanel.add(nameField, gbc);

        JLabel emailLabel = new JLabel("Email:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        signupPanel.add(emailLabel, gbc);

        JTextField emailField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        signupPanel.add(emailField, gbc);

        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        signupPanel.add(phoneNumberLabel, gbc);

        JTextField phoneNumberField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        signupPanel.add(phoneNumberField, gbc);

        JLabel ageLabel = new JLabel("Age:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        signupPanel.add(ageLabel, gbc);

        JTextField ageField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 3;
        signupPanel.add(ageField, gbc);

        JLabel genderLabel = new JLabel("Gender:");
        gbc.gridx = 0;
        gbc.gridy = 4;
        signupPanel.add(genderLabel, gbc);

        String[] genders = { "Male", "Female", "Other" };
        JComboBox<String> genderComboBox = new JComboBox<>(genders);
        gbc.gridx = 1;
        gbc.gridy = 4;
        signupPanel.add(genderComboBox, gbc);

        JLabel heightLabel = new JLabel("Height (ft):");
        gbc.gridx = 0;
        gbc.gridy = 5;
        signupPanel.add(heightLabel, gbc);

        JTextField heightField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 5;
        signupPanel.add(heightField, gbc);

        JLabel weightLabel = new JLabel("Weight (kg):");
        gbc.gridx = 0;
        gbc.gridy = 6;
        signupPanel.add(weightLabel, gbc);

        JTextField weightField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 6;
        signupPanel.add(weightField, gbc);

        JLabel bloodGroupLabel = new JLabel("Blood Group:");
        gbc.gridx = 0;
        gbc.gridy = 7;
        signupPanel.add(bloodGroupLabel, gbc);

        String[] bloodGroups = { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" };
        JComboBox<String> bloodGroupComboBox = new JComboBox<>(bloodGroups);
        gbc.gridx = 1;
        gbc.gridy = 7;
        signupPanel.add(bloodGroupComboBox, gbc);

        JLabel addressLabel = new JLabel("Address:");
        gbc.gridx = 0;
        gbc.gridy = 8;
        signupPanel.add(addressLabel, gbc);

        JTextArea addressField = new JTextArea(5, 20);
        gbc.gridx = 1;
        gbc.gridy = 8;
        signupPanel.add(new JScrollPane(addressField), gbc);

        JLabel preferredContactMethodLabel = new JLabel("Preferred Contact Method:");
        gbc.gridx = 0;
        gbc.gridy = 9;
        signupPanel.add(preferredContactMethodLabel, gbc);

        String[] contactMethods = { "Email", "Phone", "Text Message" };
        JComboBox<String> contactMethodComboBox = new JComboBox<>(contactMethods);
        gbc.gridx = 1;
        gbc.gridy = 9;
        signupPanel.add(contactMethodComboBox, gbc);

        JLabel availableForDonationLabel = new JLabel("Available for Donation:");
        gbc.gridx = 0;
        gbc.gridy = 10;
        signupPanel.add(availableForDonationLabel, gbc);

        JCheckBox availableForDonationCheckBox = new JCheckBox();
        gbc.gridx = 1;
        gbc.gridy = 10;
        signupPanel.add(availableForDonationCheckBox, gbc);

        JLabel lastDonationDateLabel = new JLabel("Date of Last Donation:");
        gbc.gridx = 0;
        gbc.gridy = 11;
        signupPanel.add(lastDonationDateLabel, gbc);

        JTextField lastDonationDateField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 11;
        signupPanel.add(lastDonationDateField, gbc);

        JLabel medicalConditionsLabel = new JLabel("Medical Conditions:");
        gbc.gridx = 0;
        gbc.gridy = 12;
        signupPanel.add(medicalConditionsLabel, gbc);

        JTextArea medicalConditionsField = new JTextArea(5, 20);
        gbc.gridx = 1;
        gbc.gridy = 12;
        signupPanel.add(new JScrollPane(medicalConditionsField), gbc);

        JLabel preferredDonationMethodLabel = new JLabel("Preferred Donation Method:");
        gbc.gridx = 0;
        gbc.gridy = 13;
        signupPanel.add(preferredDonationMethodLabel, gbc);

        String[] donationMethods = { "Whole Blood", "Platelets", "Plasma" };
        JComboBox<String> donationMethodComboBox = new JComboBox<>(donationMethods);
        gbc.gridx = 1;
        gbc.gridy = 13;
        signupPanel.add(donationMethodComboBox, gbc);

        JLabel healthAndSafetyAgreementsLabel = new JLabel("Health and Safety Agreements:");
        gbc.gridx = 0;
        gbc.gridy = 14;
        signupPanel.add(healthAndSafetyAgreementsLabel, gbc);

        JCheckBox healthAndSafetyAgreementsCheckBox = new JCheckBox();
        gbc.gridx = 1;
        gbc.gridy = 14;
        signupPanel.add(healthAndSafetyAgreementsCheckBox, gbc);

        JLabel volunteerInterestsLabel = new JLabel("Volunteer Interests:");
        gbc.gridx = 0;
        gbc.gridy = 15;
        signupPanel.add(volunteerInterestsLabel, gbc);

        JCheckBox volunteerInterestsCheckBox = new JCheckBox();
        gbc.gridx = 1;
        gbc.gridy = 15;
        signupPanel.add(volunteerInterestsCheckBox, gbc);

        JLabel emergencyContactLabel = new JLabel("Emergency Contact:");
        gbc.gridx = 0;
        gbc.gridy = 16;
        signupPanel.add(emergencyContactLabel, gbc);

        JTextField emergencyContactField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 16;
        signupPanel.add(emergencyContactField, gbc);

        // Set the background color
        signupPanel.setBackground(new Color(237, 242, 244)); // Light white background

        // Set the text color
        nameLabel.setForeground(new Color(204, 0, 0)); // Dark red text
        nameField.setForeground(new Color(204, 0, 0)); // Dark red text
        emailLabel.setForeground(new Color(204, 0, 0)); // Dark red text
        emailField.setForeground(new Color(204, 0, 0)); // Dark red text
        phoneNumberLabel.setForeground(new Color(204, 0, 0)); // Dark red text
        phoneNumberField.setForeground(new Color(204, 0, 0)); // Dark red text
        ageLabel.setForeground(new Color(204, 0, 0)); // Dark red text
        ageField.setForeground(new Color(204, 0, 0)); // Dark red text
        genderLabel.setForeground(new Color(204, 0, 0)); // Dark red text
        genderComboBox.setForeground(new Color(204, 0, 0)); // Dark red text
        heightLabel.setForeground(new Color(204, 0, 0)); // Dark red text
        heightField.setForeground(new Color(204, 0, 0)); // Dark red text
        weightLabel.setForeground(new Color(204, 0, 0)); // Dark red text
        weightField.setForeground(new Color(204, 0, 0)); // Dark red text
        bloodGroupLabel.setForeground(new Color(204, 0, 0)); // Dark red text
        bloodGroupComboBox.setForeground(new Color(204, 0, 0)); // Dark red text
        addressLabel.setForeground(new Color(204, 0, 0)); // Dark red text
        addressField.setForeground(new Color(204, 0, 0)); // Dark red text
        preferredContactMethodLabel.setForeground(new Color(204, 0, 0)); // Dark red text
        contactMethodComboBox.setForeground(new Color(204, 0, 0)); // Dark red text
        availableForDonationLabel.setForeground(new Color(204, 0, 0)); // Dark red text
        availableForDonationCheckBox.setForeground(new Color(204, 0, 0)); // Dark red text
        lastDonationDateLabel.setForeground(new Color(204, 0, 0)); // Darkred text
        lastDonationDateField.setForeground(new Color(204, 0, 0)); // Dark red text
        medicalConditionsLabel.setForeground(new Color(204, 0, 0)); // Dark red text
        medicalConditionsField.setForeground(new Color(204, 0, 0)); // Dark red text
        preferredDonationMethodLabel.setForeground(new Color(204, 0, 0)); // Dark red text
        donationMethodComboBox.setForeground(new Color(204, 0, 0)); // Dark red text
        healthAndSafetyAgreementsLabel.setForeground(new Color(204, 0, 0)); // Dark red text
        healthAndSafetyAgreementsCheckBox.setForeground(new Color(204, 0, 0)); // Dark red text
        volunteerInterestsLabel.setForeground(new Color(204, 0, 0)); // Dark red text
        volunteerInterestsCheckBox.setForeground(new Color(204, 0, 0)); // Dark red text
        emergencyContactLabel.setForeground(new Color(204, 0, 0)); // Dark red text
        emergencyContactField.setForeground(new Color(204, 0, 0)); // Dark red text

        JButton signupSubmitButton = new JButton("SignUp");
        gbc.gridx = 1;
        gbc.gridy = 2;
        loginPanel.add(signupSubmitButton, gbc);
        JButton backToHomeButton = new JButton("Back to Home");
        backToHomeButton.addActionListener(e -> showPanel("home"));
        gbc.gridx = 1;
        gbc.gridy = 3;
        loginPanel.add(backToHomeButton, gbc);

    }

    private void showPanel(String panelName) {
        CardLayout cl = (CardLayout) frame.getContentPane().getLayout();
        cl.show(frame.getContentPane(), panelName);
    }
}

// Errors showing after run
/*
 * Error: Could not find or load main class tempCodeRunnerFile
 * Caused by: java.lang.ClassNotFoundException: tempCodeRunnerFile
 */