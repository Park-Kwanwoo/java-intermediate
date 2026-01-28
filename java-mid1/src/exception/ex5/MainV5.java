package exception.ex5;

import exception.ex5.exception.SendExceptionV5;

import java.util.Scanner;

public class MainV5 {

    public static void main(String[] args) {

        NetworkServiceV5 networkService = new NetworkServiceV5();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자 입력: ");
            String input = sc.nextLine();
            if (input.equals("exit")) break;

            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }
            System.out.println();
        }

        System.out.println("프로그램을 정상 종료합니다.");
    }

    private static void exceptionHandler(Exception e) {
        System.out.println("사용자 메시지: 알 수 없는 오류가 발생했습니다.");
        System.out.println("=== 개발자용 디버깅 메시지 ===");
        e.printStackTrace(System.out);

        if (e instanceof SendExceptionV5 sendEx) {
            System.out.println("[전송 오류] 메시지: " + sendEx.getMessage());
        }
    }
}
