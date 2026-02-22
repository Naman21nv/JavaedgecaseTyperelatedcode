import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: a b c d
        String input = sc.nextLine();

        String[] arr = input.split(" ");

        List<Character> list = new ArrayList<>();

        for(String s : arr) {
            list.add(s.charAt(0));
        }

        System.out.println(list);
    }
}