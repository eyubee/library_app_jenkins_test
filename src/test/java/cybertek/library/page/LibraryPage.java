package cybertek.library.page;


import cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryPage {
    public LibraryPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (id= "inputEmail")
    public WebElement email;

    @FindBy (id= "inputPassword")
    public WebElement password;

    @FindBy (xpath = "//button[@class= 'btn btn-lg btn-primary btn-block']")
    public WebElement signInButton;

    @FindBy(xpath ="//img[@id='user_avatar']/following-sibling::span" )
    public WebElement userID;


}
