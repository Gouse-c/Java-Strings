import java.util.Scanner;
class CountWordsInString {
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        int wordCount = countWords(input);
        System.out.println("Total number of words: " + wordCount);
        sc.close();
    }
}
