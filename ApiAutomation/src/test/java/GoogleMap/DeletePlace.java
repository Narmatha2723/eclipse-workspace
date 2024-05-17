package GoogleMap;

import static io.restassured.RestAssured.given;

import PayloadClasses.DeleteBody;
import io.restassured.RestAssured;

public class DeletePlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().relaxedHTTPSValidation().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
				.body(DeleteBody.delete()).when().delete("/maps/api/place/delete/json").then().log().all().assertThat().statusCode(200).extract().asString();
		System.out.println(response);

	}

}
