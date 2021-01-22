package com.sist.lib;
// 배열 /클래스 => 메모리주소 
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr={10,20,30,40,50};
        
        int[] arr1=new int[5];// 0,0,0,0,0
        arr1[0]=10;
        arr1[1]=20;
        arr1[2]=30;
        arr1[3]=40;
        arr1[4]=50;
        
        int[] arr2=arr.clone();
        /*int[] arr1=arr;
        System.out.println("arr1="+arr1);
        System.out.println("arr="+arr);
        arr1[0]=100;
        System.out.println(arr[0]);
        
        int[] arr2=arr.clone();
        arr2[1]=1000;
        System.out.println("arr[1]="+arr[1]);
        System.out.println("arr2="+arr2);*/
        
	}

}
