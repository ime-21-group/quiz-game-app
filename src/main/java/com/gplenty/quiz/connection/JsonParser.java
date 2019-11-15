package com.gplenty.quiz.connection;

import java.util.Map;
import java.util.TreeMap;

public class JsonParser 
{
	public static Map<String, String> jsonToMap(String json)
	{
		Map<String, String> jsonAsMap = new TreeMap<String, String>();
		
		if(json.charAt(0) != '{' || json.charAt(json.length() - 1) != '}')
			throw new IllegalArgumentException("Json não está formatado adequadamente: " + json);
		
		String jsonWithoutBrackets = json.substring(1, json.length() - 1);
		
		for(int i = 0; i < jsonWithoutBrackets.length(); i++)
		{
			String key = getKey(jsonWithoutBrackets.substring(i));
			
			i += key.length() + 1;
			
			String attribute = getAttribute(jsonWithoutBrackets.substring(i));
			
			i += attribute.length();
			
			jsonAsMap.put(key, attribute);
		}
		
		return jsonAsMap;
	}
	
	private static String getKey(String json)
	{
		int index = 0;
		
		for(int i = 0; i < json.length(); i++)
		{
			if(json.charAt(i) == ':')
			{
				index = i;
				break;
			}
		}
		
		return json.substring(0, index);
	}
	
	private static String getAttribute(String json)
	{
		int insideBrackets = 0;
		int index = 0;
		
		for(int i = 0; i < json.length(); i++)
		{
			if(json.charAt(i) == '{')
				insideBrackets++;
			if(json.charAt(i) == '}')
				insideBrackets--;
			if(json.charAt(i) == ';' && insideBrackets == 0)
			{
				index = i;
				break;
			}
		}
		
		if(index == 0)
			index = json.length();
		
		return json.substring(0, index);
	}
}