package com.sist.recipe;
import java.io.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class Recipe {
    // 데이터 읽기
	public RecipeVO[] recipeAllData()
	{
		RecipeVO[] recipe=new RecipeVO[146854];
		//String result="";
		try
		{
			FileReader fr=new FileReader(new File("c:\\javaDev\\recipe.json"));
        	StringBuffer data=new StringBuffer();
        	int i=0;
        	while((i=fr.read())!=-1)
        	{
        		data.append(String.valueOf((char)i));
        	}
        	fr.close();
        	String result=data.toString();
        	JSONParser parser=new JSONParser();
        	JSONArray arr=(JSONArray)parser.parse(result);
        	for(i=0;i<arr.size();i++)
        	{
        		JSONObject obj=(JSONObject)arr.get(i);
        		//recipe[i].setNo(Integer.parseInt(obj.get(i)));
        	}
		}catch(Exception ex){}
		return recipe;
	}
	public String chefAllData()
	{
		String result="";
		try
		{
			FileReader fr=new FileReader(new File("c:\\javaDev\\chef.json"));
        	StringBuffer data=new StringBuffer();
        	int i=0;
        	while((i=fr.read())!=-1)
        	{
        		data.append(String.valueOf((char)i));
        	}
        	fr.close();
        	result=data.toString();
		}catch(Exception ex){}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Recipe r=new Recipe();
        //String recipe=r.recipeAllData();
        //System.out.println(recipe);
        //String chef=r.chefAllData();
        //System.out.println(chef);
        
	}
    
}
