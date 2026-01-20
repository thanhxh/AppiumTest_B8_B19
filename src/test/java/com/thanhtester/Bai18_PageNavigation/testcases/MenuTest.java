package com.thanhtester.Bai18_PageNavigation.testcases;


import com.thanhtester.Bai18_PageNavigation.pages.LoginPage;
import com.thanhtester.Bai18_PageNavigation.pages.MenuPage;
import com.thanhtester.common.BaseTestTaurusApp;
import org.testng.annotations.Test;

public class MenuTest extends BaseTestTaurusApp {

    LoginPage loginPage;
    MenuPage menuPage;

    @Test
    public void testSearchTable() {
        loginPage = new LoginPage();
        //Khởi tạo trang Menu thông qua việc Login nếu thành công
        menuPage = loginPage.login("admin", "admin");
        loginPage.verifyLoginSuccess();

        downloadDataFromServer(2);

        //menuPage = new MenuPage(); //không cần khởi tạo trang Menu riêng
        menuPage.searchTable("Table 1");
        menuPage.checkTableResultTotal(1);
    }
}
