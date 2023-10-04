// Multiply Matrices
// Given two square Matrices A[][] and B[][]. Your task is to complete the function multiply which stores the multiplied matrices in a new matrix C[][].
 
// Example 1:

// Input: 
// N = 2
// A[][] = {{7, 8}, {2 , 9}}
// B[][] = {{14, 5}, {5, 18}}

// Output: 
// C[][] = {{138, 179}, {73, 172}}

// PROBLEM LINK: https://practice.geeksforgeeks.org/problems/multiply-matrices/1

// CODE

//--------------------------------------------------------



/*Complete the function below*/
class GfG
{
      public static void multiply(int A[][], int B[][], int C[][], int N)
        {
           //add code here.
            int c1=A[0].length;
            int r2=B.length;
            if(c1 != r2)
            return;
            
           for(int i=0;i<C.length;i++)
           {
               for(int j=0;j<C[0].length;j++){
                   for(int k=0;k<c1;k++)
                    C[i][j]+=A[i][k]*B[k][j];
               }
           }
        }
}
