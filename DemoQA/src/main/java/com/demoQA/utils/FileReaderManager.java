package com.demoQA.utils;

public class FileReaderManager {
	
	private static FileReaderManager filereader=new FileReaderManager();
	
	private static ConfigFileReader configReader;
	
	private static JsonReader jsonReader;
	
	private FileReaderManager(){
		
	}
	public ConfigFileReader getConfigReader(){
		return (configReader == null) ? new ConfigFileReader() : configReader;
	}
	public JsonReader getJsonReader(){
		return (jsonReader == null) ? new JsonReader() : jsonReader;
	}
	
	public static FileReaderManager getInstance(){
		return filereader;
		
	}
    
}
