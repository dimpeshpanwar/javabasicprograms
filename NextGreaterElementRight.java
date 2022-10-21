import java.util.*;
import java.io.*;

public class NextGreaterElementRight{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = sc.nextInt();
    }

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
   Stack<Integer> st = new Stack<>();
   int nge[] = new int[arr.length];
   Arrays.fill(nge,-1);
  for(int i =arr.length-1;i>=0;i--){
    //pop smaller to the right 
    while(st.size() >0  && arr[i] >= arr[st.peek()]){
      st.pop();
    }
    if(st.size() >0){
      nge[i] = arr[st.peek()];
    }
    st.push(i);
  }
   return nge;
 }

}