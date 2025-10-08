import java.util.*;

public class MoodPredictor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🌞 Welcome to Mood Predictor 🌞");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        String[] moods = {
            "Happy 😊", 
            "Sad 😔", 
            "Excited 🤩", 
            "Stressed 😣", 
            "Peaceful 😌", 
            "Energetic ⚡", 
            "Lazy 😴", 
            "Motivated 🚀"
        };

        // Use current time + name hash to make it feel more "personal"
        int hash = Math.abs((name.hashCode() + Calendar.getInstance().get(Calendar.MINUTE)) % moods.length);
        String mood = moods[hash];

        System.out.println("\nHello " + name + "!");
        System.out.println("Today, your mood prediction is: " + mood);

        System.out.println("\nTip: Remember, your mood is what you make it. Stay positive! 🌈");
        sc.close();
    }
}
