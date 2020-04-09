package Programers;

public class Ex001 {

	public static void main(String[] args) {
		Solution001 solution = new Solution001();
		int[] array = new int[] {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = solution.solution(array, commands);
		int[] right = new int[] {5,6,3};
		boolean result =false;
		
		for(int i=0;i<right.length;i++)
		{
			if (right.length == answer.length && right[i]==answer[i])
			{
				result = true;
			}
			else
			{
				result = false;
				break;
			}
		}
		System.out.println(result?"정답":"오답");
		
		
		
	}

}
