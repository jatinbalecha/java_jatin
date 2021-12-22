
 import java.awt.*;
 import java.applet.*;
 import java.awt.event.*;
/*
<applet code="Jatin.class" height="1000" width="1000"></applet>
*/
  
public class Jatin extends Applet implements ActionListener {

 Button b =new Button("up");
 Button b1 =new Button("down");
 Button b2 =new Button("left");
 Button b3 =new Button("right");


  int x=100,y=100,size=500;



 
 public void init()
{
add(b2);
add(b3);
add(b1);
add(b);

b.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}               
 

public void actionPerformed(ActionEvent e)

{
if(e.getSource()==b)           //up
{
 y=y-20;
 
}

if(e.getSource()==b1){      //down
 
  y=y+20;


}
if(e.getSource()==b2)           //right
{
 x=x-20;
 
}

if(e.getSource()==b3){      //left
 
  x=x+20;


}
repaint();
}
   








    public void paint(Graphics g)
    {
   
	
        // Oval for face outline
	g.setColor(Color.YELLOW);
        g.fillOval(x,y-50,size-300,size-300);                                     

	  
        // Ovals for eyes
        // with black color filled
        g.setColor(Color.BLACK);
        g.fillOval(x+55, y, 10, 20);
        g.fillOval(x+130,y, 10, 20);
	g.fillOval( x+70,y+50, size/8, size/8);  
        
    }
}