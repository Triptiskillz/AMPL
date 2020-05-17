
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.*;
import java.net.URL;

class sudoko extends JFrame implements ActionListener
{
	int a[][] ={   {5, 3, 4, 6, 7, 8, 9, 1, 2},
                     {6, 7, 2, 1, 9, 5, 3, 4, 8},
                     {1, 9, 8, 3, 4, 2, 5, 6, 7},
                     {8, 5, 9, 7, 6, 1, 4, 2, 3},
                     {4, 2, 6, 8, 5, 3, 7, 9, 1},
                     {7, 1, 3, 9, 2, 4, 8, 5, 6},
                     {9, 6, 1, 5, 3, 7, 2, 8, 4},
                     {2, 8, 7, 4, 1, 9, 6, 3, 5},
                     {3, 4, 5, 2, 8, 6, 1, 7, 9} };
	
	Button b[]=new Button[90];
	int button_flag;
	Panel p1,p2;
	Button click_button1,click_button2,submit;
	JLabel l1= new JLabel();
	JOptionPane op=new JOptionPane();
	URL urlsudoko=this.getClass().getResource("mypack\\urlsudoko.jpg");
	Icon sudoku = new ImageIcon(urlsudoko);	
	
	public sudoko()
	{
	
		Dimension s=Toolkit.getDefaultToolkit().getScreenSize();
		
		setBounds(0,0,1300,800);
		setResizable(false);
		setVisible(true);
		setLayout(null);
		setTitle("Sudoku");
		//Dimension s=Toolkit.getDefaultToolkit().getScreenSize();
		//setSize(s.width,(s.height));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		button_flag=1;
		create();	
	}

	public void create()
	{
		
		p1=new Panel();
		p2=new Panel();
		submit=new Button("Submit");
		
		l1.setIcon(sudoku);
		p1.setLayout(new GridLayout(9,9));
		p1.setBackground(new Color(0,0,0));
		p1.setBounds(30,30,729,729);
		
		submit.setFont(new Font("Algerian", 3, 36));
		
		p2.setLayout(new GridLayout(3,3));
		p2.setBounds(800,240,300,300);
		p2.setBackground(new Color(0,0,0));
		
		submit.setBounds(850,600,150,150);
		l1.setBounds(0,0,1500,850);

		int c=1;
		for(int i=81;i<90;i++)
		{
			
			b[i]=new Button(""+c);
			b[i].setFont(new Font("Algerian", 1, 48));
			b[i].addActionListener(this);
			p2.add(b[i]);
			c++;
		}
		p2.setEnabled(false);
		add(p1);
		add(p2);
		add(submit);
		add(l1);
		submit.addActionListener(this);
		game();
	}
	public void game()
	{
		try
		{
		Scanner sc = new Scanner(System.in);
        int r=0,c=0;
			
     	Random rand = new Random();
     	int q=0;
	 	for (int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
			r = rand.nextInt(9);
	     	c = rand.nextInt(9);
			
			if(a[r][c]==a[i][j]||a[r][c]==a[j][i]||a[c][r]==a[i][j]||a[c][r]==a[j][i])
		    {
				b[q]=new Button("");
				b[q].addActionListener(this);
				b[q].setFont(new Font("Algerian", 1, 48));
				p1.add(b[q]);
			    System.out.print("  ");
			}
			else
			{
				b[q]=new Button(""+a[i][j]);
				b[q].setFont(new Font("Algerian", 1, 48));
				p1.add(b[q]);
			    b[q].addActionListener(this);
				b[q].setEnabled(false);
				System.out.print(a[i][j]+" ");
			}
			q++;
			}
			System.out.println();
		}
		}
		catch(Exception e)
		{
		System.out.println(e);
		}				
	
	}
	public void check()
	{
		int q=0;
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				int x=Integer.parseInt(b[q].getLabel());
				if(a[i][j]!=x)
				{
					q=1;
					break;
				}	//back
				q++;
		
				
			}
		}
		if(q==81)
		{
			JOptionPane.showMessageDialog(null,"Congratulations! You Win");
			//back
		}
		else
			JOptionPane.showMessageDialog(null,"OHH! You Lose");
			//back
	}
    
	
	public void actionPerformed(ActionEvent ae)
	{
		if (button_flag==1 && (Button)ae.getSource()!=submit)
		{
		 click_button1=(Button)ae.getSource();
		  
			button_flag=2;
			p1.setEnabled(false);
			p2.setEnabled(true);
		  
		}
		else if (button_flag==2 && (Button)ae.getSource()!=submit)
		{
			
			click_button2=(Button)ae.getSource();
			button_flag=1;
			click_button1.setLabel(click_button2.getLabel());
			p1.setEnabled(true);
			p2.setEnabled(false);
		  
		}
		else if(ae.getSource()==submit)
		{
			int q;
			for( q=0;q<81;q++)
			{		
				if(b[q].getLabel()=="")
				{
				JOptionPane.showMessageDialog(null,"Please Fill All Area");
				break;
				}
			}
		
			if(q==81)
			{
				check();
			}
		}		
	}
}
/*public class sudoko
{
	public static void main(String args[])
	{	
		sudo s=new sudo();
	}
}*/