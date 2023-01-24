package Chap4;

public class Ex4_4 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        while (sum < 100) {
            count++;
            if (count % 2 == 0) {
                sum -= count;
            } else {
                sum += count;
            }

            System.out.println(count);
        }
    }
}
