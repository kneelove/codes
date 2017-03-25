package com.company;
/**
 * Created by nilav on 3/23/2017.
 */
import java.io.*;
import java.util.Scanner;

public class pancake {
    public static void main(String ar[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Stack");
        String s = sc.next();


        calculate(s);
    }
    public static void calculate(String a)
    {
        String sub = flipper(a);
        System.out.println(a);
        valchange(sub);
    }

    public static String flipper(String a) {

        int position = findval(a);

        String c = a.substring(0, (position-1));
        System.out.println("substring is "+ c);
        return c;
    }

    public static int findval(String arr) {
        int position = 0;
        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i) == '+') {
                position = i+1;
            }
        }
        return position;
    }
    public static void valchange(String s)
    {char[] buf = new char[s.length()];
        for(int i=0;i<s.length();i++)
        { buf[i]=s.charAt(i)=='-'?'+':'-';

        }
        buf.toString();
        System.out.println(buf);
System.out.println("Lets use github");

    }}
