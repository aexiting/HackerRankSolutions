import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[100];
          for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            array[num]++;
}
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
}
}
}
