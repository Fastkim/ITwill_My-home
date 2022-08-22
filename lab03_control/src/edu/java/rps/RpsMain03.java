// 비긴경우를 먼저 설정하고 나머지를 설정하는 경우

package edu.java.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsMain03 {

    public static void main(String[] args) {
        // 가위바위보 게임
        // 가위-0, 바위-1, 보-2

        // 컴퓨터의 가위/바위/보는 (정수) 난수로 만듦.
        Random rn = new Random();

        // 0 보다는 크거나 같고 3보다는 작은 무작위 정수 셋팅
        int computer = rn.nextInt(3);

        // 사용자는 콘솔창에서 키보드로 가위/바위/보에 해당하는 정수를 입력.
        System.out.println("가위/바위/보 게임");
        System.out.println("-----------------");
        System.out.println("[0] 가위");
        System.out.println("[1] 바위");
        System.out.println("[2] 보");
        System.out.println("-----------------");
        System.out.println("0,1,2 중 하나의 숫자를 입력하세요 : ");

        Scanner sc = new Scanner(System.in); // System은 콘솔창을 의미
        // 사용자에게 숫자를 입력받음.
        int user = sc.nextInt();

        // 유저와 컴퓨터가 비긴경우
        if (user == computer)
            System.out.println("Tie");

        else if (user == 0) {// 사용자 - 가위
            if (computer == 1) {// 컴퓨터 - 바위
                System.out.println("Computer win");
            } else { // 컴퓨터 - 보
                System.out.println("User win");
            }
        }

        else if (user == 1) {// 사용자 - 바위
            if (computer == 0) {// 컴퓨터 - 가위
                System.out.println("User win");
            } else { // 컴퓨터 - 보
                System.out.println("Computer Win");
            }
        }

        else { // 사용자 - 보
            if (computer == 0) { // 컴퓨터 - 가위
                System.out.println("Computer win");
            } else { // 컴퓨터 - 바위
                System.out.println("User win");
            }
        }

    }

}