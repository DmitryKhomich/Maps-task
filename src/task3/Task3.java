package task3;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Task3 {

    public static void main(String[] args) {
        System.out.println("Initial contacts: ");
        printData(getInitMap());
        System.out.println();
        System.out.println("Updated contacts: ");
        printData(updateInitMap(getInitMap()));
    }

    static LinkedHashMap<String, String> getInitMap(){
        LinkedHashMap<String,String> map = new LinkedHashMap<>();
        map.put("Tom", "tom@mail.com");
        map.put("Lisa","lisa@mail.com");
        map.put("Alice", "alisa@mail.com");
        map.put("Den", "den@mail.com");
        return map;
    }

    static LinkedHashMap<String, String> updateInitMap(LinkedHashMap<String, String> map){
        map.replace("Tom","tom@mail.com","tomasdev@glob.net");
        return map;
    }

    static void printData(LinkedHashMap<String, String> map){
        AtomicInteger counter = new AtomicInteger(1);
        for (var m: map.entrySet()){
            System.out.println(counter + ") " + m.getKey() + " - " + m.getValue()) ;
            counter.getAndIncrement();
        }
    }
}
