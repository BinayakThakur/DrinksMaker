package com.tools.api;

import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.tools.models.Drink;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Cocktail {
 public Drink request() throws IOException{


OkHttpClient client = new OkHttpClient();

Request request = new Request.Builder()
	.url("https://www.thecocktaildb.com/api/json/v1/1/random.php")
	.get().build();


Response response = client.newCall(request).execute();
String json=response.body().string();
JsonParser parser = new JsonParser();
JsonElement element = parser.parse(json);
Drink drink=new Gson().fromJson(element, Drink.class);
return drink;
 }
}
