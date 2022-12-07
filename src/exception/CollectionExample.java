package exception;


import java.util.*;
import java.util.stream.Collectors;

public class CollectionExample {


    public void abc() {
        List<String> list = new LinkedList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("DDD");
        list.add("AAA");
        list.add("CCC");

//      Boolean a =  list.stream().anyMatch(e->e.contains("AAA"));

      List<String> b =  list.stream().filter(e-> e.contains("A")).collect(Collectors.toList());

//        System.out.println(b);

        String  c = String.valueOf(list.stream().filter(e-> e.contains("A")).findAny());
        System.out.println(c);

     List<String> distinct =   list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);




//        for(String i: list){
//            System.out.println(i);
//        }


//        Iterator<String> it = list.iterator();
//
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

//        list.forEach(System.out::println);


    }

    public void set() {

        Set<String> set = new HashSet<>();
        set.add("AAA");
        set.add("BBB");
        set.add("DDD");
//        set.add("AAA");
        set.add("CCC");
//        set.add(null);
        set.add(null);
        set.add("");

        for (String i : set) {
            System.out.println(i);
        }


    }

    public void hashMapImplementation() {
        Map<Integer, String> map = new HashMap<>();
        //Adding elements to map
        map.put(1, "Amit");
        map.put(5, "Rahul");
        map.put(2, "Jai");
        map.put(6, "Amit");

//        System.out.println(map);



        for (Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
    }


    public static void main(String[] args) throws Exception {
        CollectionExample t1 = new CollectionExample();
        t1.abc();


    }
}
