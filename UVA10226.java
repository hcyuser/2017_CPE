import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class UVA10226 {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		HashMap<String,Integer> hm = new HashMap<String,Integer>();

		TreeSet<String> ts = new TreeSet<String>();

		//TreeSet (�}�C���������� �B�|�۰ʱƧ�(�i�ݱ��p���ɭ�))
		//HashMap (���ޥ\�� �@��volume�����@��volume)
		//Iterator (���X�Ҧ�����(���ഫ���O))

		int volume =Integer.parseInt(in.readLine());

		in.readLine();

		for(int i =0;i<volume;i++){

			int total_pieces = 0;

			String s ;

			while((s = in.readLine())!=null){

				String str = s;

				if(str.equals("")){
					break;
				}

				ts.add(str);

				if(hm.containsKey(str))
				{
					int count = hm.get(str);
					hm.put(str, ++count);
				}
				else
				{
					hm.put(str,1); 
				}

				total_pieces ++;

			}

			Iterator<String> it = ts.iterator();

			while(it.hasNext()){

				String plant =it.next();

				double p_percentage = hm.get(plant);

				System.out.printf("%s %.4f",plant,(p_percentage*100 / total_pieces));
				System.out.println();

			}

			ts.clear();

			hm.clear();

			if(i+1<volume)System.out.println();

		}

	}

}