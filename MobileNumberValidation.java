import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidation {
    public static void main(String[] args) {
        String phoneNumber = "+1234567890"; // Replace with the mobile number to validate

        boolean isValid = validateMobileNumber(phoneNumber);
        if (isValid) {
            System.out.println("Mobile number is valid.");
            String countryCode = extractCountryCode(phoneNumber);
            System.out.println("Country Code: " + countryCode);
        } else {
            System.out.println("Mobile number is invalid.");
        }
    }

    // Function to validate a mobile number with a country code
    public static boolean validateMobileNumber(String phoneNumber) {
        String regex = "^\\+\\d{1,}$"; // Pattern for a country code followed by digits
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    // Function to extract the country code from a valid mobile number
    public static String extractCountryCode(String phoneNumber) {
        if (validateMobileNumber(phoneNumber)) {
            return phoneNumber.substring(1); // Remove the '+' sign to get the country code
        } else {
            return "Invalid mobile number";
        }
    }
}
