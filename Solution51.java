import java.io.*;
import java.util.*;

public class Solution51 {
    static int count = 0;
    public static void insertionSortPart2(int[] A)
    {       
           for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > value){
                A[j + 1] = A[j];
                count++;
                j = j - 1;
            }
            A[j + 1] = value;
        }
        System.out.println(count);
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);                    
    }    
}
