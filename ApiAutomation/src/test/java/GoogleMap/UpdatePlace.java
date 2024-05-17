package GoogleMap;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import PayloadClasses.GMupdateBody;

public class UpdatePlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().relaxedHTTPSValidation().log().all().queryParam("key","qaclick123").queryParam("place_id","cf83c15a8ce17cd38baf628cee6e91a4").header("Content-Type","application/json")
				.body(GMupdateBody.updatePlace()).when().put("/maps/api/place/update/json").then().log().all().assertThat().statusCode(200).extract().asString();
		System.out.println(response);

	}

}
