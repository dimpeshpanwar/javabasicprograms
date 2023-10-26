import java.io.*;
import java.util.*;

public class SlidingWindowMax{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = sc.nextInt();
    }

    int k = sc.nextInt();
   int idx =0;
    // code
    int res[] = new int[a.length -k+1];
    Deque<Integer> dq = new ArrayDeque<>();

    for(int i =0;i<a.length;i++){
       // remove First()
       if(dq.size() >0 && dq.getFirst() <= i-k){
          dq.removeFirst();
       }
       // remove last 
       while(dq.size() >0 && a[dq.getLast()] < a[i]){
          dq.removeLast();
       } 
       // add Last 
       dq.addLast(i);

       // adding in the res array 
       if(i >=  k-1){
          // when this condition, then we will ad in the resultant array 
          res[idx++] = a[dq.getFirst()];
       }
    }
    System.out.println("resultant array  ");
    for(int i: res){
       System.out.print(i+" ");
    }
    System.out.println();
 }
}