package examplesOfAPI;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class FirstExample
{
@Test
	 public void postTest()
	  {
		 baseURI="https://x8ki-letl-twmt.n7.xano.io/api:gHPd8le5";
		  
		  Map <String , Object> map = new HashMap<String , Object>();
		  map.put("id","6" );
		  map.put("created_at","1675270470670");
		  map.put("sentCoin", "INR");
		  map.put("receivedCoin", "USDT");
		  map.put("sentCoinAmount", "10");
		  map.put("receivedCoinAmount", "75");
		  map.put("receivedCoinMarketPrice", "65");
		  
		 
		  
		  System.out.println(map);
		  given().
		  when().
		    post("/transaction/6").
		 getStatusCode();
		   
	
	  }
}
