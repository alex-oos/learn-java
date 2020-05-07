package com.atguigu.day4;

class Work5{
	public static void main(String[] args){
		int i,x,y,z,num=0;
		int sum = 0;
		for(i=100;i<1000;i++){
			x=i/100;
			y=(i/10)%10;
			z=i%10;
			
		if(i==(x*x*x+y*y*y+z*z*z)){
			sum=i;
			num++;
			}
			
		}
		System.out.println(num);
		System.out.println(sum);
	}
}