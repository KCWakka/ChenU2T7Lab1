import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the first string: ");
    String str1 = scan.nextLine();
    System.out.print("Enter the second string: ");
    String str2 = scan.nextLine();
    if (str1.length() > str2.length()) {
        System.out.println(str1 + " is longer");
    } else {
        System.out.println(str2 + " is longer");
    }
    int length1 = str1.length() / 2;
    int length2 = str2.length() / 2;
    System.out.println("First half: " + str1.substring(0,length1));
    System.out.println("Second half: " + str1.substring(length1));
    System.out.println("First half: " + str2.substring(0,length2));
    System.out.println("Second half: " + str2.substring(length2));
    if (str1.indexOf(str2) == -1) {
        System.out.println(str2 + " is NOT found in " + str1);
    } else {
        System.out.println(str2 + " is found in " + str1 + " at index " + str1.indexOf((str2)));
    }
    }
}