package com.example.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.bean.SavedStock;
import com.example.bean.User;
import com.example.persistence.UserDao;
@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userdao;
	@Override
	public boolean user_login(String username1, String password1) {

		return userdao.userlogin(username1, password1);

	}
	@Override
	public ArrayList<SavedStock> getSavedStocks(String username) {
		return userdao.getSavedStocks(username);

	}
	@Override
	public boolean saveStock(SavedStock savestock) {
		return checkRows(userdao.saveStock(savestock));
	}
	@Override
	public boolean registerUser(User user) {
		return checkRows( userdao.registerUser(user));
	}

	@Override
	public boolean deletesavedStock(String username, String stock_symbol) {
		return checkRows(userdao.deletesavedStock(username, stock_symbol));
	}


	static boolean checkRows(int rows)
	{
		if(rows!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	

}
