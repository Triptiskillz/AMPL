

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;

class My2 extends JFrame implements ActionListener
{
		URL url=this.getClass().getResource("mypack\\backimage2.jpg");
		URL url1=this.getClass().getResource("mypack\\jerry.png");
		URL url2=this.getClass().getResource("mypack\\tom.png");
		URL urlb1=this.getClass().getResource("mypack\\urlb1.jpg");
		URL urlb2=this.getClass().getResource("mypack\\urlb2.jpg");
	    URL urlb3=this.getClass().getResource("mypack\\urlb3.jpg");
		URL urlb4=this.getClass().getResource("mypack\\urlb4.jpg");
		URL urlb5=this.getClass().getResource("mypack\\urlb5.jpg");
		
		Icon t1 = new ImageIcon(url1);
		Icon t2 = new ImageIcon(url2);
		Icon b1 = new ImageIcon(urlb1);
		Icon b2 = new ImageIcon(urlb2);
		Icon b3 = new ImageIcon(urlb3);
		Icon b4 = new ImageIcon(urlb4);
		Icon b5 = new ImageIcon(urlb5);
	
	public My2()
	{
		setVisible(true);
		setTitle("Let's Play And Enjoy");
		
		Dimension s=Toolkit.getDefaultToolkit().getScreenSize();
		
		setBounds(0,0,1300,800);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		//pack();
		
		talk1=new JLabel();
		talk2=new JLabel();
		talk3=new JLabel();
		talk4=new JLabel();
		talk5=new JLabel();
		
		talk1.setFont(new Font("Algerian", 2, 48));
		talk2.setFont(new Font("Algerian", 2, 48));
		talk3.setFont(new Font("Algerian", 2, 48));
		talk4.setFont(new Font("Algerian", 2, 48));
		talk5.setFont(new Font("Algerian", 2, 48));


		talk2.setHorizontalAlignment(SwingConstants.RIGHT);
		talk4.setHorizontalAlignment(SwingConstants.RIGHT);
		talk2.setHorizontalTextPosition(SwingConstants.LEFT);
		talk4.setHorizontalTextPosition(SwingConstants.LEFT);

		skip =new JButton("Skip");
		
		t_pic_puzzle = new JButton("Picture Puzzle");
		t_pic_puzzle.setIcon(b1);
		t_num_puzzle = new JButton("Number Puzzle");
		t_num_puzzle.setIcon(b2);
		pie_blink = new JButton("Memorizing Blocks");
		pie_blink.setIcon(b3);
		pkg_sudoko = new JButton();
		pkg_sudoko.setIcon(b4);
		ali_tic = new JButton();
		ali_tic.setIcon(b5);
		
		l1 = new JLabel();
		
		
		talk1.setVisible(false);
		talk2.setVisible(false);
		talk3.setVisible(false);
		talk4.setVisible(false);
		talk5.setVisible(false);
		t_pic_puzzle.setVisible(false);
		pie_blink.setVisible(false);
		t_num_puzzle.setVisible(false);
		pkg_sudoko.setVisible(false);
		ali_tic.setVisible(false);
		
		l1.setSize(1300,750);
		talk1.setBounds(300,0,300,200);	                                 skip.setBounds(1200,15,70,50);	
										talk2.setBounds(400,20,600,250);
		talk3.setBounds(30,165,1000,200);
										talk4.setBounds(580,240,700,250);
		talk5.setBounds(50,375,1400,200);
		
	t_pic_puzzle.setBounds(80,575,200,150);	t_num_puzzle.setBounds(320,575,200,150);	pie_blink.setBounds(570,575,200,150);	pkg_sudoko.setBounds(820,575,150,150);		ali_tic.setBounds(1020,575,200,150);
		
		add(skip);
		add(talk1);
		add(talk2);
		add(talk3);
		add(talk4);
		add(talk5);
		add(t_pic_puzzle);
		add(t_num_puzzle);
		add(pie_blink);
		add(pkg_sudoko);
		add(ali_tic);
		add(l1);
		
		Icon back2=new ImageIcon(url);
		l1.setIcon(back2);

		talk1.setIcon(t1);
		talk1.setText("HI!");
		
		talk2.setIcon(t2);
		talk2.setText("Hello!");
		
		talk3.setIcon(t1);
		talk3.setText("Do you want to play a Game?");
		
		talk4.setIcon(t2);		
		talk4.setText("Yes.But which game?");
		
		talk5.setIcon(t1);
		talk5.setText("I have five Options for you.\nYou Choose...  ");
	
		t_pic_puzzle.addActionListener(this);
		t_num_puzzle.addActionListener(this);
		pie_blink.addActionListener(this);
		pkg_sudoko.addActionListener(this);
		ali_tic.addActionListener(this);
		skip.addActionListener(this);
		//addWindowListener(this);
	
		sleep(1000);
		talk1.setVisible(true);
		sleep(2000);
		talk2.setVisible(true);
		sleep(2000);
		talk3.setVisible(true);
		sleep(2000);
		talk4.setVisible(true);
		sleep(3000);
		talk5.setVisible(true);
		sleep(1500);
		t_pic_puzzle.setVisible(true);
		pie_blink.setVisible(true);
		t_num_puzzle.setVisible(true);
		pkg_sudoko.setVisible(true);
		ali_tic.setVisible(true);
		sleep(1000);
	}
	public void sleep(int x)
	{
		try
		{
			Thread.sleep(x);
		} 
		catch(Exception e){}

	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==t_pic_puzzle)
		{
				picpuzzle2 pic= new picpuzzle2();
		}
		else if(ae.getSource()==t_num_puzzle)
		{
			puzzle p = new puzzle();
		}
		else if(ae.getSource()==pie_blink)
		{
			last l=new last();
		}
		else if(ae.getSource()==pkg_sudoko)
		{
			sudoko s= new sudoko();
		}
		else if(ae.getSource()==ali_tic)
		{
			TTT1 tic=new TTT1();
		}
		else if(ae.getSource()==skip)
		{
			
		talk1.setVisible(true);

		talk2.setVisible(true);
		
		talk3.setVisible(true);

		talk4.setVisible(true);
	
		talk5.setVisible(true);
		
		t_pic_puzzle.setVisible(true);
		pie_blink.setVisible(true);
		t_num_puzzle.setVisible(true);
		pkg_sudoko.setVisible(true);
		ali_tic.setVisible(true);
	
		}
		
	}
		

	private JLabel talk1,talk2,talk3,talk4,talk5,l1;
	private JButton t_pic_puzzle,t_num_puzzle,pie_blink,pkg_sudoko,ali_tic,skip;
}
/*class My2
{
	public static void main(String args[])
	{
		Frame2 f2=new Frame2(); 
	}
}*/