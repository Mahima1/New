import java.util.Scanner;

public class WILLITST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String name = sc.nextLine();
//        char gender = sc.next().charAt(0);
//        int age = sc.nextInt();
//        long mobileNo = sc.nextLong();
//        double cgpa = sc.nextDouble();
//        while (sc.hasNextInt()) {
//            int n = sc.nextInt();
//        }
        long num = sc.nextLong();
        Double log2 = Math.log(num)/Math.log(2);
        System.out.println(log2);
    }
}
