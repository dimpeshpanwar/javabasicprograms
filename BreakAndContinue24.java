package Looping;

public class BreakAndContinue24 {
    public static void main(String[] args) {
        
        // Break and Continue using loops

        // ********************************** break : to exit the loop ********************************************
       
        for(int i=0; i<5; i++){
            
                if(i==2){
                        System.out.println("Ending the loop");
                        break;
                    }
                System.out.println(i);
                System.out.println("Java is great");
        }
        System.out.println("Loop ends here");




       //****************** continue : terminate the specific iteration and continue the loop further *************

        // for(int i=0; i<5; i++){
            
        //     if(i==2){
        //         System.out.println("Skipping this iteration here");
        //         continue;
        //     }
        //     System.out.println(i);
        //     System.out.println("Java is great");
        // }
        // System.out.println("Loop ends here");
    }
}
