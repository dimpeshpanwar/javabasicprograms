
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner scan=new Scanner(System.in);
		int r,b,c;
		r=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		for(int i=r;i>=0;i--)
		{
		    int j=c-i;
		    if(j>=0 && j<=b)
		    {
		        System.out.println(i+" "+j);
		    }
		}
	}
}
