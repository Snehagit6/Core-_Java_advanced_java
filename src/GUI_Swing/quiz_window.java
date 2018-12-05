package GUI_Swing;
import javax.swing.*;

/**
 * 	Java Swing tutorial is a part of Java Foundation Classes (JFC) that is used to create window-based applications. 
	It is built on the top of AWT (Abstract Windowing Toolkit) API and entirely written in java.
 *
 */
public class quiz_window extends JFrame{

quiz_window(){
	JLabel label=new JLabel();
	JRadioButton option[]=new JRadioButton[4];
	label.setText("Q.1:Which one is not a datatype");
	add(label);
	 ButtonGroup bg=new ButtonGroup();
	for(int i=0;i<4;i++)
	{
		
		option[i]=new JRadioButton();	
		new JFrame().add(option[i]);
		bg.add(option[i]);
	}
	JButton b1=new JButton("Next");

	new JFrame().add(b1);
	label.setBounds(30,40,450,20);
	option[0].setBounds(50,80,100,20);
	option[0].setText("int");option[1].setText("Float");option[2].setText("boolean");option[3].setText("char");	
	option[1].setBounds(50,110,100,20);
	option[2].setBounds(50,140,100,20);
	option[3].setBounds(50,170,100,20);
	b1.setBounds(100,240,100,30);
	new JFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	new JFrame().setLayout(null);
	new JFrame().setLocation(250,100);
	new JFrame().setVisible(true);
	new JFrame().setSize(600,350);
	
}
	

	
	
	public static void main(String[] args) {
		
		new quiz_window();
		
		// TODO Auto-generated method stub

	}
}

