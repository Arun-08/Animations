
import java.awt.*;
import java.applet.*;
public class ani2 extends Applet implements Runnable
{
int x,y,fs;
Thread t;
public void init()
{
	t=new Thread(this);
	t.start();
	x=300;
	y=50;
	fs=20;
}
public void run()
{
	for(int i=1;i<=20;i++)
	{
		repaint();
		try 
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			
		}
	}
}
		
	public void paint(Graphics g)
	{
		float r,gr,b;
		r=(float)Math.random();
		gr=(float)Math.random();
		b=(float)Math.random();
		g.setColor(new Color(r,gr,b));
		g.drawString("Arun prasad",x,y);
		x=x-20;
		y=y+30;
		fs+=5;
	}
}


















