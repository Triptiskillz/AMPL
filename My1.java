

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;
import java.applet.AudioClip;
import java.applet.Applet;
class frame1 extends JFrame 
{
	URL audio=this.getClass().getResource("first.mp3");
	AudioClip ac= Applet.newAudioClip(audio);
		
		public frame1()
		{
			setVisible(true);
			ac.play();
			setTitle("AGPL");
			setSize(1300,700);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setBackground(new Color(0,240,240));
			setLayout(null);
			
			create();
		}
		
		
		//AudioClip ac= Applet.newAudioClip(audio);
		
		public void  create()
		{
			//l1=new JLabel("PLAY GAMES");
			l2=new JLabel("Loading...");
			l3=new JLabel();
			
			
			
			//l1.setBounds(0,350,1600,300);
			//l1.setHorizontalAlignment(SwingConstants.CENTER);
			l2.setHorizontalAlignment(SwingConstants.CENTER);
			l3.setHorizontalAlignment(SwingConstants.CENTER);
			
			l2.setBounds(0,400,1200,250);
			l3.setSize(1300,700);
			
		URL url=this.getClass().getResource("mypack\\agpl.PNG");
		Icon back1=new ImageIcon(url);
		l3.setIcon(back1);
		
		//l1.setFont(new Font("Algerian", 1, 48));
		l2.setFont(new Font("Algerian", 2, 36));
		
		//add(l1);
		add(l2);
		add(l3);
		setResizable(false);
		close();
	
	}
	public void close()
	{
	sleep(10000);
	dispose();
	My2 m=new My2();
	}
	
	public void sleep(int x)
	{
		try
		{
			Thread.sleep(x);
		} 
		catch(Exception e){}
		
	}
	private JLabel l2,l3;   //l1
}

public class My1
{
	public static void main(String args[])
	{
		frame1 ok=new frame1();
		
	}
}