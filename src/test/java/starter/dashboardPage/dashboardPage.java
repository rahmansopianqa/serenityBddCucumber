package starter.dashboardPage;

import net.thucydides.core.annotations.Step;

public class dashboardPage {

    ramoDashboardPage dashboard;
    @Step
    public void verifyDashboard(){
        dashboard.dashboardVerified();
    }
}
