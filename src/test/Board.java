package test;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.*;
import javax.swing.JPanel;

public class Board extends JPanel{

    public void paint(Graphics g)
    {

    	double 
    	lx1=55,
    	lx2=160,
    	ly1=70,
    	ly2=130,
    	rx1=120,
    	rx2=170,
    	ry1=120,
    	ry2=140;
    	Line2D line=new Line2D.Double(lx1,ly1,lx2,ly2);
    	Rectangle2D rect=new Rectangle2D.Double(rx1,ry1,rx2,ry2);
    	String str=new String("ololol:"+(line.intersects(rect)));
    	super.paint(g);
    	
    Graphics2D g2 = (Graphics2D) g;

      RenderingHints rh =
            new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                               RenderingHints.VALUE_ANTIALIAS_ON);

      rh.put(RenderingHints.KEY_RENDERING,
             RenderingHints.VALUE_RENDER_QUALITY);

      g2.setRenderingHints(rh);

      Dimension size = getSize();
      double w = size.getWidth();
      double h = size.getHeight();

      Ellipse2D e = new Ellipse2D.Double(0, 0, 80, 130);
      g2.setStroke(new BasicStroke(1));
      g2.setColor(Color.gray);

      g2.drawString(str, 40, 40);
      g2.drawLine((int)lx1, (int)ly1, (int)lx2, (int)ly2);
      g2.drawRect((int)rx1, (int)ry1, (int)rx2, (int)ry2);
    }
}