package com.juaracoding.cucumber.utils;

public enum TestScenarios {

//    T1("User invalid login"),
//    T2("User valid login"),
//    T3("Dashboard user function"),
//    T4("Recruitment user function"),
//    T5("Search hiring by manager"),
    T6("User login"),
    T7("User search item satu"),
    T8("User User add to cart item satu"),
    T9("User search item dua"),
    T10("User User add to cart item dua"),
    T11("User Checkout");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}