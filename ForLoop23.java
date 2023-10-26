package Looping;

public class ForLoop23 {
    public static void main(String[] args) {
        
        for(int i = 1; i<=10 ; i++){
            System.out.println(i);
        }

        // First 5 odd numbers 
        System.out.println("First 5 odd numbers ");
        for(int i=0 ; i<5 ; i++){
            System.out.println(2*i+1);
        }

        System.out.println("Decrement for loop");
        for(int i=5 ; i>0 ; i--){
            System.out.println(i);
        }
    }
}
