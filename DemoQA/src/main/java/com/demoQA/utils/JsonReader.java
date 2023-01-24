package com.demoQA.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import com.demoQA.dto.TextBoxJson;
import com.google.gson.Gson;

public class JsonReader {
	
	private final String textBoxJsonfilepath=FileReaderManager.getInstance().getConfigReader().getTestDatapath()+"//textbox.json";
    private  List<TextBoxJson> textboxdetails;
	JsonReader(){
		textboxdetails=getJsonData();
	}
	
	public  List<TextBoxJson> getJsonData(){
		Gson gson=new Gson();
		BufferedReader br=null;
		 TextBoxJson[] data=null;
		try {
			 br=new BufferedReader(new FileReader(textBoxJsonfilepath));
			data=gson.fromJson(br, TextBoxJson[].class);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try{
				if(br!=null)
					br.close();
			}catch(Exception e){
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 return Arrays.asList(data);
	}
	
	public TextBoxJson getDetails(){
		for(TextBoxJson data:textboxdetails){
				
			return data;			
		}
		return null;
	}
}
