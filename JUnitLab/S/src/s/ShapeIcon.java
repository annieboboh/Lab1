/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s;
import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
   An icon that contains a moveable shape.
*/
public class ShapeIcon implements Icon
{
   public ShapeIcon(ArrayList<MoveableShape> shapes,
      int width, int height)
   {
      this.shapes = shapes;
      this.width = width;
      this.height = height;
   }
   
   public int getIconWidth()
   {
      return width;
   }

   public int getIconHeight()
   {
      return height;
   }

   public void paintIcon(Component c, Graphics g, int x, int y)
   {
      Graphics2D g2 = (Graphics2D) g;
      for (MoveableShape shape : shapes){
      shape.draw(g2);
      }
   }

   
   
   private int width;
   private int height;
   private MoveableShape shape;
   private ArrayList<MoveableShape> shapes = new ArrayList();
}


