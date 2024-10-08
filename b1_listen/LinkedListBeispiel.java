package b1_listen;

import java.util.LinkedList;

public class LinkedListBeispiel {

    public static void main(String[] args) {
        

        LinkedList<String> programmiersprachen = new LinkedList<>();

        programmiersprachen.add("Java");
        programmiersprachen.add("Python");
        programmiersprachen.add("C++");

        for (String sprache : programmiersprachen) {
            System.out.println(sprache);
        }

        System.out.println("---remove index 2--");

        programmiersprachen.remove(2);

        for (String sprache : programmiersprachen) {
            System.out.println(sprache);
        }

        System.out.println("---addFist--");

        programmiersprachen.addFirst("PHP");

        for (String sprache : programmiersprachen) {
            System.out.println(sprache);
        }

        System.out.println("--add Last---");

        programmiersprachen.addLast("JavaScript");

        for (String sprache : programmiersprachen) {
            System.out.println(sprache);
        }

        System.out.println("---pop--");

        programmiersprachen.pop();

        for (String sprache : programmiersprachen) {
            System.out.println(sprache);
        }

        System.out.println("--poll last---");

        programmiersprachen.pollLast();

        for (String sprache : programmiersprachen) {
            System.out.println(sprache);
        }

        System.out.println("-----");


    }
    
}