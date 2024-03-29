package com.salahbkd.designpatterns.structural.facade;

import java.util.List;

public class TwitterAPI {
  private String appKey;
  private String secret;

  public TwitterAPI(String appKey, String secret) {
    this.appKey = appKey;
    this.secret = secret;
  }

  public List<Tweet> getRecendTweets() {
    TwitterClient twitterClient = new TwitterClient();
    var tweets = twitterClient.getRecentTweets(getAccessToken());

    return tweets;
  }

  public String getAccessToken() {
    var oauth = new OAuth();
    var requestToken = oauth.requestToken(appKey, secret);
    var accessToken = oauth.getAccessToken(requestToken);

    return accessToken;
  }

}
