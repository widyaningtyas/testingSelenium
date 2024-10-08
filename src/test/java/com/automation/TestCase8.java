package com.automation;

import com.automation.pages.HomePage;
import com.automation.pages.ProductDetailPage;
import com.automation.pages.ProductsPage;
import io.qameta.allure.*;
import io.qameta.allure.internal.shadowed.jackson.databind.ser.Serializers;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("Regression Tests")
@Feature("Verify")
public class TestCase8 extends BaseTest {

    @Test(description = "Test Case 8: Verify All Products and product detail page")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Verify All Products and product detail page")
    @Description("""
            1. Launch browser
            2. Navigate to url 'http://automationexercise.com'
            3. Verify that home page is visible successfully
            4. Click on 'Products' button
            5. Verify user is navigated to ALL PRODUCTS page successfully
            6. The products list is visible
            7. Click on 'View Product' of first product
            8. User is landed to product detail page
            9. Verify that detail detail is visible: product name, category, price, availability, condition, brand""")
    public void verifyAllProductsAndProductDetailPage() {

    }

    @Step("Verify user is navigated to ALL PRODUCTS page successfully")
    public static void verifyUserIsNavigatedToAllProductsPageSuccessfully() {
    }

    @Step("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    private void verifyThatDetailDetailIsVisible() {
    }
}