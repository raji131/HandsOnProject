package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseUtils;

public class FlipkartPage extends BaseUtils {

	    public FlipkartPage() {
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(name = FlipkartUILocator.SEARCH_NAME)
	    public WebElement searchBox;

	    @FindBy(xpath = FlipkartUILocator.POPUP)
	    public WebElement closePopup;

	    @FindBy(xpath = FlipkartUILocator.PRODUCT_NAME)
	    public List<WebElement> productNames;
	}

