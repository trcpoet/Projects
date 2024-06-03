import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class ConvertFrame extends JFrame {
    private JPanel firstJPanel, secondJPanel, thirdJPanel, resultPanel, buttonPanel;
    private JLabel label1, label2, label3, label4;
    private JTextField inputJTextField;
    private JLabel resultJLabel;
    private ButtonGroup radioButtonGroup1, radioButtonGroup2;
    private JRadioButton USDJRadioButton1, USDJRadioButton2;
    private JRadioButton MexPesoJRadioButton1, MexPesoJRadioButton2;
    private JRadioButton EuroJRadioButton1, EuroJRadioButton2;
    private JRadioButton ClearRadioButton3, SubmitRadioButton3, ConvertButton3;

    private BufferedImage image1;
    private BufferedImage image2;
    private BufferedImage image3;
    private BufferedImage image4;
    private BufferedImage image5;
    private BufferedImage image6;


    // constructor sets up GUI
    public ConvertFrame() {
        super("INSY 4305 Currency Converter");

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic('F');

        JMenuItem convertItem = new JMenuItem("Convert");
        convertItem.setMnemonic('C');
        JMenuItem aboutItem = new JMenuItem("About");
        aboutItem.setMnemonic('A');
        fileMenu.add(aboutItem);
        aboutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ConvertFrame.this,
                        "Currency Conversion Program \nusing menus and buttons \nsource:https://www.oanda.com/currency-converter/",
                        "About", JOptionPane.PLAIN_MESSAGE);

            }
        });
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setMnemonic('x');
        fileMenu.add(convertItem);
        fileMenu.add(aboutItem);
        MyEventHandler convertItemHandler = new MyEventHandler();
        convertItem.addActionListener(convertItemHandler);

        fileMenu.add(exitItem);
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JMenuBar bar = new JMenuBar();
        bar.add(fileMenu);
        setJMenuBar(bar);


        // this button group is for input buttons
        USDJRadioButton1 = new JRadioButton("USD", true);
        MexPesoJRadioButton1 = new JRadioButton("Mexican Peso", false);
        EuroJRadioButton1 = new JRadioButton("Euro", false);

        // this button group is for output buttons
        USDJRadioButton2 = new JRadioButton("USD", false);
        MexPesoJRadioButton2 = new JRadioButton("Mexican Peso", true);
        EuroJRadioButton2 = new JRadioButton("Euro", false);

        // first panel
        try {
            image1 = ImageIO.read(new File("dollar.png"));
        } catch (IOException ex) {
            // handle exception...
        }
        JLabel image1Label = new JLabel(new ImageIcon(image1));

        try {
            image2 = ImageIO.read(new File("peso.png"));
        } catch (IOException ex) {
            // handle exception...
        }
        JLabel image2Label = new JLabel(new ImageIcon(image2));

        try {
            image3 = ImageIO.read(new File("euro.png"));
        } catch (IOException ex) {
            // handle exception...
        }
        JLabel image3Label = new JLabel(new ImageIcon(image3));

        // thrid Panel
        try {
            image4 = ImageIO.read(new File("dollar.png"));
        } catch (IOException ex) {
            // handle exception...
        }
        JLabel image4Label = new JLabel(new ImageIcon(image4));

        try {
            image5 = ImageIO.read(new File("peso.png"));
        } catch (IOException ex) {
            // handle exception...
        }
        JLabel image5Label = new JLabel(new ImageIcon(image5));

        try {
            image6 = ImageIO.read(new File("euro.png"));
        } catch (IOException ex) {
            // handle exception...
        }
        JLabel image6Label = new JLabel(new ImageIcon(image6));


        radioButtonGroup1 = new ButtonGroup();
        radioButtonGroup1.add(USDJRadioButton1);
        radioButtonGroup1.add(MexPesoJRadioButton1);
        radioButtonGroup1.add(EuroJRadioButton1);
        radioButtonGroup2 = new ButtonGroup();
        radioButtonGroup2.add(USDJRadioButton2);
        radioButtonGroup2.add(MexPesoJRadioButton2);
        radioButtonGroup2.add(EuroJRadioButton2);

        // create labels
        label1 = new JLabel("Convert from:");
        label2 = new JLabel("Enter Currency:");
        label3 = new JLabel("Convert to:");
        label4 = new JLabel("Comparable Currency is:");
        resultJLabel = new JLabel();

        // create first JPanel
        firstJPanel = new JPanel();
        firstJPanel.setLayout((new FlowLayout(FlowLayout.LEFT)));
        firstJPanel.setLayout(new GridLayout(1, 3));
        firstJPanel.add(image1Label);
        firstJPanel.add(image2Label);
        firstJPanel.add(image3Label);
        firstJPanel.setLayout(new GridLayout(2, 3));
        firstJPanel.add(USDJRadioButton1);
        firstJPanel.add(MexPesoJRadioButton1);
        firstJPanel.add(EuroJRadioButton1);

        // create second JPanel
        secondJPanel = new JPanel();
        // create JTextField for getting input number
        inputJTextField = new JTextField(10);
        secondJPanel.add(inputJTextField);

        // create third JPanel
        thirdJPanel = new JPanel();
        thirdJPanel.setLayout((new FlowLayout(FlowLayout.LEFT)));
        thirdJPanel.setLayout((new GridLayout(1, 3)));
        thirdJPanel.add(image4Label);
        thirdJPanel.add(image5Label);
        thirdJPanel.add(image6Label);
        thirdJPanel.setLayout(new GridLayout(2, 3));
        thirdJPanel.add(USDJRadioButton2);
        thirdJPanel.add(MexPesoJRadioButton2);
        thirdJPanel.add(EuroJRadioButton2);

        // create result JPanel

        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(new ActionListener() {
            @Override

                    // perform calculations
                    public void actionPerformed(ActionEvent event) {
                        double result = 0;
                        double input = Double.parseDouble(inputJTextField.getText());

//                        input = Double.parseDouble(((JTextField) event.getSource()).getText());

                        // USD to Mexican Peso
                        if (USDJRadioButton1.isSelected() && MexPesoJRadioButton2.isSelected())
                            result = (input * 17.9968);
                            // USD to Euro
                        else if (USDJRadioButton1.isSelected() && EuroJRadioButton2.isSelected())
                            result = (input * 0.90949);
                            // MexicanPeso to USD
                        else if (MexPesoJRadioButton1.isSelected() && USDJRadioButton2.isSelected())
                            result = (input * 0.05548);
                            // MexPeso to Euro
                        else if (MexPesoJRadioButton1.isSelected() && EuroJRadioButton2.isSelected())
                            result = input * 0.05045;
                            // Euro to USD
                        else if (EuroJRadioButton1.isSelected() && USDJRadioButton2.isSelected())
                            result = (input * 1.09924);
                            // Euro to Mexican Peso
                        else if (EuroJRadioButton1.isSelected() && MexPesoJRadioButton2.isSelected())
                            result = (input * 19.7828);
                        else
                            result = input;

                        resultJLabel.setText(Double.toString(result));

                    }
                }
        );

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputJTextField.setText("");
            }
        });
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.add(convertButton);
        buttonPanel.add(clearButton);
        resultPanel = new JPanel();
        resultPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        resultPanel.add(resultJLabel);
        setLayout(new GridLayout(10, 2));
        add(label1);
        add(firstJPanel);
        add(label2);
        add(inputJTextField);
        add(label3);
        add(secondJPanel);
        add(thirdJPanel);
        add(label4);
        add(resultPanel);
        add(buttonPanel);
    }

    private class MyEventHandler implements ActionListener {
        // handle menu item events
        @Override
        public void actionPerformed(ActionEvent event) {
            if (event.getActionCommand().equals("Convert")) {

                double result = 0;
                double input = Double.parseDouble(inputJTextField.getText());
                // Convert from selected currency to selected currency
                double convertedAmount = 0.0;
                if (USDJRadioButton1.isSelected() && MexPesoJRadioButton2.isSelected())
                    result = (input * 17.9968);
                    // USD to Euro
                else if (USDJRadioButton1.isSelected() && EuroJRadioButton2.isSelected())
                    result = (input * 0.90949);
                    // MexicanPeso to USD
                else if (MexPesoJRadioButton1.isSelected() && USDJRadioButton2.isSelected())
                    result = (input * 0.05548);
                    // MexPeso to Euro
                else if (MexPesoJRadioButton1.isSelected() && EuroJRadioButton2.isSelected())
                    result = input * 0.05045;
                    // Euro to USD
                else if (EuroJRadioButton1.isSelected() && USDJRadioButton2.isSelected())
                    result = (input * 1.09924);
                    // Euro to Mexican Peso
                else if (EuroJRadioButton1.isSelected() && MexPesoJRadioButton2.isSelected())
                    result = (input * 19.7828);
                else
                    result = input;

                resultJLabel.setText(Double.toString(result));

            }
        }


    }
}