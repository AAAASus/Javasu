package alwaysTest;

import java.util.*;


public class Demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("————————随机产生10个数并保存到数组中————————");
		Random r = new Random();
		int arr[] = new int[10];
	        for(int i=0;i<arr.length;i++){
	            int temp =  (int)(Math.random()*100)+1;  //随机产生10 个整数
	            arr[i] = temp;                         //将产生的数保存到数组
	            System.out.print(arr[i]+" ");
	        }
	        System.out.println();
	        
	        System.out.println("——————————复制到另一个数组中——————————");
	        int arr1[] = new int[10];
	        System.arraycopy(arr, 0, arr1, 0, 10);
	        for(int i=0;i<arr1.length;i++) {
	        	System.out.print(arr1[i]+" ");
	        }
	        System.out.println();
	        
	        System.out.println("——————————将数组元素进行排序——————————");
	        Arrays.parallelSort(arr);
	        System.out.println("排序后：");
	        for(int i=0;i<10;i++) {
	        	System.out.print(arr[i]+" ");
	        }
	        
	        System.out.println("\n请输入查找值：");
	        Scanner sc = new Scanner(System.in);
			int key = scanner.nextInt();
			int find = -1;
			if((find = Arrays.binarySearch(arr, key))>-1) {
				System.out.println("找到值位于索引："+find+"位置");
			}else
				System.out.println("找不到指定值！");		
	}

}
