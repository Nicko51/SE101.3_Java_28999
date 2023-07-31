
package com.mycompany.lab_7;

public class Rectangle extends Shape
{   
  private int length;
  private int width;
  public Rectangle(int l,int w)
  {
      length=l;
      width=w;           
  }
  double calculateArea()
  {
      return length*width;
  }
}
