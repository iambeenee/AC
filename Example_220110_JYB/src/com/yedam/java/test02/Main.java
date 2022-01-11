package com.yedam.java.test02;

public class Main {
	public static void main(String[] args) {
		System.out.println("Card");
		Card card = new Card("5432-4567-9534-3657", 20251203, 253);
		card.showCardInfo();
		
		System.out.println();
		System.out.println("TossCard");
		TossCard tossCard = new TossCard(card.getCardNum(), "신빛용", tossCard.getCompany());
		tossCard.showCardInfo();
		
		System.out.println();
		System.out.println("DGBCard");
		DGBCard dgbCard = new DGBCard(card.getCardNum(), card.getVaildDate(), card.getCVC());
		//DGBCard dgbCard1 = new DGBCard("신빛용", dgbCard1.getCompany());
		dgbCard.showCardInfo();
		
		
	
}
}