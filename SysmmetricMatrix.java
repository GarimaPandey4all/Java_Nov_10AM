import java.util.Scanner;

public class SysmmetricMatrix {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 1;
		
		System.out.println("Enter rows and cols:");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int matrix[][] = new int[rows][cols];
		int temp[][] = new int[rows][cols];
		
		System.out.println("Enter values in matrix:");
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix.length; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Values in matrix:");
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix.length; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix.length; j++)
			{
				temp[j][i] = matrix[i][j];
			}
		}
		
		System.out.println("Values in Transpose matrix:");
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix.length; j++)
			{
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix.length; j++)
			{
				if(matrix[i][j] != temp[i][j])
				{
					count++;
					break;
				}
			}
		}
		
		if(count == 1)
		{
			System.out.println("Symmetric Matrix");
		}
		else {
			System.out.println("Not a Symmetric Matrix");
		}
	}
}
