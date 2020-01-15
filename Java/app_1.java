import java.applet.Applet;
import java.awt.*;
public class app_1 extends Applet
{
    public void paint(Graphics g)
    {
        Color c=new Color(25,45,200);
        setBackground(c);
        setForeground(Color.green);
        Image i=getImage(getCodeBase(),"5.jpg");
        g.drawImage(i,200,200,200,200,this);
        Font f=new Font("",Font.BOLD,24);
        g.setFont(f);
        Graphics g1=getGraphics();
        g.drawString(g1.toString(),200,200);
    }
}
/*<applet code="app_1.java" height=700 width=700>
</applet>*/