package Programers;

import java.util.Arrays;

public class Solution001 {

	public int[] solution(int[] array, int[][] commands) {

		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int[] arr2 = new int[commands[i][1] - commands[i][0]+1];
			arr2 = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(arr2);
			answer[i] = arr2[commands[i][2]-1];
		}
		return answer;
	}

}
