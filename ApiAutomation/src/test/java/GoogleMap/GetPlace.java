package GoogleMap;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;

public class GetPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().relaxedHTTPSValidation().log().all().queryParam("key","qaclick123").queryParam("place_id", "cf83c15a8ce17cd38baf628cee6e91a4").header("Content-Type","application/json")
				.when().post("/maps/api/place/get/json").then().log().all().assertThat().statusCode(200).extract().asString();
		System.out.println(response);
	}

}
