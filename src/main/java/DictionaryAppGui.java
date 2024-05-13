import netscape.javascript.JSObject;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class DictionaryAppGui extends JFrame {

        private JSObject dictionaryData;

        public DictionaryAppGui(){
            super("Dictionary");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(450,600);
            setLocationRelativeTo(null);
            setLayout(null);
            setResizable(false);

            addGuiComponets();
        }

    private void addGuiComponets() {
            //Search filed
            JTextField searchTextField = new JTextField();
            searchTextField.setBounds(15,15,350,45);
            searchTextField.setFont(new Font("Dialog", Font.PLAIN,24));
            add(searchTextField);

            //Meanings text
            JLabel meanings = new JLabel("play");
            meanings.setBounds(0,350,450,54);
            meanings.setFont(new Font("Dialog", Font.BOLD,48));
            meanings.setHorizontalAlignment(SwingConstants.CENTER);
            add(meanings);

            //Seach Button

            JButton seachButton = new JButton(loadImage("src/main/java/assets/search.png"));
            seachButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            seachButton.setBounds(375,13,47,45);
            seachButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String userInput = searchTextField.getText();
                    if (userInput.replaceAll("\\s", "").length() <= 0){
                        return;
                    }
                    //dictionaryData = DictionaryApp.getDictionaryData(userInput);
                }
            });
    }

    private ImageIcon loadImage (String resourcePath){
            try {
                BufferedImage image = ImageIO.read(new File(resourcePath));
                return new ImageIcon(image);
            } catch (IOException e){
                e.printStackTrace();
            }
            System.out.println("Could not find resource");
            return null;
        }

}
