package FinalExamPrep.RegularExpressions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employess {
    List<Person> employees;

    public Employess() {
        this.employees = new ArrayList<Person>();
    }

    public void add(Person person) {
        employees.add(person);
    }

    public void add(List<Person> persons) {
        for (Person p : persons) {
            employees.add(p);
        }
    }

    public void print() {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if (nextPerson.getEducation().equals(education)) {
                System.out.println(nextPerson);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            //ovdje nema ovo nextPerson = iterator.next jer onda ne bih mogla
            // iskoristiti ovu opciju remove jer ona radi samo iterator, jer je to
            //objekat klase Iterator i samo tu vazi, a ne vazi za neku obicnu varijablu next Person
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}



