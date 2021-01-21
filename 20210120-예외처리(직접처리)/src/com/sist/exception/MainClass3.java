package com.sist.exception;
/*
 *    사용자로부터 2개의 정수받아서 배열에 저장한 다음에 두개 나누기한 경과값을 출력 
 *                           =========            ======   
 *                           catch => 3개 (기타)
 *    예상되는 에러?
 */
import java.util.Scanner;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	Scanner scan=new Scanner(System.in);
        	System.out.print("첫번째 정수 입력:");
        	int a=scan.nextInt();
        	System.out.print("두번째 정수 입력:");
        	int b=scan.nextInt();
        	
        	int[] arr={a,b};
        	int res=arr[0]/arr[2];
        	System.out.println("res="+res);
        	// catch에 등록한 예외처리 클래스에 순서가 존재한다 
        	
        }
        catch(ArrayIndexOutOfBoundsException e) // 배열의 범위를 벗어난 경우에만 처리가 가능
        {
        	System.out.println("배열의 범위를 초과 했습니다");
        }catch(ArithmeticException e) // 0으로 나누기할때만 처리 가능
        {
        	System.out.println("0으로 나눌 수 없습니다");
        }catch(RuntimeException e)
        {
        	System.out.println("예측 못한 예외 발생했습니다");
        }catch(Exception e)
        {
        	
        }
        System.out.println("프로그램 종료");
	}

}









