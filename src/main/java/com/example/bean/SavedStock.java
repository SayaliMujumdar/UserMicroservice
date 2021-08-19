package com.example.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class SavedStock {
	String stock_symbol;
    String username;
    int quantity;
    BigDecimal RealTimeprice;
	BigDecimal current_price;
    Timestamp pricetime;
    public SavedStock()
    {
    	
    }
	public SavedStock(String stock_symbol, String username, int quantity,BigDecimal  current_price,Timestamp time) {
		super();
		this.stock_symbol = stock_symbol;
		this.username = username;
		this.quantity = quantity;
		this.current_price = current_price;
		this.pricetime=time;
	}
	public Timestamp getpriceTime() {
		return pricetime;
	}
	public void setpriceTime(Timestamp time) {
		this.pricetime = time;
	}
	public String getStock_symbol() {
		return stock_symbol;
	}
	public void setStock_symbol(String stock_symbol) {
		this.stock_symbol = stock_symbol;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getCurrent_price() {
		return current_price;
	}
	public void setCurrent_price(BigDecimal i) {
		this.current_price = i;
	}
	public BigDecimal getPrice() {
		return RealTimeprice;
	}
	public void setPrice(BigDecimal price2) {
		this.RealTimeprice = price2;
	}
   
}
