package com.service.cardsnewplatformbackend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.cardsnewplatformbackend.modal.Card;
import com.service.cardsnewplatformbackend.modal.DebitCards;

@RestController
@CrossOrigin
@RequestMapping("/api/newplatform")
public class NewPlatformController {
	
	@GetMapping(value = "/hello")
	public String HelloWorld() {
		return "Hello String";
	}
	
	@GetMapping("/getCard")
	public Card getCard() {
		Card card= new Card();
		List<DebitCards> cardList= new ArrayList<>();
		DebitCards debitCard=  new DebitCards();
		
		debitCard.setTypeOfCard("1");
		debitCard.setBrand("L");
		debitCard.setNameOnCard("MORRISON LS");
		debitCard.setCardNumber("5921839943792019");
		debitCard.setMaskedCardNumber("XXXX XXXX XXXX 2019");
		debitCard.setCardId(11222);
		debitCard.setReplacedBycardNumber("5921839943792045");
		debitCard.setReplacedCardNumber("");
		debitCard.setPlasticType("0412");
		debitCard.setBasePlasticType("0412");
		debitCard.setIssueDate("2015-03-01");
		debitCard.setCardStatus("0");
		debitCard.setCardDispatchDate("2015-03-07");
		debitCard.setCardCancellationDate("");
		debitCard.setCardExpiryDate("2021-12-28");
		debitCard.setSortCode(23424);
		debitCard.setAccountNumber(1313123123);
		debitCard.setProductName("");
		debitCard.setCustomerProductName("");
		debitCard.setPar("");
		
		
		cardList.add(debitCard);
		card.setViewPinDebitCards(cardList);
		return card;
	}

}
