
import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.GridLayout;

import java.awt.event.*;
 
 
class Calculator implements ActionListener
{
Frame f1;
TextField tf;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,beq;
  
public Calculator()
{
	
	//creating objects
    f1=new Frame("Calculator");
    tf=new TextField(200);
    b1=new Button("9");
    b2=new Button("8");
    b3=new Button("7");
    b4=new Button("6");
    b5=new Button("5");
    b6=new Button("4");
    b7=new Button("3");
    b8=new Button("2");
    b9=new Button("1");
    b10=new Button("CE");
    b11=new Button("0");
    beq=new Button("k");
    
    
     f1.setSize(350,500);
     f1.setVisible(true);
     
     tf.setBounds(30,40,280,30);
     b1.setBounds(40,100,50,40);
     b2.setBounds(110,100,50,40);
     b3.setBounds(180,100,50,40);

     b4.setBounds(40,170,50,40);
     b5.setBounds(110,170,50,40);
     b6.setBounds(180,170,50,40);
     
     b7.setBounds(40,240,50,40);
     b8.setBounds(110,240,50,40);
     b9.setBounds(180,240,50,40);

     b10.setBounds(40,310,50,40);
     b11.setBounds(110,310,50,40);
     beq.setBounds(180,310,50,40);

    f1.add(tf);
    f1.add(b1);
    f1.add(b2);
    f1.add(b3);
    f1.add(b4);
    f1.add(b5);
    f1.add(b6);
    f1.add(b7);
    f1.add(b8);
    f1.add(b9);
    f1.add(b10);
    f1.add(b11);
    f1.add(beq);
    
  //Add action Listener to the buttons
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
  b5.addActionListener(this);
  b6.addActionListener(this);
  b7.addActionListener(this);
  b8.addActionListener(this);
  b9.addActionListener(this);
  b10.addActionListener(this);
  b11.addActionListener(this);
  beq.addActionListener(this);
}
 
    public void actionPerformed(ActionEvent ae)
    {
    	if(ae.getSource() ==  b1)
		{
			tf.setText(null);
		}
    	if(ae.getSource() ==  b2)
		{
			tf.setText(null);
		}	
    	if(ae.getSource() ==  b3)
		{
			tf.setText(null);
		}	
    	if(ae.getSource() ==  b4)
		{
			tf.setText(null);
		}	
    	if(ae.getSource() ==  b5)
		{
			tf.setText(null);
		}	
    	if(ae.getSource() ==  b6)
		{
			tf.setText(null);
		}	
    	if(ae.getSource() ==  b7)
		{
			tf.setText(null);
		}	
    	if(ae.getSource() ==  b8)
		{
			tf.setText(null);
		}	
    	if(ae.getSource() ==  b9)
		{
			tf.setText(null);
		}	
    	if(ae.getSource() ==  b10)
		{
			tf.setText(null);
		}	
    	if(ae.getSource() ==  b11)
		{
			tf.setText(null);
		}	
    	if(ae.getSource() ==  beq)
		{
			tf.setText(null);
		}	
    	
}

 
      public static void main(String[] args)
      {
       new Calculator();
}
}
