package test.dynamic.array;

import java.util.Iterator;

public class DynamicArrayTest {

	public static void main(String[] args) {
		int[][] darr = new int[3][];
		int cnt = 1;
		//행
		for(int i = 1; i < darr.length; i++) {
			darr[i] = new int[i + 1];
			//열
			for(int j = 0; j < darr[i].length;j++) {
				darr[i][j] = cnt++;
			}
			
		}
		//출력
		for (int i = 0; i < darr.length; i++) {
			for(int j = 0; j < darr[i].length; j++) {
				System.out.print(darr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	
		
		
		
		
		
		/*
		int[][] arr = new int[3][]; // 3개의 행을 우선 생성
		int cnt = 0;
		//동적 배열 출력 프로그램 (Dynamic Array)
		//초기화
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new int[i+1]; //arr[i] = new int[num[i]];
			for (int j = 0; j < arr[i].length; j++) { //i 행의 열 길이까지 j열을 증가
				arr[i][j] = ++cnt;
			}
		}
		//출력
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		*/
	}

}
