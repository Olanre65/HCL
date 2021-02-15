package com.acme.mytrader.price;

import java.util.ArrayList;
import java.util.List;

public class Listener implements PriceListener {
	
	private String name;
	private List<TradeItem> trades = new ArrayList<>();
	
	

	public Listener(String name, List<TradeItem> trades) {
		super();
		this.name = name;
		this.trades = trades;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public void priceUpdate(String security, double price) {
		// TODO Auto-generated method stub
		for(TradeItem trade:trades) {
			String TradeItemname = trade.getSecurity();
			Double TradeItemprice=trade.getPrice();
			
		}
	}

}
