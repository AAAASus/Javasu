package alwaysTest;

import java.util.Random;

public class Demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int arr[] = new int[10];
	        for(int i=0;i<arr.length;i++){
	            int temp =  (int)(Math.random()*10)+1;  //�������10 ������
	            arr[i] = temp;                         //�������������浽����
	            System.out.print(arr[i]+" ");
	        }
	        System.out.println();

	}

}
