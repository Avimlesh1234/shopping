package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.Merchant;
import com.example.demo.model.User;
import com.example.demo.request.MerchantVo;
import com.example.demo.request.UserVo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userdao;
	
	@Override
	public User creteuser(UserVo userevo) {
		
		User user=new User();
		
		user.setEmail(userevo.getEmail());
		user.setUsername(userevo.getUsername());
		user.setMobile(userevo.getMobile());
		user.setGender(userevo.getGender());
		
		user.setOtp(userevo.getOtp());
		
		user=userdao.save(user);
		
		return user;
	
	}

	@Override
	public User findBymobilenumber(String mobilenumber) {
		// TODO Auto-generated method stub
		User user=new User();
		try {
		user.setMobile(mobilenumber);
		user=userdao.findByMobile(user.getMobile());
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public User updateById(User user) {
		User userres=new User();
		try {
			user=userdao.save(user);
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
				
	
		return userres;
	}

	@Override
	public Merchant cretemerchant(MerchantVo merchantvo) {
		// TODO Auto-generated method stub
		return null;
	}

}
