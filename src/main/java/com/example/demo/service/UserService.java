package com.example.demo.service;

import com.example.demo.model.Merchant;
import com.example.demo.model.User;
import com.example.demo.request.MerchantVo;
import com.example.demo.request.UserVo;

public interface UserService   {

	User creteuser(UserVo userevo);
	
	User findBymobilenumber(String mobilenumber);

	User updateById(User user);

	Merchant cretemerchant(MerchantVo merchantvo);

}
