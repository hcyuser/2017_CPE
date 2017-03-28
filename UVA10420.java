import java.util.*;

public class UVA10420 {

	public static void main(String[] args) {

		LinkedList<Nation> nation_coll = new LinkedList<Nation>();
		Scanner sc = new Scanner(System.in);

		int nLine = Integer.parseInt(sc.nextLine());

		for(int i = 0; i < nLine; i++)
		{

			String[] items = sc.nextLine().split(" ");

			String name = items[0];

			Nation aNation;

			if(nation_coll.isEmpty())
			{
				aNation = new Nation(name, 1);
				nation_coll.add(aNation);
			}
			else
			{
				boolean isExisted = false; 

				for(int idx = 0; idx < nation_coll.size(); idx++)
				{

					Nation currNation = nation_coll.get(idx);

					if(name.compareTo(currNation.getName()) < 0)
					{
						aNation = new Nation(name, 1);
						nation_coll.add(idx, aNation);
						isExisted = true;
						break;
					}
					else if(name.compareTo(currNation.getName()) == 0)
					{
						int currCount = currNation.getCount();
						currCount++;
						currNation.setCount(currCount);
						nation_coll.set(idx, currNation);
						isExisted = true;
						break;
					}

				}

				if(!isExisted)
				{
					aNation = new Nation(name, 1);
					nation_coll.add(aNation);
				}

			}

		}

		for (int j = 0; j < nation_coll.size(); j++) {
			Nation aNation = nation_coll.get(j);
			System.out.print(aNation.getName());
			System.out.print(" ");
			System.out.println(aNation.getCount());
		}

		sc.close();
	}

}

class Nation {

	private String _name;
	private int _count;

	public Nation(String name, int i) {

		_name = name;
		_count = i;
	}

	public String getName()
	{
		return _name;
	}

	public void setName(String arg)
	{
		_name = arg;
	}

	public int getCount()
	{
		return _count;
	}

	public void setCount(int arg)
	{
		_count = arg;
	}

}