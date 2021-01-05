/*
 *   1. 같은 타입의 여러변수를 하나로 묶어서 관리하는 기능
 *      =======  ======= 여러개의 변수를 한개의 이름 통일 (구분:인덱스)
 *                       arr[0],arr[1]
 *                          ===
 *                          인덱스 번호 (인덱스번호는 0부터 시작)
 *                          *** 배열의 인덱스번호를 초과하면 에러발생 
 *                              ArrayIndexOutOfBoundsException
 *      정수,실수,문자열 
 *   2. 배열 선언 
 *      정수형 
 *        int[] arr; , int arr[];   
 *        ===== ===
 *        배열선언 배열명 
 *         arr
 *        ======
 *        
 *        ======
 *        예)
 *             int[][] arr : 자바 => int[] arr[]
 *             int arr[][] : c언어
 *             int arr[,] : c#
 *        
 *   3. 배열초기화 ==> 배열,클래스 ==> 저장되는 위치 (heap) , 일반 데이터(스택)
 *      int[] arr=new int[5];  ==> 메소드(많이 사용) => 연산자 변경 
 *                ===
 *                동적메모리 할당 (메모리 생성)  ==> int ==> malloc(),free()
 *                                                    ========= =======
 *                    arr[0]  arr[1] arr[2] arr[3] arr[4] new      delete => GC
 *    ===arr===      =================================
 *      1000           100       0      0     0   500
 *    =========     |=======|======|=====|=====|======
 *                 1000
 *                 
 *                 arr[0]  arr[1] arr[2] arr[3] arr[4] => 일반변수와 동일하게 사용
 *                 
 *                 ==> 읽기 , 쓰기 
 *                 쓰기 => arr[0]=100
 *                        arr[4]=500
 *                 읽기 => System.out.println(arr[0])
 *                 
 *                 예)
 *                     int[] arr=new int[5]; 저장 갯수를 알고 있는 경우
 *                     int[] arr;
 *                     arr=new int[5];  =========> 메모리에 연속적으로 20byte를 만들어 달라 
 *                                === 저장할 갯수 (저장갯수를 알수 없는 경우)
 *                     arr[0] 
 *                        === 데이터가 저장된 위치 (배열은 0부터 시작)
 *                        
 *           int[] score=new int[5];
 *           =====           ======
 *           
 *                          score[0]
 *                               ===
 *                               배열의 인덱스(배열첨자)
 *           ===score===   =======================================
 *                            0       0      0       0       0
 *           ===========   =======================================
 *                         =======
 *                         배열의 요소
 */
public class 배열정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {1,2,3,4,5};
        int[] temp=new int[10];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        
        for(int i=0;i<temp.length;i++)
        {
        	System.out.println(temp[i]);
        }
        
        System.out.println("=================================");
        int[] temp2=new int[10];
        for(int i=0;i<arr.length;i++)
        {
        	temp2[i]=arr[i];
        }
        
        for(int i=0;i<temp2.length;i++)
        {
        	System.out.println(temp2[i]);
        }
	}

}








