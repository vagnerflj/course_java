package application;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "Maria@gmail.com");
        cookies.put("phone", "99425784");

        cookies.remove("email");
        cookies.put("phone", "4388888888");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());




        System.out.println("All cookies:");
        for(String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }



        sc.close();
    }
}