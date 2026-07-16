package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.BaseTest;

public class Hooks {
    @Before
    public void setUp() {
        BaseTest.initializeDriver();
    }

    @After
    public void tearDown() {
        BaseTest.quitDriver();
    }
}
