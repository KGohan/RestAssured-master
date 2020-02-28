import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import pojo.GoRestUser;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class GoRestTest {
    //https://gorest.co.in/public-api/users?_format=json&access-token=j6XoJSutZrv-ikB-4X4_Zndi54_iqSZES-Ap
    @Test
    public void queryParamsTest(){
        given().
                log().uri()
                .param( "access-token", "j6XoJSutZrv-ikB-4X4_Zndi54_iqSZES-Ap" ).
                param( "_format", "json" ).
                when().
                get("https://gorest.co.in/public-api/users").
                then().
                log().status().
                log().body().
                body( "_meta.code", equalTo( 200 ) );
    }

    @Test
    public void basicAuthTest(){
        given()
                .auth()         // basic auth
                .preemptive()// basic auth
                .basic("j6XoJSutZrv-ikB-4X4_Zndi54_iqSZES-Ap", "") // basic auth
                .log().headers()
                .when()
                .get("https://gorest.co.in/public-api/users").
                then().
                log().status().
                log().body().
                body( "_meta.code", equalTo( 200 ) );
    }


    @Test
    public void oAuth2Test(){
        given()
                .auth()
                .oauth2("j6XoJSutZrv-ikB-4X4_Zndi54_iqSZES-Ap") // basic OAuth 2
                .log().headers()
                .when()
                .get("https://gorest.co.in/public-api/users").
                then().
                log().status().
                log().body().
                body( "_meta.code", equalTo( 200 ) );
    }

    @Test
    public void noAuthTest(){
        given()
                .when()
                .get("https://gorest.co.in/public-api/users").
                then().
                log().status().
                log().body().
                body( "_meta.code", equalTo( 401 ) );
    }

    @Test
    public void createUserTest() {
        GoRestUser user = new GoRestUser();
        user.setEmail( "as2fa123sdf@asd.as" );
        user.setFirstName( "My First Name" );
        user.setLastName( "My Last Name" );
        user.setGender( "male" );


        String userId = given()
                .contentType( ContentType.JSON )
                .auth()
                .oauth2( "j6XoJSutZrv-ikB-4X4_Zndi54_iqSZES-Ap" ) // basic OAuth 2
                .body( user )
                .when()
                .post( "https://gorest.co.in/public-api/users" )
                .then()
//                .log().body()
                .body( "_meta.code", equalTo( 201 ) )
                .extract().jsonPath().getString( "result.id" );

        given()
                .auth()
                .oauth2( "j6XoJSutZrv-ikB-4X4_Zndi54_iqSZES-Ap" ) // basic OAuth 2
                .when()
                .delete("https://gorest.co.in/public-api/users/"+userId)
                .then()
//                .log().all()
                .body( "_meta.code", equalTo( 204 ) )
        ;
    }
}