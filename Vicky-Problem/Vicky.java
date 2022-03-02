import java.util.*;

public class Vicky{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int time = 0;
		int distance = 0;
		//int totalDistanceforCycle = 5 + 3 + 2;
		//int totalRestTimeforCycle = 1 + 2 + 3;
		
		while(distance == 0){
			
			System.out.println("Please enter the time for Vicky to travel (m) : ");
			distance = sc.nextInt();
			
		}
		
		while(distance > 0){
			
			if(distance >= 5){
				distance = distance - 5;
				time = time + 1;	
			}
			
			if(distance >= 3){
				distance = distance - 3;
				time = time + 2;
			}
			
			if(distance >=1){
				distance = distance - 1;
				time = time + 3;
			}
		}
		
		System.out.println("**********************************************");
		System.out.println("Total time taken by Vicky (s): " + time);
		
		
	}
}