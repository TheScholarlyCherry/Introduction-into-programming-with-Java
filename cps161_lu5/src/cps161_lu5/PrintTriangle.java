package cps161_lu5;

public class PrintTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (char i = 'a'; i <= 'z'; i++) 
		{
			for(char j = 'a'; j<= 'z'; j++) 
			{
				System.out.print("" + i + j + " ");
			}
			System.out.println();
		}
	
	
	//*
	//**
	//***
	//****
	//*****
	
	for (int i = 1; i<=5; i++) 
	{
		for (int j = 1; j <= i; j++) 
		{
			System.out.print("*");
		}
		System.out.println();
	}
  }
}
