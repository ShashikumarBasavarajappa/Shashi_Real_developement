package com.dev.mongo;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoDatabase;

public class MongoDBJDBCConnection {
public static void main(String[] args) {
	try {
		MongoClient mg = new  MongoClient("localhost",  27017 );
		@SuppressWarnings("deprecation")
		DB db = mg.getDB("test1");
		System.out.println("Connect to database successfully");
		DBCollection col =  db.getCollection("mycollection");
		System.out.println("Collection has selected successfully");
		
		 MongoCredential credential; 
	      credential = MongoCredential.createCredential("sampleUser", "myDb", 
	         "password".toCharArray()); 
	      System.out.println("Connected to the database successfully");  
	      
	      // Accessing the database 
	      MongoDatabase database = mg.getDatabase("myDb"); 
	      System.out.println("Credentials ::"+ credential);     
	}catch (Exception e) {
		System.err.println(e.getClass().getName() + ": " + e.getMessage());
	}
	
}
}
