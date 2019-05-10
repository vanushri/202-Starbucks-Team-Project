package Starbucks;

public class AddCard {
	

	public String addStrabucksCard(String cardNum, String cardCode, double initialBalance) {
		
		String response = "Card could not be added.";
		
		if(cardNum.length()!=9) {
			response = response+ " Card number is invalid";
			return response;
		}
		if(cardCode.length()!=3) {
			response = response+ " Card code is invalid";
			return response;
		}
		
		boolean rep = StarbucksCard.createNewCard(cardNum, cardCode, initialBalance);
		if(rep) {
			return "Card Added";
		}
		
		return "Card could not be added. PLease try after some time";
	}
}
