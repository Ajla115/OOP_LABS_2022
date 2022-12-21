package com.Week9.mooc;

import com.Week9.mooc.logic.ApplicationLogic;
import com.Week9.mooc.ui.TextUserInterface;
import com.Week9.mooc.ui.UserInterface;

public class UserInterfaceMain {
    public static void main(String[] args) {
       UserInterface ui = new TextUserInterface();
        //ne mozemo ovdje napisati new UserInterface jer se tako ne instatiate new interface,
        // mozemo interface pozvat kroz klasu kao sto je to ovdje uradeno
        new ApplicationLogic(ui).execute(3);


        Person p = new Person("Name", 121);
    }
}
