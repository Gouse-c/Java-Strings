import java.util.Scanner;
class CheckDigitsOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        if (str.matches("\\d+")) {
            System.out.println("String contains only digits.");
        } else {
            System.out.println("String contains characters other than digits.");
        }
    }
}
