package FinalTest;

import java.util.Arrays;

/*
      정수 배열 numbers가 주어지면, numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 
      더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 메서드 만들기

      numbers의 길이는 2 이상 100 이하이고,
      numbers의 모든 수는 0 이상 100 이하이다.

      입출력 예
      numbers      result
      [2,1,3,4,1]   [2,3,4,5,6,7]
      [5,0,2,7]   [2,5,7,9,12]
	 */
public class HomeWork_2 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int[] arr2 = new int[arr.length*(arr.length-1)/2];
		System.out.print("arr의 요소들\n");
		for(int i = 0; i < arr.length; i++) {
			int randomVal = (int)(Math.random()*100);
			if(randomVal == arr[i]) {
				i--;
			}else {
				arr[i] = randomVal;
			}
		System.out.print(arr[i] + " ");
		}
		
		for(int i = 0; i < arr.length; i++) {
			int index = 1;
			for(int k = 0; k < arr.length-1; k++) {
				int result = arr[i] + arr[index];
				index++;
				if(index == i) {
					continue;
				}
				arr2[i] = result;
			}
		}
		System.out.println("\nresult");
		Arrays.sort(arr2);
		for(int a : arr2) {
			System.out.print(a + " ");
		}
	}

}