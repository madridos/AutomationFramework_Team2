package tweet;

import base.TwitterAPIClient;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;


public class TweetAPIClient  extends TwitterAPIClient {
    // https://developer.twitter.com/en/docs/tweets/timelines/api-reference/get-statuses-user_timeline
    // Tweet Client class that consists of all the different API's of Twitter's Tweet
    // POST: Retrieve and engage with tweets....

    private final String CREATE_USER="/statuses/update.json";
    private final String DELETE_MESSAGE="/statuses/destroy.json";
    private final String GET_USER_TWEETS_ENDPOINT="statuses/user_timeline.json";
    private final String GET_USER_TWEETS_LOGIN="/sessions";
    private final String DELETE_WELCOME_ENDPOINT ="/direct_messages/welcome_messages/destroy.json";
    private final String GET_STATUS ="/statuses/update.json";
    private final String GET_TIMELINE ="/jot/client_event.json";
    private final String GET_list ="/favorites/list.json?count=200&screen_name=twitterdev";
    private final String SEARCH_TWEETS_ENDPOINT="/statuses/filter.json";
    private final String MENTION_ENDPOINT="/statuses/mentions_timeline.json";





    public ValidatableResponse getUserTimelineTweets(){
        return given().auth().oauth(this.apiKey, this.apiSecretKey, this.accessToken, this.accessTokenSecret)
                .when().get(this.baseUri+this.GET_USER_TWEETS_ENDPOINT)
                .then();
    }


    public ValidatableResponse createTweet(String tweet){
        return given().auth().oauth(this.apiKey, this.apiSecretKey, this.accessToken, this.accessTokenSecret)
                .param("status",tweet)
                .when().post(this.baseUri+this.CREATE_USER)
                .then();
    }


    public ValidatableResponse deletemessage( Long tweetId){
        return given().auth().oauth(this.apiKey, this.apiSecretKey, this.accessToken, this.accessTokenSecret)
                .queryParam("id",tweetId)
                .when().post(this.baseUri+this.DELETE_MESSAGE)
                .then();
    }
    public ValidatableResponse geTTweets(){
        return given().auth().oauth(this.apiKey, this.apiSecretKey, this.accessToken, this.accessTokenSecret)
                .when().post(this.baseUri+this.GET_USER_TWEETS_LOGIN)
                .then();
    }


    public ValidatableResponse deleteWelcome(long id){
        return given().auth().oauth(this.apiKey, this.apiSecretKey, this.accessToken, this.accessTokenSecret)
                .param("id", id )
                .when().delete(this.baseUri+this.DELETE_WELCOME_ENDPOINT)
                .then();
    }


    public ValidatableResponse getstatus(){
        return given().auth().oauth(this.apiKey, this.apiSecretKey, this.accessToken, this.accessTokenSecret)
                //.param("text", message )
                .when().post(this.baseUri+this.GET_STATUS)
                .then();
    }

    public ValidatableResponse getTimeline(String Message){
        return given().auth().oauth(this.apiKey, this.apiSecretKey, this.accessToken, this.accessTokenSecret)
                .param("Name", Message )
                .when().post(this.baseUri+this.GET_TIMELINE)
                .then();
    }

    public ValidatableResponse getlist(String Message){
        return given().auth().oauth(this.apiKey, this.apiSecretKey, this.accessToken, this.accessTokenSecret)
                .param("Name", Message.toString() )
                .when().get(this.baseUri+this.GET_list)
                .then();
    }


    public ValidatableResponse searchTweets(){
        return given().auth().oauth(this.apiKey, this.apiSecretKey, this.accessToken, this.accessTokenSecret)
               // .param("q", atUsername)
                .when().post(this.baseUri+this.SEARCH_TWEETS_ENDPOINT)
                .then();
    }

    public ValidatableResponse MENTION_ENDPOINT(){
        return given().auth().oauth(this.apiKey, this.apiSecretKey, this.accessToken, this.accessTokenSecret)
                .when().get(this.baseUri+this.MENTION_ENDPOINT)
                .then();
    }


}
