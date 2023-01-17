package HomeWork9;

public class Task6 {
    public static void main(String[] args) {
        /*  Create an array of countries.
         While retrieving all values from an array print capital for each country
          choose any five countries.
          Thailand	Bangkok -  Austria	Vienna - China	Beijing - France	Paris   -  Egypt	Cairo */
        String[] countries = {"Thailand", "Austria", "China", "France", "Egypt"};
        String[] capital = {"Bangkok", "Vienna", "Beijing", "Paris", "Cairo"};
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < capital.length; j++) {
                if (j == i) {
                    System.out.println(capital[j] + " is the capital of " + countries[i]);
                }
            }


        }
    }}
