package javatask4;

public class Question5 {

	public static void main(String[] args) {
        int num = 7;
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count = count + 1;
            }
        }

        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}