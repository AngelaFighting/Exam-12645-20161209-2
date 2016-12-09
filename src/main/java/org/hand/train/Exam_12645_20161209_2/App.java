package org.hand.train.Exam_12645_20161209_2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	/**计算需缴纳的税费**/
	public static double calCost(int salary){
		double cost=0;
		if(salary<1500)
			cost=salary*0.03;
		else if(salary<4500)
			cost=1500*0.03+(salary-1500)*0.1;
		else if(salary<9000)
			cost=1500*0.03+4500*0.1+(salary-4500)*0.2;
		else if(salary<35000)
			cost=1500*0.03+4500*0.1+9000*0.2+(salary-9000)*0.25;
		else if(salary<55000)
			cost=1500*0.03+4500*0.1+9000*0.2+35000*0.25
					+(salary-35000)*0.3;
		else if(salary<80000)
			cost=1500*0.03+4500*0.1+9000*0.2+35000*0.25
					+55000*0.3+(salary-55000)*0.35;
		else 
			cost=1500*0.03+4500*0.1+9000*0.2+35000*0.25
					+55000*0.3+80000*0.35+(salary-80000)*0.45;
		return cost;
	}
	
    public static void main( String[] args )
    {
    	System.out.print("请输入工资：");
    	Scanner input=new Scanner(System.in);  
    	int salary=input.nextInt();
        System.out.println( "所需要缴纳的税费为："+ calCost(salary));
    }
}
