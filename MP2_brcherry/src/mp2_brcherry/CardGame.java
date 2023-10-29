package mp2_brcherry;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGame extends JFrame 
{
    private JPanel cardPanel;
    private JButton refreshButton;

    public CardGame() 
    {
        // Set up the frame
        setTitle("Card Game");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        cardPanel = new JPanel(new GridLayout(1, 4));
        refreshButton = new JButton("Refresh");

        // Add action listener to the refresh button
        refreshButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                dealCards();
            }
        });

        // Add components to the frame
        add(cardPanel, BorderLayout.CENTER);
        add(refreshButton, BorderLayout.SOUTH);

        // Initial deal of face-down cards
        dealCards();

        // Set visible
        setVisible(true);
    }

    private void dealCards() 
    {
        // Clear the card panel
        cardPanel.removeAll();

        // Get a list of card numbers and shuffle them
        List<Integer> cardNumbers = new ArrayList<>();
        for (int i = 1; i <= 52; i++) 
        {
            cardNumbers.add(i);
        }
        Collections.shuffle(cardNumbers);

        // Deal four face-down cards
        for (int i = 0; i < 4; i++) 
        {
            int cardNumber = cardNumbers.get(i);
            String faceDownImagePath = "mp2_brcherry/CardImages/back.png"; // Assume a back image for face-down cards

            // Create a face-down card
            JButton cardButton = new JButton(new ImageIcon(getClass().getClassLoader().getResource(faceDownImagePath)));
            cardButton.addActionListener(new CardClickListener(cardNumber, cardButton));
            cardPanel.add(cardButton);
        }

        // Repaint the panel
        cardPanel.revalidate();
        cardPanel.repaint();
    }

    private class CardClickListener implements ActionListener 
    {
        private int cardNumber;
        private JButton cardButton;

        public CardClickListener(int cardNumber, JButton cardButton) 
        {
            this.cardNumber = cardNumber;
            this.cardButton = cardButton;
        }

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            // When a card is clicked, reveal its face
            String faceImagePath = "mp2_brcherry/CardImages/" + cardNumber + ".png";
            cardButton.setIcon(new ImageIcon(getClass().getClassLoader().getResource(faceImagePath)));
        }
    }

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                new CardGame();
            }
        });
    }
}
