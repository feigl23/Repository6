
public class Random {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] number = new int [11];
		java.util.Random rand = new java.util.Random();
		for(int i =0; i < 11; i++)
		{
		 number[i] = rand.nextInt(50)+1;
		 System.out.println(number[i]);
			
		}
		for(int element: number)
		{
			System.out.println(element);
		}
	  double [] number_2 = new double [11];
	  
	  for(int i =0; i < 11; i++)
		{
		 number_2[i] = (int) (Math.random() * 50) +1;
		 
		 System.out.println(number_2[i]);
			
		}
	  
	}

}
