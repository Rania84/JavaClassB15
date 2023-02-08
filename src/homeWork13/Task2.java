package homeWork13;

public class Task2 {
    public static void main(String[] args) {
        // Create a String that should be combination of letters, numbers and special characters.
        // Find out how many Alphanumeric(abd AZ 284) characters are there in the String
      /*  String str = "GGHKIUTfchjshci373846%$#^&@.";
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i)) || Character.isDigit(str.charAt(i))) {
                counter++;

            }
        }
            System.out.println(counter);

        System.out.println(str.replaceAll("[^A-Za-z0-9]","").length());
        }

    }*/
        String str = "jnfjdnJNJFD87687&*(()";
        System.out.println(str.replaceAll("[^A-Za-z0-9]", "").length());
    }}