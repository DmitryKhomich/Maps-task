package task2;

import java.util.HashMap;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Enter a product which you want to know, how many is it. Available options: table, chair, lamp, pen, pencil ");
        printAmountOfProduct(getInitialData());
    }

    static String getProductWhichYouWantToFind(Scanner scanner){
        return scanner.nextLine().trim();
    }

    static Scanner createScanner(){
        return new Scanner(System.in);
    }

    static HashMap<String, Integer> getInitialData(){
        HashMap<String, Integer> init = new HashMap<>();
        init.put("table", 112);
        init.put("chair", 29);
        init.put("lamp", 123);
        init.put("pen", 657);
        init.put("pencil", 1024);
        return init;
    }

    static void printAmountOfProduct(HashMap<String, Integer> map){
        System.out.println("Amount is " + map.get(getProductWhichYouWantToFind(createScanner())));
    }
}
