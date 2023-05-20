package com.example.demo.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Merchant;
import com.example.demo.model.Product;
import com.example.demo.model.User;
import com.example.demo.request.MerchantVo;
import com.example.demo.request.Passwordvo;
import com.example.demo.request.UserVo;
import com.example.demo.response.MerchantResponse;
import com.example.demo.response.UserResponse;
import com.example.demo.service.ProductService;
import com.example.demo.service.UserService;
import com.example.demo.utility.AesEncryption;
import com.example.demo.utility.FileService;
@CrossOrigin("*")
@RestController
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@Autowired 
	private ProductService productService;
	
	
	@Autowired 
	private FileService fileService;
	
	
	@PostMapping("signup")

	public @ResponseBody UserResponse createuser(@RequestBody UserVo userevo)
	{
		
		User user=new User();
		UserResponse res=new UserResponse();
		try {
		
		if(userevo.getUsername()!=null && userevo.getMobile()!=null &&userevo.getGender()!=null
				&& userevo.getEmail()!=null)
		{
			if(userevo.getMobile().matches("\\d{10}")&& userevo.getEmail()!=null)
			{
				try {
				Random random = new Random();
				String userOtp = String.valueOf((int) 100000 + random.nextInt(900000));
				
				System.out.println("opt===>"+userOtp);
				String encryptdOtp = AesEncryption.encrypt(userOtp);
				
				userevo.setOtp(encryptdOtp);
				
				}
				catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
				user=userservice.creteuser(userevo);
				
				if(user.getUsername()!=null && user.getMobile()!=null &&user.getGender()!=null
						&& user.getEmail()!=null)
				{
					
				
				
					res.setMessage("succeess");
					res.setStatus("200");
					res.setUser(user);
					res.setStage("create user");
					
					return res;
				}
				
			}
			else {
				
			}
			
			res.setStatus("404");
			res.setStatus("validation not match of mobile and email");
			return res;
		}
		else
		{
			res.setStatus("404");
			res.setStatus("null value are not accepted");
			return res;
		}
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return res;
		

	
}
	
	@PostMapping("verifyotp")
	 public @ResponseBody  UserResponse  verifyotp(@RequestBody UserVo userevo) {
		UserResponse res=new UserResponse();
		 try {
			 User user=new User();
			 user=userservice.findBymobilenumber(userevo.getMobile());
			 
			 if(user!=null)
			 {
				 AesEncryption aes=new AesEncryption();
				 
					String decryptotp = aes.decrypt(user.getOtp());
				 if(userevo.getOtp().equals(decryptotp))
				 {
					 res.setMessage("success");
					 res.setStatus("200");
					 return res;

				 }
				 else {
					 res.setMessage("otp not matched");
					 res.setStatus("404");
					 return res;

					 
				 }
				 
			 }
			 else {
				 res.setMessage("mobile number not found");
				 res.setStatus("404");
				 return res;
			 }
			 
			 
		 }
		 catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
		return res;
		 
		 
		
	}
	
	
	
	@PostMapping("password")
	 public @ResponseBody  UserResponse  createpassword(@RequestBody Passwordvo passvo) {
		UserResponse res=new UserResponse();
		try {
			if(passvo.getPasssword()!=null&&passvo.getConfirmpassword()!=null&& passvo.getMobile()!=null)
			{
				
				 User user=new User();
				 user=userservice.findBymobilenumber(passvo.getMobile());
				
				 if(user!=null)
				 {
					 
				 
				if(passvo.getPasssword().equals(passvo.getConfirmpassword()))
						{
					user.setPassword(passvo.getConfirmpassword());
					 user=userservice.updateById(user);
					 
					 if(user!=null)
					 {
						 res.setMessage("update success");
						 res.setStatus("200");
						 return res;
					 }
					
						}
				 }
				 res.setMessage("mobile number not found");
				 res.setStatus("404");
					return res;
			}
			else {
				res.setStatus("404");
				res.setMessage("null are not accepted");
				return res;
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
		return res;
	

}
	
	
	@PostMapping("signupMerchant")

	public @ResponseBody MerchantResponse createmerchant(@RequestBody MerchantVo merchantvo)
	{
		
		Merchant merchant=new Merchant();
		MerchantResponse res=new MerchantResponse();
		try {
		
		if(merchantvo.getUsername()!=null && merchantvo.getFirstmobile()!=null && merchantvo.getSecondmobile()!=null
				&& merchantvo.getEmail()!=null  && merchantvo.getComponyname()!=null && merchantvo.getNomineename()!=null && merchantvo.getNomineenumber()!=null)
		{
			if(merchantvo.getFirstmobile().matches("\\d{10}")&& merchantvo.getSecondmobile().matches("\\d{10}") && merchantvo.getNomineenumber().matches("\\d{10}"))
			{
				try {
				Random random = new Random();
				String userOtp = String.valueOf((int) 100000 + random.nextInt(900000));
				
				System.out.println("opt===>"+userOtp);
				String encryptdOtp = AesEncryption.encrypt(userOtp);
				
				merchantvo.setOtp(encryptdOtp);
				
				}
				catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
				merchant=userservice.cretemerchant(merchantvo);
				
				if(merchant.getUsername()!=null && merchant.getFirstmobile()!=null &&merchant.getGender()!=null
						&& merchant.getEmail()!=null)
				{
					res.setMessage("succeess");
					res.setStatus("200");
					res.setMerchant(merchant);
					res.setStage("create merchant");
					
					return res;
				}
				
			}
			else {
				
			}
			
			res.setStatus("404");
			res.setStatus("validation not match of mobile and email");
			return res;
		}
		else
		{
			res.setStatus("404");
			res.setStatus("null value are not accepted");
			return res;
		}
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return res;
		
		
	}
		
	/*
	 * @Value("&{project.image}") String path;
	 */
		@PostMapping("/upload")
		public @ResponseBody String fileupload(@RequestParam("image") MultipartFile image,@RequestParam("typeproduct")String typeproduct
			,	@RequestParam("name")String name)
		{
			
			String path="C:\\Users\\Lenovo\\Pictures";
			
			String fileName=null;
			try {
				fileName= this.fileService.uploadImage(path,image);
				
				Product product =new Product();
				
				product.setFilename(fileName);
				product.setName(name);
				product.setTypeproduct(typeproduct);
				
				
				productService.uploadproduct(product);
				
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			return "string";
			
		}

	


}
