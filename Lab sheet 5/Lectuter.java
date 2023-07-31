
package com.mycompany.lab_5;

public class Lectuter extends Person
{
    private String program;
    public Lectuter(int id,String name,String program)
    {
        super(id,name);
        this.program=program;
    }
    public void setProgram(String program)
    {
        this.program=program;
    }
    public String getProgram()
    {
        return program;
    }
}
