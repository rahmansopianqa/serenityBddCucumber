package starter.dashboardPage;

import net.serenitybdd.core.exceptions.NoSuchElementException;
import net.thucydides.core.annotations.Step;

public class dashboardPage {

    ramoDashboardPage dashboard;
    @Step
    public boolean verifyDashboard() {
        try {
            dashboard.dashboardVerified();
            return true;

        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
