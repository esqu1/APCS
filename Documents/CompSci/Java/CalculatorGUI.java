import java.awt.*;
import javax.swing.*;
import java.util.*;


public class CalculatorGUI{

    public static final void main(String[] args){
	
	JFrame Frame = new JFrame();

	final int FIELD_WIDTH = 20;
	JTextField textField1 = new JTextField(FIELD_WIDTH);
	JTextField textField2 = new JTextField(FIELD_WIDTH);

	JButton plus = new JButton("+");
	JButton minus = new JButton("-");
	JButton multiply = new JButton("*");
	JButton divide = new JButton("/");


	Frame.setLayout(new FlowLayout());
	
	Frame.add(textField1);
	Frame.add(textField2);
	Frame.add(plus);
	Frame.add(minus);
	Frame.add(multiply);
	Frame.add(divide);


	Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Frame.pack();
	Frame.setVisible(true);

    }
}