package com.example.persistence;

import java.util.ArrayList;

import com.example.bean.SavedStock;
import com.example.bean.User;

public interface UserDao {
	public boolean  userlogin(String userName1,String password1); 
	public ArrayList<SavedStock> getSavedStocks(String username);
	public int saveStock(SavedStock savestock);
	public int registerUser(User user);
	public int deletesavedStock(String username,String stock_symbol);
}
