package com.example.util;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.bean.SavedStock;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class SavedStockRowMapper implements RowMapper<SavedStock> {

	@Override
	public SavedStock mapRow(ResultSet rs, int rowNum) throws SQLException {
	
		SavedStock saved_stock=new SavedStock();
		saved_stock.setUsername(rs.getString("username"));
		saved_stock.setStock_symbol(rs.getString("stock_symbol"));
		saved_stock.setQuantity(rs.getInt("quantity"));
		saved_stock.setCurrent_price(rs.getBigDecimal("currentPrice"));
		saved_stock.setpriceTime(rs.getTimestamp("pricetime"));
		Stock stock = null;
		try {
			stock = YahooFinance.get(saved_stock.getStock_symbol());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BigDecimal price = null;
		try {
			price = stock.getQuote(true).getPrice();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		saved_stock.setPrice(price);
		return saved_stock;
	}

}
