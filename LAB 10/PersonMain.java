/*package com.week12;


import com.week12.people.Teacher;
import com.week12.people.Person;
import com.week12.people.Student;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
        System.out.println(pekka);
        System.out.println(esko);
        System.out.println("\n");

        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits "+ olli.credits());
        System.out.println("\n");

        Student olli2 = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println( olli2 );
        olli2.study();
        System.out.println( olli2 );
        System.out.println("\n");

        Teacher pekka2 = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher esko2 = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
        System.out.println( pekka2 );
        System.out.println("\n");
        System.out.println( esko2 );
        System.out.println("\n");

        Student olli3 = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
        for ( int i=0; i < 25; i++ ) {
            olli3.study();
        }
        System.out.println( olli3 );
        System.out.println("\n");

        /*Implement the method public static void printDepartment(List<Person> people) in the Main class, default package.
        The method prints all the people in the parameter list
         */

        /*List<Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );

        printDepartment(people);
    }

    public static void printDepartment(List<Person> people) {
        for(Person person : people){
            System.out.println(person);
        }
    }

}
*/