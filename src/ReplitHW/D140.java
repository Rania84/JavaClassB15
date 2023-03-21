package ReplitHW;

public class D140 {
    public static String maxlength(String[] arr) {
        int maxlength = 0;
        String maxWord = "";
        for (String word : arr) {
            if (word.length() > maxlength) {
                maxlength = word.length();
                maxWord = word;
            }
        }
        return maxWord;

    }
        public static void main(String[] args) {
            String[] arr = {"hey", "yolo", "hi", "this is long"};
            System.out.println(maxlength(arr));
        }

}