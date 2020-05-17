

import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;
import javax.swing.JOptionPane;
import java.net.URL; 
public class puzzle extends JFrame implements ActionListener{  
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,next;  
public puzzle(){  
    b1=new Button("1");  
    b1.setBounds(30,100,164,164); 
	b1.setBackground(Color. CYAN);
    b2=new Button(" ");  
    b2.setBounds(194,100,164,164);
	b2.setBackground(Color. CYAN);
    b3=new Button("3");  
    b3.setBounds(358,100,164,164);
	b3.setBackground(Color. CYAN);  
    b4=new Button("4");  
    b4.setBounds(30,264,164,164); 
	b4.setBackground(Color. CYAN); 
    b5=new Button("5");  
    b5.setBounds(194,264,164,164);
	b5.setBackground(Color.CYAN); 
    b6=new Button("6");  
    b6.setBounds(358,264,164,164);
	b6.setBackground(Color. CYAN);  
    b7=new Button("7");  
    b7.setBounds(30,428,164,164); 
	b7.setBackground(Color. CYAN); 
    b8=new Button("8");  
    b8.setBounds(194,428,164,164);
	b8.setBackground(Color. CYAN); 
    b9=new Button("2");  
    b9.setBounds(358,428,164,164);
	b9.setBackground(Color. CYAN);
    next=new Button("next");
    next.setBounds(200,660,100,100);	
	next.setBackground(Color.BLUE);
      
    b1.addActionListener(this);  
    b2.addActionListener(this);  
    b3.addActionListener(this);  
    b4.addActionListener(this);  
    b5.addActionListener(this);  
    b6.addActionListener(this);  
    b7.addActionListener(this);  
    b8.addActionListener(this);  
    b9.addActionListener(this);
    next.addActionListener(this);
	
      
    add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(next);
 setSize(1500,800);  
    setLayout(null);  
    setVisible(true); 
	setTitle("Number Puzzle");
	JLabel obj = new JLabel();
    URL ur = (this.getClass().getResource("blog-gfx-aug-futureNEWHdr-1500x670.jpg"));// background image
    Icon o = new ImageIcon(ur);
	obj.setBounds(0,0,1500,800);
		obj.setIcon(o);
		add(obj);
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
	setLocationRelativeTo(null);
    
}
public void actionPerformed(ActionEvent e)
{ 
  if(e.getSource()==next)
  {  
   String s=b4.getLabel();  
   b4.setLabel(b9.getLabel());  
   b9.setLabel(s);  
   s=b1.getLabel();  
   b1.setLabel(b5.getLabel());  
   b5.setLabel(s);  
   s=b2.getLabel();  
   b2.setLabel(b7.getLabel());  
   b7.setLabel(s);  
  }  
  if(e.getSource()==b1)
  {  
   String s=b1.getLabel();  
   if(b2.getLabel().equals(" ")) 
   { 
     b2.setLabel(s); b1.setLabel(" "); 
   }  
   else if(b4.getLabel().equals(" "))
   {
	   b4.setLabel(s); b1.setLabel(" ");
   }  
  }//end of if  
  
  if(e.getSource()==b3)
  {  
    String s=b3.getLabel();  
    if(b2.getLabel().equals(" "))
	{
		b2.setLabel(s); b3.setLabel(" ");
	}  
    else if(b6.getLabel().equals(" "))
	{
		b6.setLabel(s); b3.setLabel(" ");
	}  
  }//end of if  
  
  if(e.getSource()==b2)
  {  
    String s=b2.getLabel();  
    if(b1.getLabel().equals(" "))
	{
		b1.setLabel(s); b2.setLabel(" ");
	}  
    else if(b3.getLabel().equals(" "))
	{
		b3.setLabel(s); b2.setLabel(" ");
	}  
   else if(b5.getLabel().equals(" "))
   {
	   b5.setLabel(s); b2.setLabel(" ");
	}  
 }//end of if  
  
 if(e.getSource()==b4)
 {  
  String s=b4.getLabel();  
  if(b1.getLabel().equals(" "))
  {
	  b1.setLabel(s); b4.setLabel(" ");
  }  
  else if(b7.getLabel().equals(" "))
  {
	  b7.setLabel(s); b4.setLabel(" ");
  }  
  else if(b5.getLabel().equals(" "))
  {
	  b5.setLabel(s); b4.setLabel(" ");
  }  
 }//end of if  
  
  if(e.getSource()==b5)
  {  
   String s=b5.getLabel();  
   if(b2.getLabel().equals(" "))
   {
	   b2.setLabel(s); b5.setLabel(" ");
   }  
   else if(b4.getLabel().equals(" "))
   { 
    b4.setLabel(s); b5.setLabel(" ");
   }  
   else if(b6.getLabel().equals(" "))
   { 
    b6.setLabel(s); b5.setLabel(" ");
   }  
   else if(b8.getLabel().equals(" "))
   {
	   b8.setLabel(s); b5.setLabel(" ");
	}  
 }//end of if  
  
  if(e.getSource()==b6)
  {  
  
   String s=b6.getLabel();  
   if(b9.getLabel().equals(" "))
   { 
    b9.setLabel(s); b6.setLabel(" ");
   }  
   else if(b3.getLabel().equals(" "))
   { 
     b3.setLabel(s); b6.setLabel(" ");
   }  
   else if(b5.getLabel().equals(" "))
   { 
    b5.setLabel(s); b6.setLabel(" ");
   }
   
  
 }//end of if  
  
  if(e.getSource()==b7)
  {  
    String s=b7.getLabel();  
    if(b4.getLabel().equals(" "))
	{ 
      b4.setLabel(s); 
	  b7.setLabel(" ");
	}  
    else if(b8.getLabel().equals(" "))
	{ 
     b8.setLabel(s); b7.setLabel(" ");
	}  
  
 }//end of if  
  
 if(e.getSource()==b8)
 {  
  String s=b8.getLabel();  
  if(b7.getLabel().equals(" "))
  { 
   b7.setLabel(s); b8.setLabel(" ");
  }  
  else if(b9.getLabel().equals(" "))
  { 
   b9.setLabel(s); b8.setLabel(" ");
   }  
  else if(b5.getLabel().equals(" "))
  {  
    b5.setLabel(s); b8.setLabel(" ");
  }  
  
 }//end of if  
  
 if(e.getSource()==b9)
 {  
  String s=b9.getLabel();  
  if(b6.getLabel().equals(" "))
  { 
    b6.setLabel(s); b9.setLabel(" ");
  }  
  else if(b8.getLabel().equals(" "))
  { 
    b8.setLabel(s); b9.setLabel(" ");
  }  
  
  if(b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel().equals("3")&&b4.getLabel().equals("4")&&b5.getLabel().equals("5")  
  &&b6.getLabel().equals("6")&&b7.getLabel().equals("7")&&b8.getLabel()  
  .equals("8")&&b9.getLabel().equals(" ")){   
  JOptionPane.showMessageDialog(puzzle.this,"!!!you won!!!");  
  }  
 }//end of if  
  
}//end of actionPerformed  
 }
class Puzzle1
 {
public static void main(String[] args) {  
    new puzzle();  
}  
} 