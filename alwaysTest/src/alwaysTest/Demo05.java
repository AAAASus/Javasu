package alwaysTest;

import java.util.Random;

public class Demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int arr[] = new int[10];
	        for(int i=0;i<arr.length;i++){
	            int temp =  (int)(Math.random()*10)+1;  //随机产生10 个整数
	            arr[i] = temp;                         //将产生的数保存到数组
	            System.out.print(arr[i]+" ");
	        }
	        System.out.println();

	}

}
