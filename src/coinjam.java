/**
 * Created by Nilav on 3/26/2017.
 */import java.io.*;
import java.util.*;
public class coinjam {

    private static int n=6;
    private static ArrayList<Integer> coin = new ArrayList<>();

    public static void main(String args[]) {

        generate(n);



    }

    private static void generate(int n) {
        int[] arr = new int[n];
        arr[0]=1;
        arr[arr.length-1]= 1;
        for(int i=1;i<arr.length-1;i++)
        {
            arr[i]=0;
        }
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
                System.out.println(finalInt);
                coin.add(finalInt);
            }
            System.arraycopy(res,0,arr,0,res.length);



        }
        //System.out.print(coin);

    }
}
