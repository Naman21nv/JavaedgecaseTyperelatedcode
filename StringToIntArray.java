import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a Numbers");
        Scanner sc = new Scanner(System.in);
        
            String s = sc.nextLine();

            // This code is for converting string to integer array
            String[] strArr = s.split(" ");

            List<Integer> lt = new ArrayList<>();

            for (String str : strArr) {
                lt.add(Integer.parseInt(str));
            }

            System.out.println(lt);
            sc.close();
        } 
    }

