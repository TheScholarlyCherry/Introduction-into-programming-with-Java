package mp2_brcherry;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnitConverter extends JFrame 
{
    private JTextField inputField;
    private JTextField resultField;
    private JRadioButton milesKilometersRadioButton;
    private JRadioButton celsiusFahrenheitRadioButton;
    private JRadioButton poundsKilogramsRadioButton;

    public UnitConverter() 
    {
        // Set up the frame
        setTitle("Unit Converter");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        JLabel inputLabel = new JLabel("Enter Value:");
        inputField = new JTextField(10);

        JLabel resultLabel = new JLabel("Result:");
        resultField = new JTextField(10);
        resultField.setEditable(false);

        milesKilometersRadioButton = new JRadioButton("Miles to Kilometers");
        celsiusFahrenheitRadioButton = new JRadioButton("Celsius to Fahrenheit");
        poundsKilogramsRadioButton = new JRadioButton("Pounds to Kilograms");

        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(milesKilometersRadioButton);
        radioGroup.add(celsiusFahrenheitRadioButton);
        radioGroup.add(poundsKilogramsRadioButton);

        // Set up layout
        JPanel panel = new JPanel();
        panel.add(inputLabel);
        panel.add(inputField);
        panel.add(resultLabel);
        panel.add(resultField);
        panel.add(milesKilometersRadioButton);
        panel.add(celsiusFahrenheitRadioButton);
        panel.add(poundsKilogramsRadioButton);

        // Add action listeners
        inputField.addActionListener(new ActionListener() 
        {
            
            public void actionPerformed(ActionEvent e) 
            {
                performConversion();
            }
        });

        milesKilometersRadioButton.addActionListener(new ActionListener() 
        {
            
            public void actionPerformed(ActionEvent e) 
            {
                inputLabel.setText("Enter Miles:");
                resultLabel.setText("Kilometers:");
                performConversion();
            }
        });

        celsiusFahrenheitRadioButton.addActionListener(new ActionListener() 
        {
            
            public void actionPerformed(ActionEvent e) 
            {
                inputLabel.setText("Enter Celsius:");
                resultLabel.setText("Fahrenheit:");
                performConversion();
            }
        });

        poundsKilogramsRadioButton.addActionListener(new ActionListener() 
        {
            
            public void actionPerformed(ActionEvent e) 
            {
                inputLabel.setText("Enter Pounds:");
                resultLabel.setText("Kilograms:");
                performConversion();
            }
        });

        // Set default conversion
        milesKilometersRadioButton.setSelected(true);

        // Add panel to frame
        add(panel);

        // Set visible
        setVisible(true);
    }

    private void performConversion() 
    {
        try 
        {
            double inputValue = Double.parseDouble(inputField.getText());
            double resultValue;

            if (milesKilometersRadioButton.isSelected()) 
            {
                resultValue = inputValue * 1.609344; // miles to kilometers
            } else if (celsiusFahrenheitRadioButton.isSelected()) 
            {
                resultValue = (inputValue * 9 / 5) + 32; // Celsius to Fahrenheit
            } else {
                resultValue = inputValue * 0.45359237; // pounds to kilograms
            }

            // Round the result to 2 digits after the decimal point
            resultField.setText(String.format("%.2f", resultValue));
        } catch (NumberFormatException ex) 
        {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
        }
    }

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() 
        {
            
            public void run() 
            {
                new UnitConverter();
            }
        });
    }
}
