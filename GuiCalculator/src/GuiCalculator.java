import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandon2
 */
public class GuiCalculator extends JFrame implements ActionListener{

    private JLabel input1;
    private JLabel input2;
    private JLabel result;

    private JTextField in1;
    private JTextField in2;
    private JTextField sum;

    private JButton addBtn;
    /*
    private JButton subBtn;
    private JButton multBtn;
    private JButton divBtn;
    */
    private JButton redBtn;
    private JButton blueBtn;
    private JButton greenBtn;

    private JTextField in4;

    private JLabel name;

    public GuiCalculator() {

        super("My Frame");
        //setLayout(new GridLayout(8,2));
        setLayout(new FlowLayout());

        input1 = new JLabel("Insert 1st digit: ");
        input2 = new JLabel("Insert 2nd digit: ");
        result = new JLabel("Result: ");

        addBtn = new JButton("Add");
    /*
    subBtn = new JButton("Subtract");
    multBtn = new JButton("Multiply");
    divBtn = new JButton("Divide");
    */
        in1 = new JTextField(10);
        in2 = new JTextField(10);
        sum = new JTextField(10);


        redBtn = new JButton("Red");
        blueBtn = new JButton("Blue");
        greenBtn =new JButton("Green");

        in4 = new JTextField(10);
        name = new JLabel("Color Change: ");

        add(input1);
        add(in1);

        add(input2);
        add(in2);

        add(result);
        add(sum);

        add(addBtn);
        addBtn.addActionListener(this);
    /*
    add(subBtn);
    subBtn.addActionListener(this);
    
    add(multBtn);
    multBtn.addActionListener(this);
    
    add(divBtn);
    divBtn.addActionListener(this);
    */
        //setSize(300,300);

        add(name);
        add(in4);

        add(redBtn);
        redBtn.addActionListener(this);

        add(blueBtn);
        blueBtn.addActionListener(this);

        add(greenBtn);
        greenBtn.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        int a,b,c;

        if(e.getSource() == addBtn)
        {
            a = Integer.parseInt(in1.getText());
            b = Integer.parseInt(in2.getText());
            c = a + b;
            sum.setText(String.valueOf(c));
        }
      /*  
        else if(e.getSource()== subBtn)
        {
            a = Integer.parseInt(in1.getText());
            b = Integer.parseInt(in2.getText());
            c = a - b;
            sum.setText(String.valueOf(c));
        }    
        
        else if(e.getSource() == multBtn)
        {
            a = Integer.parseInt(in1.getText());
            b = Integer.parseInt(in2.getText());
            c   = a * b;
            sum.setText(String.valueOf(c));
        }
        
        else if(e.getSource()== divBtn)
        {
            a = Integer.parseInt(in1.getText());
            b = Integer.parseInt(in2.getText());
            c = a / b;
            sum.setText(String.valueOf(c));
        }
        */
        if(e.getSource()== redBtn)
        {
            in4.setBackground(Color.red);
            in4.setForeground(Color.red);
            JOptionPane.showMessageDialog(null,"The Red Button was selected and the Color change is Red");
        }
        else if(e.getSource() == blueBtn)
        {
            in4.setBackground(Color.blue);
            in4.setForeground(Color.blue);
            JOptionPane.showMessageDialog(null,"The Blue Button was selected and the Color change is Blue");
        }
        else if(e.getSource() == greenBtn)
        {
            in4.setBackground(Color.green);
            in4.setForeground(Color.green);
            JOptionPane.showMessageDialog(null,"The Green Button was selected and the Color change is Green");
        }
    }

    public static void main(String[] args) {

        GuiCalculator cal = new GuiCalculator();
        cal.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cal.setVisible(true);
        cal.setSize(700, 125);
        cal.setLocation(350,300);
    }


}