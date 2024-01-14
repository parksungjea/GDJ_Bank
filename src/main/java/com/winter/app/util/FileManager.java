package com.winter.app.util;

import java.io.File;
import java.util.Calendar;

import org.springframework.web.multipart.MultipartFile;

public class FileManager {

	
	public String fileSave(String path, MultipartFile file) throws Exception{
		
		File f = new File(path);
		
		if(f.isFile()) {
			throw new Exception();
		}
		
		if(!f.exists()) {
			f.mkdirs();
		}
		
		Calendar calendar = Calendar.getInstance();
		String filename = calendar.getTimeInMillis()+"_"+file.getOriginalFilename();
		
		
		f = new File(f,filename);
		
		file.transferTo(f);
		return filename;
		
		
	}
}
