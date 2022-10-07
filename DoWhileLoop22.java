package Looping;

public class DoWhileLoop22 {
    public static void main(String[] args) {
        
        int a = 10;

        while(a<5){   // this will not execute bcoz condition not satisfied
            System.out.println(a);

            a++;
        }

        System.out.println("-----------------DO While ---------------------");
        // This will run atleast once becauase condition will be checked after 1st execution
        int i=10;
        do{
            System.out.println(a);
            i++;
        }while(i<5);

        System.out.println("-----------------n natural no. using DO While ---------------------");

        int n = 10; // lets taking n = 10

        int j=1;
        do{

            System.out.println(j);
            j++;
        }while(j<=n);
        
    }
}
