package testtweet;


import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tweet.TweetAPIClient;

import java.util.UUID;

public class TweetAPITest {
    private TweetAPIClient tweetAPIClient;

    @BeforeClass
    public void setUpTweetAPI(){
        this.tweetAPIClient=new TweetAPIClient();
    }

    @Test(enabled = true)
    public void testUserCanTweetSuccessfully(){

        String tweet="Tweet "+ UUID.randomUUID().toString();
        ValidatableResponse response=this.tweetAPIClient.createTweet(tweet);
        if (response.equals(200) ){
            System.out.println("TEST PASSED ");
        }else{
            System.out.println("TEST FAILED ");
        }
        response.statusCode(200);
        String actualmessage=response.extract().body().path("text");
        System.out.println(actualmessage);

    }


    @Test(enabled = true)
    public void checkdupp(){
       try{
           String tweet="Tweet "+ UUID.randomUUID().toString();
           ValidatableResponse response=this.tweetAPIClient.createTweet(tweet);
           if (response.equals(200) ){
               System.out.println("TEST PASSED ");
           }else{
               System.out.println("TEST FAILED ");
           }
           response=this.tweetAPIClient.createTweet(tweet);
           response.statusCode(403);
           String currentMessage="Status is a duplicate.";
           String expMessage=response.extract().body().path("errors[0].message");
           if (currentMessage==expMessage ){
               System.out.println("TEST PASSED ");
           }else{
               System.out.println("TEST FAILED ");
           }

       }catch (Exception e){

           System.out.println(e);
       }



    }

   @Test(enabled = true)
    public void testDeleteTweet(){

        ValidatableResponse response=this.tweetAPIClient.deletemessage(1273434027597484038L);

    }

   @Test (enabled = true)
    public void romoveMesage(){

try {

    String tweet="Tweet "+ UUID.randomUUID().toString();
    ValidatableResponse response=this.tweetAPIClient.deleteWelcome(131314);

    if (response.equals(204) ){
        System.out.println(" Message deleteWelcome");
    }else{
        System.out.println("Message NOT deleteWelcome  ");
    }
    String actualTweet=response.extract().body().path("text");

}catch (Exception e){
    System.out.println(e);

}


    }



   @Test (enabled = true)
    public void getstatus(){


        ValidatableResponse response=this.tweetAPIClient.getstatus();
        response.statusCode(403);
        String actualTweet=response.extract().body().path("text");
        System.out.println(actualTweet);
    }

    @Test (enabled = true)
    public void getTimeline(){


        ValidatableResponse response=this.tweetAPIClient.getTimeline("null");
        if (response.equals(200)){
            System.out.println("TESTPASSED");
        }else{
            System.out.println("TESTfailed");
        }

    }


     @Test (enabled = true)
    public void getlist(){
    try{
    ValidatableResponse response=this.tweetAPIClient.getlist("twitterdev");
        if (response.equals(200)){
            System.out.println("TESTPASSED");
        }else{
            System.out.println("TESTfailed");
        }

        String actualTweet=response.extract().body().path("text");
    System.out.println(actualTweet);
}    catch (Exception e){
        System.out.println(e);
}


    }


    @Test (enabled = true)
    public void geTTweets(){
        try{
            ValidatableResponse response=this.tweetAPIClient.geTTweets();
            if (response.equals(200)){
                System.out.println("TESTPASSED");
            }else{
                System.out.println("TESTfailed");
            }

            String actualTweet=response.extract().body().path("text");
            System.out.println(actualTweet);
        }    catch (Exception e){
            System.out.println(e);
        }


    }

   @Test(enabled = true)
    public void testSearchTweets(String username) {

try{

    ValidatableResponse response=this.tweetAPIClient.searchTweets();
    if (response.equals(200)){
        System.out.println("TESTPASSED");
    }else{
        System.out.println("TESTfailed");
    }

    String actualTweet=response.extract().body().path("text");
    System.out.println(actualTweet);

}catch (Exception e){

    System.out.println(e);
}



    }
    @Test (enabled = true)
    public void MENTION_ENDPOINT(){


        ValidatableResponse response=this.tweetAPIClient.MENTION_ENDPOINT();
        if (response.equals(200)){
            System.out.println("TESTPASSED");
        }else{
            System.out.println("TESTfailed");
        }

    }

}
