package com.acme.mytrader.price;

import java.util.ArrayList;
import java.util.List;

public class TradeItem implements PriceSource{
	  
	private Long id;
	private String security;
	private Double price;
	private List<Listener> listeners = new ArrayList<>();
	
	

	
	public TradeItem(Long id, String security, Double price, List<Listener> listeners) {
		super();
		this.id = id;
		this.security = security;
		this.price = price;
		this.listeners = listeners;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getSecurity() {
		return security;
	}




	public void setSecurity(String security) {
		this.security = security;
	}




	public Double getPrice() {
		return price;
	}




	public void setPrice(Double price) {
		this.price = price;
	}
    



	@Override
	public String toString() {
		return "TradeItem [id=" + id + ", security=" + security + ", price=" + price + "]";
	}
	@Override
	public void addPriceListener(PriceListener listener) {
		listeners.add((Listener) listener);
		
		
	}

	@Override
	public void removePriceListener(PriceListener listener) {
		listeners.remove(listener);
		
	}
	
}
