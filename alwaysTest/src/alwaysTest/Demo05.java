package alwaysTest;

import java.util.Random;

public class Demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("�����������������������10���������浽�����С���������������");
		Random r = new Random();
		int arr[] = new int[10];
	        for(int i=0;i<arr.length;i++){
	            int temp =  (int)(Math.random()*10)+1;  //�������10 ������
	            arr[i] = temp;                         //�������������浽����
	            System.out.print(arr[i]+" ");
	        }
	        System.out.println();
	        
	        System.out.println("�����������������������Ƶ���һ�������С�������������������");
	        int arr1[] = new int[10];
	        System.arraycopy(arr, 0, arr1, 0, 10);
	        for(int i=0;i<arr1.length;i++) {
	        	System.out.print(arr1[i]+" ");
	        }
	        System.out.println();

	}

}
