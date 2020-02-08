package project1.maven;
import java.util.ArrayList;
public class New_Years_Gift extends Sweets implements Chocolates{

	public int weight_of_chocolates(int no_chocolates,int weight) {
		return(no_chocolates*weight);
	
	}

	public static void main(String[] args) {
	
		int[] array_chocolates_weight=new int[3];
		int total_gift_weight;
		int[] candy=new int[3]; 
		ArrayList<Integer> a=new ArrayList<Integer>();
		Sweets kulfi=new Sweets();
		Chocolates hersheys=new New_Years_Gift();
		Candies MilkyWayCandy=new Candies();
		array_chocolates_weight[0]=hersheys.weight_of_chocolates(10,6);
		candy[0]=MilkyWayCandy.candies_weight(5,25);
		a.add(candy[0]);
		total_gift_weight=array_chocolates_weight[0]+candy[0]+kulfi.sweets_total_weight(10,20);
		
		System.out.println("total weight of gift_1 is:"+total_gift_weight);
		
		Sweets basundi=new Sweets();
		Chocolates munch=new New_Years_Gift();
		Candies SwedishCandy=new Candies();
		array_chocolates_weight[1]=munch.weight_of_chocolates(10,5);
		candy[1]=SwedishCandy.candies_weight(5,50);
		a.add(candy[1]);
		total_gift_weight=array_chocolates_weight[1]+candy[1]+basundi.sweets_total_weight(10,20);
		
        System.out.println("total weight of gift_2 is:"+total_gift_weight);
        
        Sweets laddu=new Sweets();
		Chocolates dairymilk=new New_Years_Gift();
		Candies HersheyKisses=new Candies();
		candy[2]=HersheyKisses.candies_weight(4,50);
		a.add(candy[2]);
		array_chocolates_weight[2]=dairymilk.weight_of_chocolates(10,4);
		total_gift_weight=array_chocolates_weight[2]+candy[2]+laddu.sweets_total_weight(10,20);
		
		 System.out.println("total weight of gift_3 is:"+total_gift_weight);
		
        
        for(int i=0;i<array_chocolates_weight.length;i++)
        {
        	for(int j=i+1;j<array_chocolates_weight.length;j++)
        	{
        		if(array_chocolates_weight[i]>array_chocolates_weight[j])
        		{
        			int temporary_variable=array_chocolates_weight[i];
        			array_chocolates_weight[i]=array_chocolates_weight[j];
        			array_chocolates_weight[j]=temporary_variable;
        		}
        	}
        }
        System.out.println("printing in ascending order of chocolates");
        for(int i=0;i<array_chocolates_weight.length;i++)
        {
        	System.out.print(array_chocolates_weight[i]+" ");
        }
        System.out.println("\nWeight of candies with in range");
        for(int i=0;i<candy.length;i++)
        {
        	if(candy[i]>20 && candy[i]<500)
        	{
        		System.out.print(candy[i]+" ");
        	}
        }
        		
	}

}
