package org.facebook;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features =" C:\\Users\\Admin\\eclipse-workspace\\ZCucumber\\src\\test\\resources\\Facebook.feature",
glue="org.facebook",
monochrome=true,
dryRun=false,
 //plugin = "html:C:\\Users\\Admin\\eclipse-workspace\\ZCucumber\\target",
// plugin = "junit:C:\\Users\\Admin\\eclipse-workspace\\ZCucumber\\target\\abc.json",
    plugin = "junit:C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\ZCucumber\\\\target\\\\def.xml")
public class TestRunner {
	
}
