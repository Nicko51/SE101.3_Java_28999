
package com.mycompany.lab_3_2;
public class Lab_3_2 {

    public static void main(String[] args) 
    {
        Employee1 e1=new Employee1();
        e1.setage(25);
        e1.setname("Sunil");
        e1.setsalary(20000);
        System.out.println("Your name is "+e1.getname());
        System.out.println("Your age is: "+e1.getage());
        System.out.println("Your current salary is: "+e1.getsalary());

    }
}
