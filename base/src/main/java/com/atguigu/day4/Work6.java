package com.atguigu.day4;

class Work6{
	public static void main(String[] args){
		int i;
		for(i=1;i<151;i++){
			System.out.print(i);
			if(i%3==0){
				System.out.print("foo  " );
			}
			if(i%5==0){
				System.out.print("biz  " );
			}
			if(i%7==0){
			System.out.print("baz  ");
			}
		
			System.out.println();
	}
	}
}