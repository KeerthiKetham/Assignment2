import java.util.Scanner;
public class Restaurant {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String[] s = new String[] {"Dosa    ","Idly    ","Chicken Biryani ","Mutton Biryani ","Death By Choclate"};
		int[] rate = new int[] {15,10,199,150,90};
		int[] ci = new int[5];
		int sum=0;
		boolean ordering = true;
		do
		{
			System.out.println("ITEM"+"\t\t\tPrice");
			for(int i=0;i<5;i++)
				System.out.println((i+1)+"."+s[i]+"\t\t"+rate[i]);
			int choose = input.nextInt();
			if(choose>0 && choose<5)
			{
				System.out.println("enter the no of quantites of "+s[choose-1]);
				int q = input.nextInt();
				ci[choose-1]+=q;
			}
			else
			{
				ordering = false;
			}
		}while(ordering);
		System.out.println("Ypur Orders are:\n");
		for(int i=0;i<5;i++)
		{
			if(ci[i]!=0)
			{
				sum+=ci[i]*rate[i];
				System.out.println(s[i]+"*"+rate[i]+"*"+ci[i]+"=="+ci[i]*rate[i]+"rs");
			}
		}
		System.out.println("Your total bill = "+sum);
		System.out.println("Thank you");
		
		

	}

}
