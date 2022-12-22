package starter.dashboardPage;

import net.serenitybdd.core.pages.PageObject;

public class ramoDashboardPage extends PageObject {

    public void dashboardVerified(){
        System.out.println(getDriver().getTitle());
    }
}
