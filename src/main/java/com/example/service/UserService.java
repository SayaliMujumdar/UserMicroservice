package com.example.service;

import java.util.ArrayList;

import com.example.bean.SavedStock;
import com.example.bean.User;

public interface UserService {
	public boolean user_login(String username,String password);
	public ArrayList<SavedStock> getSavedStocks(String username);
	public boolean saveStock(SavedStock savestock);
	public boolean registerUser(User user);
	public boolean deletesavedStock(String username,String stock_symbol);
}
