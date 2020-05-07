package com.atguigu.day4;

class Work10{
	public static void main(String[] args){
		int i,j,sum;
		for(i=1;i<10;i++){
			for(j=1;j<=i;j++){
				sum=j*i;
				System.out.print(j+"*"+i+"="+sum+"\t");
			
			}
			System.out.println();
		}
	}
}