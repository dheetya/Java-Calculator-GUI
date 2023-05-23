
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class newCalcGUI extends JPanel //ActionListener
{
    
    private JTextField jTF;
    private String str = "";
    private String str2 = "";
    private String num1 = "";
    private String num2 = "";
    private JButton jb0, jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, jbPlus, jbMinus, jbMult, jbDiv, jbClear, jbEnter;

    private class PressZero implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            str = jTF.getText() + "0";
            jTF.setText(str);

            if (str2 == "")
            {
                num1 += 0;
            }
            else 
            {
                num2 += 0;    
            }
        }
    }
    private class PressOne implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            str = jTF.getText() + "1";
            jTF.setText(str);

            if (str2 == "")
            {
                num1 += 1;
            }
            else 
            {
                num2 += 1;    
            }
        }
    }
    private class PressTwo implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            str = jTF.getText() + "2";
            jTF.setText(str);

            if (str2 == "")
            {
                num1 += 2;
            }
            else 
            {
                num2 += 2;    
            }
        }
    }
    private class PressThree implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            str = jTF.getText() + "3";
            jTF.setText(str);

            if (str2 == "")
            {
                num1 += 3;
            }
            else 
            {
                num2 += 3;    
            }
        }
    }
    private class PressFour implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            str = jTF.getText() + "4";
            jTF.setText(str);

            if (str2 == "")
            {
                num1 += 4;
            }
            else 
            {
                num2 += 4;    
            }
        }
    }
    private class PressFive implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            str = jTF.getText() + "5";
            jTF.setText(str);

            if (str2 == "")
            {
                num1 += 5;
            }
            else 
            {
                num2 += 5;    
            }
        }
    }
    private class PressSix implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            str = jTF.getText() + "6";
            jTF.setText(str);

            if (str2 == "")
            {
                num1 += 6;
            }
            else 
            {
                num2 += 6;    
            }
        }
    }
    private class PressSeven implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            str = jTF.getText() + "7";
            jTF.setText(str);

            if (str2 == "")
            {
                num1 += 7;
            }
            else 
            {
                num2 += 7;    
            }
        }
    }
    private class PressEight implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            str = jTF.getText() + "8";
            jTF.setText(str);

            if (str2 == "")
            {
                num1 += 8;
            }
            else 
            {
                num2 += 8;    
            }
        }
    }
    private class PressNine implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            str = jTF.getText() + "9";
            jTF.setText(str);

            if (str2 == "")
            {
                num1 += 9;
            }
            else 
            {
                num2 += 9;    
            }
        }
    }
    private class PressPlus implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            str = jTF.getText() + "+";
            jTF.setText(str);
            str2 = "+";
        }
    }
    private class PressMinus implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            str = jTF.getText() + "-";
            jTF.setText(str);
            str2 = "-";
        }
    }
    private class PressMult implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            str = jTF.getText() + "*";
            jTF.setText(str);
            str2 = "*";
        }
    }
    private class PressDiv implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            str = jTF.getText()  + "/";
            jTF.setText(str);
            str2 = "/";
        }
    }
    private class PressClear implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            str = "0";
            jTF.setText(str);
            str2 = "";
            num1 = "";
            num2 = "";
        }
    }
    private class PressEnter implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            int result = 0;

            str = jTF.getText() + "=";
            jTF.setText(str);

            if (str2.equals("+"))
            {
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
            }
            else if (str2.equals("-"))
            {
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
            }
            else if (str2.equals("*"))
            {
                result = Integer.parseInt(num1) * Integer.parseInt(num2);
            }
            else if (str2.equals("/"))
            {
                result = Integer.parseInt(num1) / Integer.parseInt(num2);
            }
            else{ }

            str = jTF.getText() + result;
            jTF.setText(str);

        }
    }

    public newCalcGUI()
    {
        super();

        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screen.width / 3;

        setLayout(new BorderLayout());
        
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        add(panel1, BorderLayout.NORTH);

        jTF = new JTextField(screenWidth);
        jTF.setFont( new Font("Monospace", Font.BOLD, 50) );
        jTF.setHorizontalAlignment(JTextField.LEFT);
        panel1.add(jTF, BorderLayout.SOUTH );

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(4, 4));

        JButton jb0 = new JButton("0"); //all new buttons
        JButton jb1 = new JButton("1");
        JButton jb2 = new JButton("2");
        JButton jb3 = new JButton("3");
        JButton jb4 = new JButton("4");
        JButton jb5 = new JButton("5");
        JButton jb6 = new JButton("6");
        JButton jb7 = new JButton("7");
        JButton jb8 = new JButton("8");
        JButton jb9 = new JButton("9");
        JButton jbPlus = new JButton("+");
        JButton jbMinus = new JButton("-");
        JButton jbMult = new JButton("*");
        JButton jbDiv = new JButton("/");
        JButton jbClear = new JButton("Clear");
        JButton jbEnter = new JButton("Ent");

        panel2.add(jb0);
        panel2.add(jb1);
        panel2.add(jb2);
        panel2.add(jbPlus);

        panel2.add(jb3);
        panel2.add(jb4);
        panel2.add(jb5);
        panel2.add(jbMinus);

        panel2.add(jb6);
        panel2.add(jb7);
        panel2.add(jb8);
        panel2.add(jbMult);

        panel2.add(jb9);
        panel2.add(jbClear);
        panel2.add(jbEnter);
        panel2.add(jbDiv);

        add(panel2, BorderLayout.CENTER); //adds button to bottom center of calc

        jb0.addActionListener(new PressZero());
        jb1.addActionListener(new PressOne());
        jb2.addActionListener(new PressTwo());
        jb3.addActionListener(new PressThree());
        jb4.addActionListener(new PressFour());
        jb5.addActionListener(new PressFive());
        jb6.addActionListener(new PressSix());
        jb7.addActionListener(new PressSeven());
        jb8.addActionListener(new PressEight());
        jb9.addActionListener(new PressNine());
        jbPlus.addActionListener(new PressPlus());
        jbMinus.addActionListener(new PressMinus());
        jbMult.addActionListener(new PressMult());
        jbDiv.addActionListener(new PressDiv());
        jbClear.addActionListener(new PressClear());
        jbEnter.addActionListener(new PressEnter());
        
    }

    public static void main(String[] args) //cant add all buttons and textfields in main it was too confusing i had to use methods
    {
        JFrame frame = new JFrame("Dheetya's Super Helpful Calculator");
        frame.setLayout(new BorderLayout()); //used geeksforgeeks.com

        newCalcGUI panel = new newCalcGUI();
        frame.add(panel);

        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize(); //idk how to make this work but i think it works now maybe
        int screenWidth = screen.width / 3;
        int screenHeight = screen.height / 2;

        frame.setBounds(100, 100, screenWidth, screenHeight); //fills screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
 
}
