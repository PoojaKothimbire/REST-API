package examplesOfAPI;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

public class FirstExample
{
	
@Test
public void postEx()
{
	baseURI="https://x8ki-letl-twmt.n7.xano.io/api:gHPd8le5";

	
	
	Map <String , Object> map = new HashMap<String , Object>();
	
	map.put("coin1","INR");
	map.put("coin2","USDT");
	map.put("coin1Amount","300");
	map.put("coin2Amount","2");
	
	System.out.println(map);
	
	 given().
	   when().
	 post("/transaction").
	   getStatusCode();

}
	
	
@Test
	 public void postTest()
	  {
		 baseURI="https://x8ki-letl-twmt.n7.xano.io/api:gHPd8le5";
		  
		  Map <String , Object> map = new HashMap<String , Object>();
		  map.put("id","6" );
		  map.put("created_at","1675270470670");
		  map.put("sentCoin", "INR");
		  map.put("receivedCoin", "USDT");
		  map.put("sentCoinAmount", "300");
		  map.put("receivedCoinAmount", "2");
		  map.put("receivedCoinMarketPrice", "150");
		  
		 
		  
		  System.out.println(map);
		  given().
		  when().
		    post("/transaction/6").
		 getStatusCode();
		    
	  }

@Test 
       public void getTest()
    {
	        
	    baseURI="https://x8ki-letl-twmt.n7.xano.io/api:gHPd8le5";
	    
	    Map <String , Object> map = new HashMap<String , Object>();
		  map.put("id","6" );
		  map.put("created_at","1675270470670");
		  map.put("sentCoin", "INR");
		  map.put("receivedCoin", "USDT");
		  map.put("sentCoinAmount", "300");
		  map.put("receivedCoinAmount", "2");
		  map.put("receivedCoinMarketPrice", "150");
	    
		  System.out.println(map);
		   
	    when().
           get("/transaction/{id}", 6).
        then().
          statusCode(404);
	
	}

}