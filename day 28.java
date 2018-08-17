Sample Input

6
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
tanya tanya@gmail.com
Sample Output

julia
julia
riya
samantha
tanya
solution-
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt(), k=0;
        
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
          String[] names = new String[N];
        String regex = "[a-z]+@gmail\\.com$";
        Pattern p = Pattern.compile(regex);

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
             Matcher m = p.matcher(emailID);
            if(m.find()) {
                //System.out.println(firstName);
                names[k++] = firstName;}
        }
  String[] names2 = new String[k];
        System.arraycopy(names, 0, names2, 0, k);


        Arrays.sort(names2);

        for (int i =0; i<names2.length; i++) {
            System.out.println(names2[i]);
        }
        

        scanner.close();
    }
}
