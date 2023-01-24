package Chap4;

public class Ex4_2 {
    public static void main(String[] args) {
        int sum = 0;
        int total = 0;

        for(int i=1; i<=10; i++) {
            sum += i;
            total += sum;
        }

        System.out.println("총합: " + total);

    }
}