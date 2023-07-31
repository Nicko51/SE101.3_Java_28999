
package com.mycompany.lab_7;

public class Circle extends Shape
{
    private int radius;
    public Circle(int r)
  {
      radius=r;           
  }
  double calculateArea()
  {
      return Math.PI*radius*radius;
  }
}
