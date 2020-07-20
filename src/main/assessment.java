package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class assessment {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a string:");

    String userString = scan.nextLine();
    Map<Character, Boolean> map = new HashMap<>();
    ArrayList<Character> charOrderArr = new ArrayList<>();
    String output = "non-existent";

    for (char indexChar : userString.toCharArray()) {
      if (map.putIfAbsent(indexChar, true) == null) {
        charOrderArr.add(indexChar);
      } else {
        map.replace(indexChar, false);
      }
    }

    for (Character character : charOrderArr) {
      if (map.get(character)) {
        output = character.toString();
        break;
      }
    }

    System.out.println("The first non-repeated character in the given string is " + output + ".");
  }
}
