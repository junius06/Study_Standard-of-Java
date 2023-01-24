package Chap4;

import java.util.Scanner;

public class Ex4_10 {
    public static void main(String[] args) {
        int answer = (int)(Math.random() * 100) + 1;
        int input = 0;
        int count = 0;
        System.out.println("값을 입력하세요. : " + answer);

        Scanner s = new Scanner(System.in);

        do {
            count++;
            System.out.print("1과 100 사이의 값을 입력하세요: ");
            input = s.nextInt();

            if (answer > input) {
                System.out.println("더 큰 수를 입력하세요.");
            } else if (answer < input) {
                System.out.println("더 작은 수를 입력하세요.");
            } else {
                System.out.println("정답입니다.");
                System.out.println("시도한 횟수는 " + count + "번 입니다.");
                break;
            }

        } while (true);
    }
}
