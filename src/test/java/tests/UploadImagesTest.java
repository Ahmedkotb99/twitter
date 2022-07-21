package tests;

import org.testng.annotations.Test;

import pages.ProfilePage;

public class UploadImagesTest extends TestBase{
    ProfilePage profilePageObj; 
	
	@Test
	public void UserUploadFourImages() 
	{
		profilePageObj=new ProfilePage(driver);
		profilePageObj.ImageUpload();
		profilePageObj.ImageUpload();
		profilePageObj.ImageUpload();
		profilePageObj.ImageUpload();
		
	}
	
	@Test
	public void UserUploadFiveImages() 
	{
		profilePageObj=new ProfilePage(driver);
		profilePageObj.ImageUpload();
		profilePageObj.ImageUpload();
		profilePageObj.ImageUpload();
		profilePageObj.ImageUpload();
		profilePageObj.ImageUpload();
	}
}
