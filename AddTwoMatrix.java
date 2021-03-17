public class AddTwoMatrix {

	public static void main(String[] args) {
		int[][] x = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
		int[][] y = {{ 5, 15, 25}, {35, 45, 55}, {65, 75, 85}};
		
		int[][] sum = new int[3][3];
		int i, j;
		
		for(i = 0; i < x.length; i++)
		{
			for(j = 0; j < x[0].length; j++)
			{
				sum[i][j] = x[i][j] + y[i][j];
			}
		}
		System.out.println("------ The addition of two Matrices ------");
		
		for(i = 0; i < x.length; i++)
		{
			for(j = 0; j < x[0].length; j++)
			{
				System.out.format("%d \t", sum[i][j]);
			}
			System.out.println("");
		}
	}
}
