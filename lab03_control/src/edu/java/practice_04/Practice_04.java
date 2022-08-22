package edu.java.practice_04;

import java.util.Random;
import java.util.Scanner;

public class Practice_04 {

    public static void main(String[] args) {
        // 교재 P 160 연습문제 2번~7번
        
        //for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드 작성
        
        int sum = 0;
        for(int i = 1 ; i<=100 ; i++) {
            if(i % 3 == 0) {
                sum += i;
            }
            
        }
        System.out.println("1부터 100까지의 정수 중에서 3의 배수의 총합 : " + sum);
        
        
        /* while문과 Math.random() 메소드를 이용해서 2개의 주사위를 던졌을때 나오는 눈을
        눈(눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면
        실행을 멈추는 코드를 작성해보세용. 눈의 합이 5가 되는 
        조합은 (1,4), (4,1), (2,3), (3,2) 입니당. */
        
        Random random = new Random();
        // 0을 포함하지않는 난수 생성방법
        int x = 0;
        int y = 0;
        while(true) {
            if(!((x+y)==5)) {
                x = random.nextInt(6) + 1; // 1 <= x < 7
                System.out.println(x);
                
                y = random.nextInt(6) + 1; // 1 <= x < 7
                System.out.println(y);   
                
                System.out.println("("+x+","+y+")");
            }
            else
            break;
        }
        
        System.out.println("----------------------------------");
        /*
        y = random.nextInt(1, 7);
        System.out.println(y);
        
        double z = Math.random();// 0 <= z < 1
        System.out.println(z);
        z = 6 * z + 1;
        System.out.println(z);
        
        int r = (int) z;
        System.out.println(z);
        */
        
        /* 중첩 for문을 이용하여 4x + 5y = 60의 모든 해를 구해서 (x,y) 형태로 출력해보세요.
         * 단, x와 y는 10 이하의 자연수입니다.
         */
        
        for(x=1;x<=10;x++)
            for(y=1;y<=10;y++) {
                sum = (4 * x) + (5 * y);
                if(sum==60) {
                    System.out.println("("+x+","+y+")");
                }
            }
        System.out.println("----------------------------------");
        
        /* for 문을 이용해서 다음과 같이 *를 출력하는 코드를 작성해보세용.
            *
            **
            ***
            ****
         */
        
        for(int i=1;i<=4;i++) {
            for(int j=0;j<i;j++) {
            System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------------------");

        
        
        /* for 문을 이용해서 다음과 같이 *를 출력하는 코드를 작성해보세용.
            *
           **
          ***
         ****
     */
       for(int i=1;i<=4;i++) {
    	   for(int j=1; j<=4-i;j++) {
    		  System.out.print(" ");
    	   }
    	   
    	   for(int j=0; j<i;j++) {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
       
        /* for 문을 이용해서 다음과 같이 *를 출력하는 코드를 작성해보세용.
          while 문과 Scanner를 이용해서 키보드로 입력된 데이터로 예금,출금,조회,종료 기능을
          제공하는 코드를 빈칸에 작성해보세요. 프로그램을 실행하면 다음과 같은 실행결과가 나와야 합니다.
          (Scanner의 nextLine() 사용).
        
     */
        boolean run = true;
        int balance = 0;
        Scanner scanner = new Scanner(System.in);
        
        while(run) {
            System.out.println("---------------------------");
            System.out.println("1.예금 || 2. 출금 || 3. 잔고 || 4. 종료");
            System.out.println("---------------------------");
            System.out.println("선택> ");
            
            int num = Integer.parseInt(scanner.nextLine());
            switch(num) {
            case 1:  
            	System.out.print("예금액>");
            	balance += Integer.parseInt(scanner.nextLine());
            	break;
            case 2:
            	System.out.print("출금액>");
            	balance -= Integer.parseInt(scanner.nextLine());
            	break;
            case 3:
            	System.out.print("잔고>");
            	System.out.println(balance);
            	break;
            case 4:
            	run = false;
            	break;
            }
            System.out.println();
        }
        
        System.out.println("프로그램 종료");
        
    }

}