package com.hrms.testcases;

import com.hrms.pages.AddEmployeePage;
import com.hrms.pages.DashboardPage;
import com.hrms.pages.LoginPage;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddEmployeeTest extends CommonMethods {

    @Test(groups = "Smoke")
    public void addEmployee() {
        //login to the hrms
        LoginPage login = new LoginPage();
        login.login(ConfigsReader.getPropertyValue("username"), ConfigsReader.getPropertyValue("password"));
        //navigate to add employee page
        DashboardPage dash = new DashboardPage();
        JSClick(dash.PIM);
        JSClick(dash.addEmployee);
        //add employee
        AddEmployeePage addEmp = new AddEmployeePage(driver);
        sendText(addEmp.firstName, "Hejran");
        sendText(addEmp.middleName, "Tabesh");
        sendText(addEmp.lastName, "Wardak");
        click(addEmp.saveBtn);
        //validation
        //assertion
        SoftAssert softAssert=new SoftAssert();

    }

}
