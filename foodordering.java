package swings;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
@SuppressWarnings("serial")
public class foodordering extends JFrame implements ActionListener{
	JLabel l;
	JCheckBox c1,c2,c3;
	JButton b;
	foodordering(){
		l=new JLabel("Food Ordering System");
		l.setBounds(40,40,200,30);
		c1=new JCheckBox("Pizza @ 100");
		c1.setBounds(100,70,150,30);
		c2=new JCheckBox("Burger @ 30");
		c2.setBounds(100,100,150,30);
		c3=new JCheckBox("Tea @ 10");
		c3.setBounds(100,130,150,30);
		b=new JButton("Order");
		b.setBounds(100,180,100,30);
		b.addActionListener(this);
		add(b);
		add(l);
		add(c1);
		add(c2);
		add(c3);
		setLayout(null);
		setSize(300,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new foodordering();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		float amount=0;
		String s="";
		if(c1.isSelected()){
			amount+=100;
			s="PIZZA: 100\n";
		}
		if(c2.isSelected()){
			amount+=30;
			s+="BURGER: 30\n";
		}
		if(c3.isSelected()){
			amount+=10;
			s+="TEA: 10\n";
		}
		s+="---------\n";
		JOptionPane.showMessageDialog(this,s+"Total: "+amount);
		
	}

}
