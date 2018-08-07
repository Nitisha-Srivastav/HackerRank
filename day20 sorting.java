Input Format

The first line contains an integer,n , denoting the number of elements in array a. 
The second line contains n space-separated integers describing the respective values of a0,a1,....an-1 .

Print the following three lines of output:

Array is sorted in numSwaps swaps. 
where numSwaps is the number of swaps that took place.
First Element: firstElement 
where firstElement is the first element in the sorted array.
Last Element: lastElement 
where lastElement is the last element in the sorted array.
Solution-
  import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int numSwaps=0,firstElement=0,lastElement=0,temp;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length-1;j++)
        {
            if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                numSwaps++;
            }
           
        }}
         firstElement=a[0];
        lastElement=a[a.length-1];
        System.out.println("Array is sorted in "+numSwaps+" swaps.");
        System.out.println("First Element: "+firstElement);
        System.out.println("Last Element: "+lastElement);
    }
}
