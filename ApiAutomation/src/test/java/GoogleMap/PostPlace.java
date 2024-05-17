package GoogleMap;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import PayloadClasses.GMpostBody;

public class PostPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().relaxedHTTPSValidation().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").body(GMpostBody.payload()).when().post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200).extract().asString();
		System.out.println(response);
		
		JsonPath jp = new JsonPath(response);
		System.out.println(jp.getString("status"));
		System.out.println(jp.getString("place_id"));

	}

}
