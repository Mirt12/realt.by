import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectForUI {
    WebDriver driver;
    private String endpoint = "https://realt.by";
    private String vtorichkaDropDownLocator = "//body/div[3]/div[8]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/select[1]";
    private String naSutkiOptionLocator = "//*[@id=\"residentialInputs\"]/div[1]/form/div[1]/div/div[1]/select/option[4]";
    private String amountOfRoomsDropDownLocator = "//select[@id='rooms']";
    private String oneRoomFlatOptionLocator = "//option[contains(text(),'1к квартира')]";
    private String priceDropDownLocator = "//div[@class='col-md-4 col-lg-auto object_type-1 object_type-2001']//a[@href = '#collapsePriceResidential']";
    private String lowPriceInputFieldLocator = "//body/div[3]/div[8]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/input[1]";
    private String hightPriceInputLocator = "//body/div[3]/div[8]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/input[2]";
    private String selectTownLocator = "//span[@id='select2-selectRegionResidential-container']";
    private String inputTownLocator = "//body/span[1]/span[1]/span[1]/input[1]";
    private String searchBtnLocator = "//body/div[3]/div[8]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/a[2]";

    public PageObjectForUI getUrl() {
        driver.get(endpoint);
        return this;
    }

    public PageObjectForUI clickVtorichkaDropDown() {
        WebElement drop = driver.findElement(By.xpath(vtorichkaDropDownLocator));
        drop.click();
        return this;
    }

    public PageObjectForUI selectNaSutkiOption() {
        WebElement option = driver.findElement(By.xpath(naSutkiOptionLocator));
        option.click();
        return this;
    }

    public PageObjectForUI clickAmountOfRoomsDropDown() {
        WebElement drop = driver.findElement(By.xpath(amountOfRoomsDropDownLocator));
        drop.click();
        return this;
    }

    public PageObjectForUI selectOneRoomOption() {
        WebElement option = driver.findElement(By.xpath(oneRoomFlatOptionLocator));
        option.click();
        return this;
    }

    public PageObjectForUI clickPriseDropDowm() {
        WebElement drop = driver.findElement(By.xpath(priceDropDownLocator));
        return this;
    }

    public PageObjectForUI fillLowPriseValue() {
        WebElement lowPriceElement = driver.findElement(By.xpath(lowPriceInputFieldLocator));
        lowPriceElement.sendKeys("100");
        return this;
    }

    public PageObjectForUI fillHightPriseValue() {
        WebElement lowPriceElement = driver.findElement(By.xpath(hightPriceInputLocator));
        lowPriceElement.sendKeys("200");
        return this;
    }

    public PageObjectForUI clickSelectTown() {
        WebElement drop = driver.findElement(By.xpath(selectTownLocator));
        drop.click();
        return this;
    }

    public PageObjectForUI fillTownInputField() {
        WebElement input = driver.findElement(By.xpath(inputTownLocator));
        input.sendKeys("Минск");
        return this;
    }

    public PageObjectForUI clickSearchBtnLocator() {
        WebElement btn = driver.findElement(By.xpath(searchBtnLocator));
        btn.click();
        return this;
    }
}
