package carUtils;

import java.io.IOException;
import java.util.*;

public class ProjectCars{

	
static int i=0;
	 
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Customer[] add_name = new Customer[10];
		 ArrayList<Customer> customer_list = new ArrayList<Customer>();
		 int store_id[]= new int[10];
		 int random_id[] = new int[6];
		 Scanner sc= new Scanner(System.in);
		while(true)
		{
			
			System.out.println("press 1 to add customers:");
			System.out.println("press 2 to add car to customers:");
			System.out.println("press 3 to list all customers:");
			System.out.println("press 4 to list individual customer based on ID:");
			System.out.println("press 5 to generate prizes for customer:");
			System.out.println("press 0 to exit:");
			
			int choose = sc.nextInt();
			int flag=0;
			
			switch(choose)
			{
			case 0:
				flag=1;
				break;
				
			
			case 1:
				
				//Customer[] add_name = new Customer[10];
				add_name[i]= new Customer();
				customer_list.add(add_name[i]);
				i++;
				break;
				
			case 2:
				System.out.println("enter  id of customer:");
			
				int pass_id = sc.nextInt();
			for(Customer counter: customer_list)
			{
				if(counter.id==pass_id)
				{
					int index = customer_list.indexOf(counter);// it returns the value of index;
					add_name[index].buycars();
				}
				
			}
				
				break;
				
			case 3:
				//Customer list_disp = new Customer();
				
				
				for(Customer counter: customer_list)
				{
					
					
					System.out.println("name of customer: " +counter.name);
					System.out.println("id of customer is: "+counter.id);
						
					for(Cars counter1: counter.cars)
					{
						
						System.out.println("name of the car: " +counter1.model);
						System.out.println("Price of the car is: " +counter1.price);
						System.out.println("Resale Value is : "+counter1.resaleVal);
					}
					
				}
				
				break;
				
			case 4:
				//Customer list_id = new Customer();
				System.out.println("enter id of customer");
				int id_recog= sc.nextInt();
				
				for(Customer counter: customer_list)
				{
				
					if(counter.id ==id_recog)
					{
						System.out.println(counter.name);
						System.out.println(counter.id);
						
						
					}
					
					
				}
				
					break;
			
			case 5:
				int k=0;
				for(Customer counter:customer_list)
				{
					store_id[k] = counter.id;
					k++;
				}
				
				Random rand = new Random();
				k=0;
				for(int i=0;i<6;i++)
				{
					random_id[k] = rand.nextInt();
					k++;
				}
				
				System.out.println("enter 3 numbers: ");
			int first_num  = sc.nextInt();
				int second_num = sc.nextInt();
				int third_num = sc.nextInt();
				
				for(int i=0;i<6;i++)
				{
					if(random_id[i]==first_num || random_id[i]==second_num || random_id[i]==third_num)
					{
						System.out.println("customer with id is eligible: "+random_id[i] );
						
					}
						
				}
				
				break;	
			
			}
			if(flag==1)
			{
				System.out.println("exiting:");
				break;
			}
			
			
			
		}
		
		
		
	}

}
