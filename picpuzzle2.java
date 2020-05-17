

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;  
import java.net.URL;
class picpuzzle2 extends JFrame implements ActionListener
{
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,sample,starB;
Icon star;
JLabel obj = new JLabel();
URL ur = (this.getClass().getResource("puzzle_shape_mosaic_118824_1920x1080.jpg"));// background image
Icon o = new ImageIcon(ur);
Icon ic0=new ImageIcon("1559831351827.png");
Icon ic10=new ImageIcon("1559831431015.png");
Icon ic20=new ImageIcon("1559831503850.png");
Icon samicon1=new ImageIcon("scv20190606_194512.jpeg");
Icon samicon2=new ImageIcon("scv20190606_194625.jpeg");
Icon samicon3=new ImageIcon("scv20190606_195713.jpeg");
Icon ic1=new ImageIcon("1559831351832.png");// first puzzle image
Icon ic2=new ImageIcon("1559831351822.png");
Icon ic3=new ImageIcon("1559831351829.png");
Icon ic4=new ImageIcon("1559831351819.png");
Icon ic5=new ImageIcon("1559831351825.png");
Icon ic6=new ImageIcon("1559831351821.png");
Icon ic7=new ImageIcon("1559831351818.png");
Icon ic8=new ImageIcon("1559831351814.png");
Icon ic9=new ImageIcon("1559831351827.png");

Icon ic11=new ImageIcon("1559831431013.png");// second puzzle image
Icon ic12=new ImageIcon("1559831431010.png");
Icon ic13=new ImageIcon("1559831431001.png");
Icon ic14=new ImageIcon("1559831431015.png");
Icon ic15=new ImageIcon("1559831431008.png");
Icon ic16=new ImageIcon("1559831430988.png");
Icon ic17=new ImageIcon("1559831430997.png");
Icon ic18=new ImageIcon("1559831431005.png");
Icon ic19=new ImageIcon("1559831430993.png");

Icon ic21=new ImageIcon("1559831503870.png");// third puzzle image
Icon ic22=new ImageIcon("1559831503865.png");
Icon ic23=new ImageIcon("1559831503877.png");
Icon ic24=new ImageIcon("1559831503858.png");
Icon ic25=new ImageIcon("1559831503873.png");
Icon ic26=new ImageIcon("1559831503850.png");
Icon ic27=new ImageIcon("1559831503854.png");
Icon ic28=new ImageIcon("1559831503875.png");
Icon ic29=new ImageIcon("1559831503862.png");

picpuzzle2(){

super("Picture Puzzle");
obj.setBounds(0,0,800,800);
b1=new JButton(ic1);
b1.setBounds(30,100,164,164);
b2=new JButton(ic2);
b2.setBounds(194,100,164,164);
b3=new JButton(ic3);
b3.setBounds(358,100,164,164);
b4=new JButton(ic4);
b4.setBounds(30,264,164,164);
b5=new JButton(ic5);
b5.setBounds(194,264,164,164);
b6=new JButton(ic6);
b6.setBounds(358,264,164,164);
b7=new JButton(ic7);
b7.setBounds(30,428,164,164);
b8=new JButton(ic8);
b8.setBounds(194,428,164,164);
b9=new JButton(ic9);
b9.setBounds(358,428,164,164);
sample=new JButton(samicon1);
sample.setBounds(700,100,495,495);
JLabel l1= new JLabel("Sample");
l1.setBounds(330,200,70,20);
JLabel l2=new JLabel("NOTE:: icon has power to swap with neighbour icon=>");
l2.setBounds(05,15,500,20);
JLabel l3=new JLabel("click sample picture to next puzzle");
l3.setBounds(750,645,200,20);
l3.setForeground(Color.red);

starB=new JButton(ic0);
starB.setBounds(330,5,50,50);
star=b9.getIcon();

add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(sample);add(l1);add(l2);add(starB);add(l3);add(obj);
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 b4.addActionListener(this); 
 b5.addActionListener(this);
 b6.addActionListener(this); 
 b7.addActionListener(this);
 b8.addActionListener(this);
 b9.addActionListener(this); 
sample.addActionListener(this);
obj.setIcon(o);
setLayout(null); // frame work
obj.setBounds(0,0,1500,800);
setSize(1500,800);
setLocationRelativeTo(null);
setVisible(true);
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}

public void actionPerformed(ActionEvent e){ // main method
if(e.getSource()==b1){
    Icon s1=b1.getIcon();
      if(b2.getIcon()==star){
        b2.setIcon(s1);
        b1.setIcon(star);
      } else if(b4.getIcon()==star){
                    b4.setIcon(s1);
                    b1.setIcon(star);
                   }
  }//end of if

if(e.getSource()==b2){
    Icon s1=b2.getIcon();
      if(b1.getIcon()==star){
        b1.setIcon(s1);
        b2.setIcon(star);
      } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b2.setIcon(star);
                   }
         else if(b3.getIcon()==star){
                    b3.setIcon(s1);
                    b2.setIcon(star);
                   }
  }//end of if

if(e.getSource()==b3){
    Icon s1=b3.getIcon();
      if(b2.getIcon()==star){
        b2.setIcon(s1);
        b3.setIcon(star);
      } else if(b6.getIcon()==star){
                    b6.setIcon(s1);
                    b3.setIcon(star);
                   }
  }//end of if
if(e.getSource()==b4){
    Icon s1=b4.getIcon();
      if(b1.getIcon()==star){
        b1.setIcon(s1);
        b4.setIcon(star);
      } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b4.setIcon(star);
                   }
         else if(b7.getIcon()==star){
                    b7.setIcon(s1);
                    b4.setIcon(star);
                   }
  }//end of if

if(e.getSource()==b5){
    Icon s1=b5.getIcon();
      if(b2.getIcon()==star){
        b2.setIcon(s1);
        b5.setIcon(star);
      } else if(b4.getIcon()==star){
                    b4.setIcon(s1);
                    b5.setIcon(star);
                   }
         else if(b6.getIcon()==star){
                    b6.setIcon(s1);
                    b5.setIcon(star);
                   }
          else if(b8.getIcon()==star){
                    b8.setIcon(s1);
                    b5.setIcon(star);
                   }
  }//end of if

if(e.getSource()==b6){
    Icon s1=b6.getIcon();
      if(b3.getIcon()==star){
        b3.setIcon(s1);
        b6.setIcon(star);
      } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b6.setIcon(star);
                   }
         else if(b9.getIcon()==star){
                    b9.setIcon(s1);
                    b6.setIcon(star);
                   }
}//end of if

if(e.getSource()==b7){
    Icon s1=b7.getIcon();
      if(b4.getIcon()==star){
        b4.setIcon(s1);
        b7.setIcon(star);
      } else if(b8.getIcon()==star){
                    b8.setIcon(s1);
                    b7.setIcon(star);
                   }
 }//end of if

   if(e.getSource()==b8){
    Icon s1=b8.getIcon();
      if(b7.getIcon()==star){
        b7.setIcon(s1);
        b8.setIcon(star);
      } else if(b5.getIcon()==star){
                    b5.setIcon(s1);
                    b8.setIcon(star);
                   }
         else if(b9.getIcon()==star){
                    b9.setIcon(s1);
                    b8.setIcon(star);
                   }

  }//end of if

 if(e.getSource()==b9){
    Icon s1=b9.getIcon();
      if(b8.getIcon()==star){
        b8.setIcon(s1);
        b9.setIcon(star);
      } else if(b6.getIcon()==star){
                    b6.setIcon(s1);
                    b9.setIcon(star);
                   }
  }//end of if

if(e.getSource()==sample){
Icon s1=sample.getIcon();
 if(s1==samicon3){
sample.setIcon(samicon1);
b1.setIcon(ic1);
b2.setIcon(ic2);
b3.setIcon(ic3);
b4.setIcon(ic4);
b5.setIcon(ic5);
b6.setIcon(ic6);
b7.setIcon(ic7);
b8.setIcon(ic8);
b9.setIcon(ic9);
star=b9.getIcon();
starB.setIcon(ic0);
}//end of else
else if(s1==samicon1){
sample.setIcon(samicon2);
b1.setIcon(ic11);
b2.setIcon(ic12);
b3.setIcon(ic13);
b4.setIcon(ic14);
b5.setIcon(ic15);
b6.setIcon(ic16);
b7.setIcon(ic17);
b8.setIcon(ic18);
b9.setIcon(ic19);
star=b6.getIcon();
starB.setIcon(ic10);
}//end of else
else{
sample.setIcon(samicon3);
b1.setIcon(ic21);
b2.setIcon(ic22);
b3.setIcon(ic23);
b4.setIcon(ic24);
b5.setIcon(ic25);
b6.setIcon(ic26);
b7.setIcon(ic27);
b8.setIcon(ic28);
b9.setIcon(ic29);
star=b6.getIcon();
starB.setIcon(ic20);
JOptionPane.showMessageDialog(picpuzzle2.this,"!!!you won!!!");
}
}
}
}