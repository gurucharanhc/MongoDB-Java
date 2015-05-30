package com.mongodb;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class HelloworldFreeMarker {
	public static void main(String[] args) {
		Configuration config= new Configuration();
		config.setClassForTemplateLoading(HelloworldFreeMarker.class, "/");
		
		try {
			Template template = config.getTemplate("hello.ftl");
			StringWriter writer = new StringWriter();
			Map<String, Object> helloMap = new HashMap<String, Object>();
			helloMap.put("name","freemarker");
			template.process(helloMap, writer);
			System.out.println(writer);
		} catch (IOException | TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
