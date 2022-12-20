package com.placements;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App
{
    String name="hello";
    int number=10;
    String hello=new String();

    public static void main( String[] args )
    {
        App obj=new App();
        obj.hello="Rahul raju";
        obj.hello.toUpperCase();
        System.out.println(obj.hello.replace("a","n"));
        String hvgh= obj.name+obj.number;
        System.out.println(hvgh);
        Scanner scanner=new Scanner(System.in);
       // obj.number=scanner.nextInt();
        System.out.println(obj.name+obj.number);
        System.out.println( "Hello World!" );
        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        List square = number.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(square);
        System.out.println(number);
        System.out.println("---------------------");
        List<String> names = Arrays.asList("Reflection", "collection", "stream");
        String result =  names.stream().sorted(String::compareTo).toArray().toString();
        System.out.println(result);
    }
}
