package com.example.resourses;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.crypto.bcrypt.BCrypt;
import com.example.bean.SavedStock;
import com.example.bean.User;
import com.example.service.UserService;

@RestController
public class UserResourse {
	 @Autowired
     private UserService userService;
	 
	 // login user 
	 
	  @PostMapping(path = "/login", consumes = "application/json", produces = "application/json")
 	  public boolean login_user(@RequestBody User user)
 	  {
			/*
			 * String encodedpassword= BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
			 * System.out.println("encodedpassword :"+encodedpassword);
			 */
		   return userService.user_login(user.getUsername(),user.getPassword());
      }
	  
	  //register user
	  
	  @PostMapping(path = "/register", consumes = "application/json", produces = "application/json")
 	  public boolean register_user(@RequestBody User user)
 	  {
		   String encodedpassword= BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
	        System.out.println("encodedpassword :"+encodedpassword);
	        user.setPassword(encodedpassword);
		   return userService.registerUser(user);
      }
	  
	  //get saved stocks
	  
	  @GetMapping("/getsavedStock/{username}")
	   public ArrayList<SavedStock> getSavedStocks(@PathVariable("username") String username)
	   {
			return userService.getSavedStocks(username);
		
	   }
	  
	  //save stock
	  
      @PostMapping(path = "/saveStock", consumes = "application/json", produces = "application/json")
	  public boolean saveStock(@RequestBody SavedStock savestock)
		{
			return userService.saveStock(savestock);
			 
	    }
     
       //delete saved stock
      @GetMapping("/deletesavedStock/{username}/{stock_symbol}")
      public boolean deletesavedStock(@PathVariable("username") String username,@PathVariable("stock_symbol") String stock_symbol)
      {
    	  return userService.deletesavedStock(username, stock_symbol);
      }
 	}

     

