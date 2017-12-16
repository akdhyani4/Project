import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener
{
	int c,n;
	String s1,s2,s3,s4,s5;
	Frame f;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	Panel p;
	TextField tf;
	
	Calculator()
	{
		f=new Frame("Calculator");
		p=new Panel(new GridLaout(4,4,10,20);
		f.setLayout(new FlowLayout());
		b0=new Button("0");
		b0.addActionListener(this);
		b1=new Button("1");
		b1.addActionListener(this);
		b2=new Button("2");
		b2.addActionListener(this);
		b3=new Button("3");
		b3.addActionListener(this);
		b4=new Button("4");
		b4.addActionListener(this);
		b5=new Button("5");
		b5.addActionListener(this);
		b6=new Button("6");
		b6.addActionListener(this);
		b7=new Button("7");
		b7.addActionListener(this);
		b8=new Button("8");
		b8.addActionListener(this);
		b9=new Button("9");
		b9.addActionListener(this);
		b10=new Button("+");
		b10.addActionListener(this);
		b11=new Button("-");
		b11.addActionListener(this);
		b12=new Button("*");
		b12.addActionListener(this);
		b13=new Button("/");
		b13.addActionListener(this);
		b14=new Button("=");
		b14.addActionListener(this);
		b15=new Button("C");
		b15.addActionListener(this);
		
		tf=new TextField(20);
		f.add(tf);
		
		p.add(b0);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		p.add(b11);
		p.add(b12);
		p.add(b13);
		p.add(b14);
		p.add(b15);
		
		f.add(p);
		f.setSize(300,300);
		f.setResizable(false);
		f.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b0)
		{
			s1=tf.getText();
			tf.setText(s1+"0");	
		}
		else if(e.getSource()==b1)
		{
			s1=tf.getText();
			tf.setText(s1+"1");	
		}
		else if(e.getSource()==b2)
		{
			s1=tf.getText();
			tf.setText(s1+"2");	
		}
		else if(e.getSource()==b3)
		{
			s1=tf.getText();
			tf.setText(s1+"3");	
		}
		else if(e.getSource()==b4)
		{
			s1=tf.getText();
			tf.setText(s1+"4");	
		}
		else if(e.getSource()==b5)
		{
			s1=tf.getText();
			tf.setText(s1+"5");	
		}
		else if(e.getSource()==b6)
		{
			s1=tf.getText();
			tf.setText(s1+"6");	
		}
		else if(e.getSource()==b7)
		{
			s1=tf.getText();
			tf.setText(s1+"7");	
		}
		else if(e.getSource()==b8)
		{
			s1=tf.getText();
			tf.setText(s1+"8");	
		}
		else if(e.getSource()==b9)
		{
			s1=tf.getText();
			tf.setText(s1+"9");	
		}
	}
}
		
		