package FinalTest;

import java.util.Arrays;
import java.util.HashSet;

public class sadasd {

	public static void main(String[] args) {
		  int[] arr = new int[10];
		  int[] arr2 = new int[arr.length*(arr.length-1)/2]; // arr 배열 요소 두 개를 더한 모든 경우의 수
	        System.out.print("arr의 요소들\n");
	        for(int i = 0; i < arr.length; i++) {
	            int randomVal = (int)(Math.random()*10);
	            arr[i] = randomVal;
	            System.out.print(arr[i] + " ");
	        }
			
	        int index = 0;
	        for(int i = 0; i < arr2.length; i++) {
	            for(int k = i+1; k < arr.length; k++) { // 중복되지 않도록 k의 시작 값을 i+1로 설정
	                int result = arr[i] + arr[k];
	                arr2[index] = result;
	                index++;
	            }
	        }
	        
	        HashSet<Integer> set = new HashSet<>();
	        for(int i = 0; i < arr2.length; i++) {
	        	set.add(arr2[i]);
	        }
	        
	        int[] arr3 = new int[set.size()];
	        int index2 = 0;
	        for(int t : set) {
	        	arr3[index2++] = t;
	        }
	        Arrays.sort(arr3);

	        System.out.println("\nresult");
	        for(int a : arr3) {
	            System.out.print(a + " ");
	        }
	}

}
