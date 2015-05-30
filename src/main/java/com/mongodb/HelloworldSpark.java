package com.mongodb;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

public class HelloworldSpark {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Spark.get(new Route("/"){
			@Override
			public Object handle(Request arg0, Response arg1) {
				// TODO Auto-generated method stub
				return "Hello world from Spark";
			}
			
		});


	}

}
