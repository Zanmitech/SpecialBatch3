package SpecialBatch3_POM_FW.SpecialBatch3_POM_FW;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Test_class2 {
@Test
public void armstrong() {
	int  temp1=0, sum=0;
	Scanner scn = new Scanner(System.in);
	System.out.print("Enter your number :");
	String arm = scn.nextLine();
	int n = Integer.parseInt(arm);
	
    
int	temp = Integer.parseInt(arm);

	for(int i=0;i<arm.length();i++){
		temp1 = temp % 10;
		
		sum = sum + ((int) Math.pow(temp1, arm.length()));
		
		temp = temp/10;
		
	}
	if(sum == n){
		System.out.println("armstrong!!");
	}else{
	System.out.println("not");
	}

}
}
