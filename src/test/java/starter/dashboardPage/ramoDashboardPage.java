package starter.dashboardPage;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ramoDashboardPage extends PageObject {

    public void dashboardVerified(){

        $(By.xpath("//*[text() = 'Dashboard']"));
    }

}
