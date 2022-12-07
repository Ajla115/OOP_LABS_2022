package com.Week7;
/*Create a HashMap<String,String> object in the main method. Store the following people's names and nicknames into
the HashMap, the name being the key and the nickname its value. Use only lowercase letters.

matti's nickname is mage
mikael's nickname is mixu
arto's nickname is arppa*/
import java.util.HashMap;
public class Task1 {
    public static void main(String[] args) {
        HashMap <String, String> people = new HashMap<>();
        people.put("matti", "mage");
        people.put("mikael", "mixu");
        people.put("arto", "arppa");

        System.out.println("Matti's nickname is " + people.get("matti") + ".");


    }
}
