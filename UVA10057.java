import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class UVA10057 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Vector<Integer> vi = new Vector<Integer>();

		while (sc.hasNext()) {

			int num = sc.nextInt();

			for (int i = 0; i < num; i++) {
				vi.add(sc.nextInt());

			}

			Collections.sort(vi, new Comparator<Integer>() {

				public int compare(Integer arg0, Integer arg1) {

					if (arg0 < arg1)
						return -1;
					else if (arg0 > arg1)
						return 1;
					else
						return 0;
				}

			});

			int median = 0;

			if (vi.size() % 2 == 0) 
			{
				median = vi.size() / 2 - 1;
			} 
			else 
			{
				median = vi.size() > 1 ? vi.size() / 2 : 0;
			}

			int answer = vi.get(median);

			System.out.print(answer + " ");

			int count = 0;
			int temp = 0;

			if (vi.size() % 2 == 0)
			{

				for (int i = 0; i < vi.size(); i++)

				{

					temp = vi.get(i);

					if (temp == vi.get(median) || temp == vi.get(median + 1))
						count++;
				}

			}

			else if (vi.size() % 2 == 1) 
			{

				for (int i = 0; i < vi.size(); i++) 
				{
					temp = vi.get(i);
					if (temp == vi.get(median))
						count++;
				}

			}

			System.out.print(count + " ");

			System.out.println(vi.size() % 2 == 0 ? vi.get(median + 1)- vi.get(median) + 1 : 1);

			vi.clear();
		}

	}

}

