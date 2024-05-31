package com.vasudev.may30;

class ProfitOrLoss {

	public static void main(String[] args) {

		int sellingPrice = 100, purchasingPrice = 10;
		
		if(sellingPrice==purchasingPrice)
			System.out.println("You are neither in profit nor in loss!!!");
		else {
			if(sellingPrice>purchasingPrice)
				System.out.println("Congrats, you are in profit!!!");
			else
				System.out.println("Sorry to hear but you are in loss!!!");
		}
		
	}

}
