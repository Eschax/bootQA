package restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredlmpl {
    public static void main(String[] args) {
        getAllproduct();
    }

    public static void getAllproduct(){
        //define baseURI
        /*
         * "https://dummyjson.com/products"
         * baseURI = "https://dummyjson.com"
         * path = "/products"
         */

        RestAssured.baseURI = "https://dummyjson.com";
        RequestSpecification requestSpecification = RestAssured //ini biar gak ulang-ulang pemanggilan RestAssured .given()
                                                    .given();

        Response response = requestSpecification.log().all()
                            .get("products"); //cara pertama

        Response response2 = RestAssured //cara kedua
                            .given()
                                .log()
                                .all()
                            .when()
                                .get("products");

        System.out.println("Hasilnya adalah : " + response2.asPrettyString());
    }   
}
