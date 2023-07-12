package task1;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Task1 {

    public static void main(String[] args) {
        printInitialData(getInitialMap());
        System.out.println();
        printUpdatedData(updateInitialMap(getInitialMap()));
    }

    static HashMap<String, Integer> getInitialMap(){
        HashMap<String, Integer> init = new HashMap<>();
        init.put("orange", 12);
        init.put("banana", 25);
        init.put("lemon", 8);
        init.put("pineapple", 13);
        init.put("grape", 9);
        return init;
    }

    static void printInitialData(HashMap<String, Integer> map){
        System.out.println("Initial data: ");
        AtomicInteger counter = new AtomicInteger(1);
        for (var m: map.entrySet()){
            System.out.println(counter + ") " + m.getKey() + ", " + m.getValue() + " kg") ;
            counter.getAndIncrement();
        }
    }

    static HashMap<String, Integer> updateInitialMap(HashMap<String, Integer> map){
        map.put("plum", 15);
        map.replace("banana", 25,14);
        return map;
    }

    static void printUpdatedData(HashMap<String, Integer> map){
        System.out.println("Updated data: ");
        AtomicInteger counter = new AtomicInteger(1);
        for (var m: map.entrySet()){
            System.out.println(counter + ") " + m.getKey() + ", " + m.getValue() + " kg") ;
            counter.getAndIncrement();
        }
    }
}
