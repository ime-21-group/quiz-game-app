package com.gplenty.quiz;

import java.util.Map;

import org.junit.Test;

import com.gplenty.quiz.connection.JsonParser;

public class JsonParserTest 
{
	@Test
	public void test()
	{
		String json1 = "{chave1:123;chave2:321}";
		Map<String, String> result;
		
		String json2 = "{chave1:oioioi;chaveDeUmArray:[{a:aaa},{a:bbb},{a:ccc}]}";
		
		result = JsonParser.jsonToMap(json1);
		
		for(String key : result.keySet())
			System.out.println(key + ": " + result.get(key));
		
		result = JsonParser.jsonToMap(json2);
		
		for(String key : result.keySet())
			System.out.println(key + ": " + result.get(key));
	}
}
