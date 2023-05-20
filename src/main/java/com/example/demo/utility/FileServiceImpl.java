package com.example.demo.utility;

import java.io.File;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service
public class FileServiceImpl implements FileService {

	@Override
	public String uploadImage(String path, MultipartFile file) {
		
		
		String  name=file.getOriginalFilename();
		
		
		String filepath=path+ File.separator+name;
		
		
		// create foleder if not created
		
		File f=new File(path);
		if(!f.exists())
		{
			f.mkdir();
		}
				
		return filepath;
	}

}
