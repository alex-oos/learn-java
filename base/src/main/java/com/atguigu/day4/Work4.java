package com.atguigu.day4;
/*
import java.util.Scanner;
class Work4{
	public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("�����룺");
	int x = s.nextInt();
 	 
	 
	int  num1= (int)(Matn.random() * 100);
	int  num2= (int)(Matn.random() * 100);
*/	
	
import java.util.Random;
import java.util.Scanner;
class Work4{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner s = new Scanner(System.in);
		int num = rand.nextInt(100);
		//System.out.println(num);
/*		int num = rand.nextInt(100);
			Scanner s = new Scanner(System.in);
			System.out.print("�����룺");
*/

		int da = 0;
		int xiao =0;
	    while(true){	
			System.out.println("�����룺");
			int x = s.nextInt();
	
		if(x>num){
			da++;
			System.out.println("��");
			
		}else if(x<num){
			xiao++;
			System.out.println("С");
			
			
		}else{
			break;
		}
	}
		System.out.println("��Ĵ���"+da);
		System.out.println("С�Ĵ���" + xiao);
	
		
	}
}	
	
	
	
	
