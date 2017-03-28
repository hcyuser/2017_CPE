import java.lang.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class UVA10268{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		while(input.hasNextLine()){

			int n = Integer.parseInt(input.nextLine());
			String s = input.nextLine();
			String[] a = s.split(" ");

			int deg = a.length - 1;
			int sum = 0;

			for(int i = deg-1, x = 1, j = 1; j <= deg; i--, j++, x *= n)		
				sum += x * Integer.valueOf(a[i]) * j;

			System.out.println(sum);
		}
	}
}