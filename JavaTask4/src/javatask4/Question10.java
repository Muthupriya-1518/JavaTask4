package javatask4;

public class Question10 {

	public static void main(String[] args) {
        int num = 12345;
        int i = 0;

        while (num != 0) {
            num = num / 10;
            i++;
        }

        System.out.println("Number of digits: " + i);
    }
}
