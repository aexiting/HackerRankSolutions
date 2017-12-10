import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigSorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
         // }
        mergeSort(unsorted,0,unsorted.length-1);
        for(String a : unsorted){
            System.out.println(a);
                              }

    }
    private static int compare(String a, String b){
            if(a.length() == b.length()){
          for (int i = 0; i < a.length(); i++){
            char left = a.charAt(i);
            char right = b.charAt(i);
            if (left != right)
                return left - right;
            }
        }
            else
            {
                return a.length() - b.length();
            }
            return 0;
    }
    private  static void merge(String[] arr, int l, int m,int r){
        //make temp arrays
        String[] L = new String[m-l +1];
        String[] R = new String[r- m];
        for(int i = 0; i < L.length; i++){
            L[i] = arr[i+l];
        }
        for(int i = 0; i < R.length; i++){
            R[i] = arr[m+ 1 + i];
        }
        int valueR = 0;
        int valueL = 0;
        int x = l;
        int compare;
        while(valueR < R.length && valueL < L.length){
        compare = compare(R[valueR],L[valueL]);
            if(compare <= 0){
                arr[x] = R[valueR];
                valueR++;
            }
            else {
                arr[x] = L[valueL];
                valueL++;
            }
            x++;
        }
        if(valueR == R.length){
            for(int i = valueL; i < L.length; i++){
                arr[x] = L[i];
                x++;
            }
        }
         if(valueL == L.length){
            for(int i = valueR; i < R.length; i++){
                arr[x] = R[i];
                x++;
            }
        }
    }
    private static void mergeSort(String[] arr, int l, int r){
        if(l < r){
            int m = (l+r)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr, l, m, r);
        }
}
}
