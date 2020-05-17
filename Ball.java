import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class Ball extends Applet implements Runnable, KeyListener
{
	int kx=250, ky=250;
	int r1= 30;
	Thread t=null;int c=3;
	boolean stopFlag;
	boolean flag=false;
	int x1=30, y1=60;
	int life= 5;
	long score = 0;
	int sc=1;
	long high=0;
    int u=6;
    boolean f2=true;
	public void init()
	{
		addKeyListener(this);
		requestFocus();
	}
	
	public void start()
	{
		t = new Thread(this);
		stopFlag=false;
		if(!f2)t.start();
		
	}
	public void keyPressed (KeyEvent ke)
	{
		int key = ke.getKeyCode();
		switch(key)
		{	case KeyEvent.VK_F2: start();break;
			case KeyEvent.VK_UP: c=1;showStatus("UP");break;
			case KeyEvent.VK_DOWN: c=2;showStatus("DOWN");break;
			case KeyEvent.VK_LEFT: c=3;showStatus("LEFT");break;
			case KeyEvent.VK_RIGHT: c=4;showStatus("RIGHT");break;
			case KeyEvent.VK_F1: life=5;score=0;r1=30;start();u=6;break;
			case KeyEvent.VK_SHIFT: sc=sc+1;u--;if(u==0) u=6;
		}
	}
	
	public void run()
	{
		for(;;)
		{	try{
			repaint();
			switch(c)
			{
				case 1: ky--; break;
				case 2: ky++; break;
				case 3: kx--; break;
				case 4: kx++;break;
			
			}Thread.sleep(u);
			if(ky==(500-r1)) {life--;c=1;}
			if(ky==0) {life--;c=2;}
			if(kx==(500-r1)) {life--;c=3;}
			if(kx==0) { c=4; life--;}	
			if (x1>kx-10&&x1<(kx+r1)&&y1>ky-10&&y1<(ky+r1)) {flag=true;score=(score+sc*(r1*2));repaint();}
			if(life==-1) {repaint();stopFlag=true;}
			if(stopFlag) break;
			}catch(Exception e) {}
		}
	}
	public void keyReleased(KeyEvent ke) {}
	public void keyTyped(KeyEvent ke) {}
	public void stop() {
	stopFlag = true;
	t = null;
	}
public void paint(Graphics g)
{	
	if(f2)
	{
	g.drawString("GRAB THEM BALLS!",150, 200);
	g.drawString("Press F2 to start the game.", 150, 300); f2=false;}
	Random x= new Random();

	if(flag)
	{	r1=r1+5;
		 x1= 15+x.nextInt(440);
		 y1 = 15+x.nextInt(440);flag=false;
	}
	g.setColor(Color.blue);
	g.fillOval(x1, y1, 10, 10);
	g.setColor(Color.green);
	g.fillOval(kx, ky, r1, r1);
	g.setColor(Color.black);
	g.drawLine(0, 500, 500, 500);
	g.drawLine(0, 501, 500, 501);
	g.drawLine(0,0,0,500);
	g.drawLine(500,0,500,500);
	g.drawLine(1,0,1,500);
	g.drawLine(499,0,499,500);
	g.drawLine(0,0,500,0);
	g.drawLine(0,1,500,1);
	
	g.drawString("Speed Setting: " + (7-u) + "x", 350, 50);
	g.drawString("You lose lives on hitting the walls.",20, 525);
	g.drawString("Remaining lives: ", 100, 550);
	g.drawString("Score: "+score, 100, 565);
	g.drawString("Press SHIFT to increase level and multiply your score!", 100, 580);
	if(life==-1)
	{
	if(score>high||score==high)
		{high=score;g.drawString("New Highscore!", 150, 275);}
	else g.drawString("Highscore: "+ high, 150, 275);
	g.drawString("Final score: "+score, 150, 250);
	
	g.drawString("Press F1 to restart the game!", 150, 300);}
	g.setColor(Color.red);
	 
     for(int i =1; i<=life; i++)
	{
		g.fillOval(200+i*20, 540, 10, 10);
	}
}
}