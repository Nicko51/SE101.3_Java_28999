
package com.mycompany.lab_01;

public class Item 
{
    protected int location;
    protected String Description;
    public Item(int lo,String de)
    {
        this.location=location;
        this.Description=Description;
    }
    public void setlocation(int location)
    {
        this.location=location;
    }
    public int getlocation()
    {
        return location;
    }
    public void setDescription(String Description)
    {
        this.Description=Description;
    }
    public String getDescription()
    {
        return Description;
    }
    public void display()
    {
        System.out.println("The location is: "+location);
        System.out.println("The Description is: "+Description);
    }
}
