package org.Adactin;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Admin\\eclipse-workspace\\ZCucumber\\src\\test\\resources\\Adactin.feature",
glue ="org.Adactin",
monochrome=true,
dryRun=false,
plugin ="html:C:\\Users\\Admin\\eclipse-workspace\\ZCucumber\\target")
public class TestRunnerClass {

}
