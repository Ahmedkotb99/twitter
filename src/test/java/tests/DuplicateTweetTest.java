package tests;

import pages.ProfilePage;

public class DuplicateTweetTest extends TestBase{

	ProfilePage proPageObject;
	String tweet="I love Cars";
	
	public void UserCantTweetSameTweetTwice() 
	{
		proPageObject=new ProfilePage(driver);
		proPageObject.UserTweet(tweet);
		proPageObject.UserTweet(tweet);
		
	}
}
