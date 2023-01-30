package com.week12.people;

/*Create the class Teacher in the same package. Teacher inherits Person, but they also have a salary,
which together with the teacher information in String form
 */
public class Teacher extends Person{
    private int salary;

    public Teacher(String newName, String newAddress, int newSalary){
        super(newName, newAddress);
        this.salary = newSalary;
    }

    @Override
    public String toString(){
        return super.toString() + "\nsalary " + this.salary + " euros/month";
    }
}


