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


        System.out.print(calculate(s));
    }
    public static int calculate(String a)
    {int count=0;
        char[] arr = a.toCharArray();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) count++;
        }
        if (arr[arr.length-1] == '-') count++;
        return count;
    }

   /* public static String flipper(String a) {

        int position = findval(a);

        String c = a.substring(0, (position-1));
        //System.out.println("substring is "+ c);
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
    public static String valchange(String s)
    {char[] buf = new char[s.length()];
        for(int i=0;i<s.length();i++)
        { buf[i]=s.charAt(i)=='-'?'+':'-';

        }
        return buf.toString();



    }
*/}
