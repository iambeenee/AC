package com.yedam.java.ch0502;

public class ReferenceTypeExample2 {

	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}

		// 다차원 배열 -> 배열의 배열
		int[][] mathScores = new int[2][3];
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length;k++) {
			System.out.println("mathScores[" + i + "][" + k + "] = " + mathScores[i][k]);
			}
		}
		
		System.out.println("-----------------------");
		int[][] englishScores = new int[2][]; // -> null
		englishScores[0] = new int[2]; //->1차원 배열로 만들어줌
		englishScores[1] = new int[3];
		for(int i=0; i<englishScores.length; i++) {
			for(int k=0; k<englishScores[i].length; k++) {
				System.out.println("englishScores[" + i + "][" + k + "]=" + englishScores[i][k]);
			}
		}
		
		System.out.println("-----------------------");
		int[][] javaScores = {{95, 80},{92, 96,80}};
		//-> int[2][] -> int [2] / int [3];
		for(int i=0; i<javaScores.length; i++) {
			for(int k=0; k<javaScores[i].length; k++) {
				System.out.println("javaScores [" + i + "][" + k +"] = " + javaScores[i][k]);
			}
		}
		
		//for문으로 배열 복사
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int value : newIntArray) { //향상된 for문 이용
			System.out.println(value);
		}
		
		//System.arraycopy()로 배열 복사
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		//System.arraycopy(oldStrArray, 0, newStrArray, 0, 0);
		//                            시작             시작 몇개복사할거냐
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(String str : newStrArray) {
			System.out.println(str);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
