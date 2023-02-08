package Homework15;

public class Task4 {

    // )Create a method that will say Hello in different language
    // based on the country that will passed when method is executed
    //return type = string
    //
  String input (String country){
      switch (country){
          case "Egypt":
              return " Salam";
          case "USA":
              return "Hello";
          case "france":
              return "Bonjour";
          default:
              return "Invalid country";

      }

  }

    public static void main(String[] args) {
        Task4 hello =new Task4();
        System.out.println(hello.input("USA"));
    }
}
