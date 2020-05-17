

import java.awt.*;
import java.util.Random;
import java.util.ArrayList;
import java .util.List;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;

class last extends Frame implements ActionListener,WindowListener
{
int ran1,c;
static int level=1;
List<Integer> arr=new ArrayList<>(); 
URL blinklast=this.getClass().getResource("mypack\\blinklast.jpg");
Icon blinkk = new ImageIcon(blinklast);

	public last()
	{
	setVisible(true);
	setTitle("Memorizing Blocks");
	addWindowListener(this);
	//Dimension s=Toolkit.getDefaultToolkit().getScreenSize();
	//setDefaultCloseOperation(Frame.DISPOSE_ON_CLOSE);
	setBounds(100,100,1200,850);
	setLocationRelativeTo(null);
	setLayout(null);
	setResizable(false);
	create();
	}

Button start,b1,b2,b3,b4,b5,b6,b7,b8,b9,close;
JLabel l1,l2;
public void create()
	{
		l1=new JLabel();
		l1.setForeground(Color.WHITE);
		l2=new JLabel();
		
		l2.setIcon(blinkk);
		
		start =new Button("START");
		b1=new Button();	b2=new Button();	b3=new Button();
		b4=new Button();	b5=new Button();	b6=new Button();
		b7=new Button();	b8=new Button();	b9=new Button();
		close=new Button("I QUIT");
		
		l1.setHorizontalAlignment(SwingConstants.RIGHT);
		l1.setHorizontalTextPosition(SwingConstants.LEFT);
		l1.setFont(new Font("Algerian", 2, 48));
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setVerticalAlignment(SwingConstants.CENTER);
		l2.setBounds(10,10,1200,850);
		
		start.setBounds(100,50,100,50);   l1.setBounds(150,50,600,50);   
		b1.setBounds(200,160,200,200);	b2.setBounds(420,160,200,200);	b3.setBounds(640,160,200,200);
		b4.setBounds(200,380,200,200);	b5.setBounds(420,380,200,200);	b6.setBounds(640,380,200,200);	close.setBounds(860,380,100,100);
		b7.setBounds(200,600,200,200);	b8.setBounds(420,600,200,200);	b9.setBounds(640,600,200,200);
		
		
		start.addActionListener(this);		
		close.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(start);
		add(close);
		add(l1);
		add(l2);
	
	}
	public void windowClosing(WindowEvent we)
	{
		//System.exit(0);
		dispose();
	}
	public void windowClosed(WindowEvent we)
	{}
	public void windowOpened(WindowEvent we)
	{}
	public void windowActivated(WindowEvent we)
	{}
	public void windowDeactivated(WindowEvent we)
	{}
	public void windowIconified(WindowEvent we)
	{}
	public void windowDeiconified(WindowEvent we)
	{}
	
    public void clear()
      {
        
            arr.clear();
			c=0;
            b9.setBackground(new java.awt.Color(240, 240, 240));
            b1.setBackground(new java.awt.Color(240, 240, 240));
            b2.setBackground(new java.awt.Color(240, 240, 240));
            b3.setBackground(new java.awt.Color(240, 240, 240));
            b4.setBackground(new java.awt.Color(240, 240, 240));
            b5.setBackground(new java.awt.Color(240, 240, 240));
            b6.setBackground(new java.awt.Color(240, 240, 240));
            b7.setBackground(new java.awt.Color(240, 240, 240));
            b8.setBackground(new java.awt.Color(240, 240, 240));
            
		}
        
		public void game()
        {
			clear();
            l1.setText("Level  :  "+level);
            int s;
            
            for(s=0; s<=level-1;s++)
            {
                Random ran=new Random();
                ran1=ran.nextInt(9)+1;
                blink(ran1);
                arr.add(ran1);
                
            }
			JOptionPane.showMessageDialog(null, "Your turn");
			
        }
        
		public void sleep(int time)
		{
			try
			{
				Thread.sleep(time);
			}
			catch(Exception e)
			{
			JOptionPane.showMessageDialog(null,e);
			}
		}
        public void blink(int x)
        {
            switch(x)
        {
            case 1:b1.setBackground(new java.awt.Color(0, 0, 0));
                    break;
            case 2:b2.setBackground(new java.awt.Color(0, 0, 0));
                    break;
            case 3:b3.setBackground(new java.awt.Color(0, 0, 0));
                    break;
            case 4:b4.setBackground(new java.awt.Color(0, 0, 0));
                    break;
            case 5:b5.setBackground(new java.awt.Color(0, 0, 0));
                    break;
            case 6:b6.setBackground(new java.awt.Color(0, 0, 0));
                    break;
            case 7:b7.setBackground(new java.awt.Color(0, 0, 0));
                    break;
            case 8:b8.setBackground(new java.awt.Color(0, 0, 0));
                    break;
            case 9:b9.setBackground(new java.awt.Color(0, 0, 0));
                    break;
        }

        sleep(300);
        switch(x)
        {
            case 1:b1.setBackground(new java.awt.Color(240, 240, 240));
                    break;
            case 2:b2.setBackground(new java.awt.Color(240, 240, 240));
                    break;
            case 3:b3.setBackground(new java.awt.Color(240, 240, 240));
                    break;
            case 4:b4.setBackground(new java.awt.Color(240, 240, 240));
                    break;
            case 5:b5.setBackground(new java.awt.Color(240, 240, 240));
                    break;
            case 6:b6.setBackground(new java.awt.Color(240, 240, 240));
                    break;
            case 7:b7.setBackground(new java.awt.Color(240, 240, 240));
                    break;
            case 8:b8.setBackground(new java.awt.Color(240, 240, 240));
                    break;
            case 9:b9.setBackground(new java.awt.Color(240, 240, 240));
                    break;


        }
        sleep(100);
        }
        public void user(int x,int y)
        {
            if(arr.get(y-1)==x && y<=level )
            {
				blink(x);
                if(y==level)
                {
					JOptionPane.showMessageDialog(null,"You Succeded to Next Level.");
					level=level+1;
                    game();
                }
            }
             else
            { 
			JOptionPane.showMessageDialog(null," GAME OVER.Your score is = "+(level-1));
			level=1;
			dispose();
            }
        }   	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==start)
		{
			
			game();
		}
		else if(ae.getSource()==close)
		{
			JOptionPane.showMessageDialog(null,"Your High Score = "+(level-1));
			My2 m=new My2();
			this.dispose();
		
		}
		else if(ae.getSource()==b1)
		{
			user(1,++c);
		}
		else if(ae.getSource()==b2)
		{
			user(2,++c);
		}
		else if(ae.getSource()==b3)
		{
			user(3,++c);
		}
		else if(ae.getSource()==b4)
		{
			user(4,++c);
		}
		else if(ae.getSource()==b5)
		{
			user(5,++c);
		}
		else if(ae.getSource()==b6)
		{
			user(6,++c);
		}
		else if(ae.getSource()==b7)
		{
			user(7,++c);
		}
		else if(ae.getSource()==b8)
		{
			user(8,++c);
		}
		else if(ae.getSource()==b9)
		{
			user(9,++c);
		}
	}
}
/*class last
{
	public static void main(String args[])
	{
		last1 ok=new last1();
	}
}*/