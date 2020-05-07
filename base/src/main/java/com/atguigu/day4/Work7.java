package com.atguigu.day4;

import java.util.Scanner;
class Work7{
	public static void main(String[] arg){
		Scanner s = new Scanner(System.in);
		System.out.println("��������");
/*		int n,m;
	do{
		n = s.nextInt();
		m = s.nextInt();
		if(n%m==0){
			System.out.println("Լ"+m);
			System.out.println("��"+n);
		}else if(n/m !=1){
			System.out.println(n-m);
		} else {
			System.out.println("Լ1");
			System.out.println("��"+);
		}
		break;
	}while(true);
*/
	
	int n,m,i;
		n = s.nextInt();
		m = s.nextInt();
	if(m>n){
			//����
			int temp = m;
			m = n;
			n = temp;
		}
	
		for(i=m;i>=1;i--){
			if(m%i==0 && n%i==0){
				System.out.println("Լ" + i);
				break;
			}
		}   
		for(i=n;i<=n*m;i++){
			if(i%m==0 && i%n==0){
				System.out.println("��"+i);
				break;
			}
			
		}
	}
	
	
	
		
}

	
