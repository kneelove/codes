/**
 * Created by Nilav on 3/26/2017.
 */

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.*;
import java.util.*;
public class coinjam {
    public static ArrayList<Integer> primenumber= new ArrayList<Integer>();
    private static int n=4;
    private static ArrayList<Integer> coin = new ArrayList<>();

    public static void main(String args[]) {

        ArrayList<Integer> number= new ArrayList<Integer>(generate(n));
        System.out.println("The total strings are"+number);
       interpret(number);


    }

    private static void interpret(ArrayList<Integer> number) { boolean check = false;
        for (int i=0;i<coin.size();i++) {
            for(int j=2;j<=10;j++)
            {  String pass = (number.get(i)).toString();
                System.out.println("Output for "+pass+" with radix "+j+" is"+Integer.parseInt(pass,j));
               if(prime(Integer.parseInt(pass,j))==false)
               {
                   primenumber.add(Integer.parseInt(pass,j));

               }

            }
            System.out.println(primenumber);
            System.out.println("*******************************************");

        }

    }
    private static boolean prime(int n)
    {
        int i,m=0;boolean flag=false;
        //it is the number to be checked
        m=n/2;
        for(i=2;i<=m;i++){
            if(n%i==0){
                //System.out.println("Number is not prime");
                flag=false;
                break;
            }
            else flag = true;
        }
        return flag;
            //System.out.println("Number is prime");

    }
    private static ArrayList<Integer> generate(int n) {

        int[] arr = new int[n];
        arr[0]=1;
        arr[arr.length-1]= 1;
        StringBuilder str = new StringBuilder();
        for(int i=1;i<arr.length-1;i++)
        {
            arr[i]=0;

        }
        for (int u : arr)
        {
            str.append(u);
        }
        int Inter = Integer.parseInt(str.toString());
        coin.add(Inter);

        int[] res;
        res = new int[n];
        System.arraycopy(arr,0,res,0,arr.length);

        arr[0] = 1;
        arr[arr.length - 1] = 1;
        int[] cop = new int[n];
        for (int i = 1; i <= arr.length - 2; i++) {
            for (int j = i; j <= arr.length - 2; j++) {
                arr[j] = 1;

                StringBuilder strNum = new StringBuilder();

                for (int num : arr)
                {
                    strNum.append(num);
                }
                int finalInt = Integer.parseInt(strNum.toString());
                //System.out.println(finalInt);
                coin.add(finalInt);
            }
            System.arraycopy(res,0,arr,0,res.length);



        }

        return coin;
    }
}
