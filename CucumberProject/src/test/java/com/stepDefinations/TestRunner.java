package com.stepDefinations;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
features= {"G:\\Core java\\CucumberProject\\src\\test\\java\\Features\\Login.feature"},
glue= {"Features"},strict=true, dryRun=false,monochrome=true,
plugin= {"pretty","html:targetReports/cucumberReports/cucumber-reports",
		"json:targetReports/cucumberReports/cucumbert-reports.json","rerun:tagetfailed/failestestcases.txt"}
//tags={"@smoke"}
)
public class TestRunner  extends AbstractTestNGCucumberTests{

/*	 For execution of multiple feature file and multiple scenarios
 * 
 * @DataProvider(parallel=true)
	 public Object[][] scenarios()
	{
	 return super.scenarios();
	}*/
	
	
}
