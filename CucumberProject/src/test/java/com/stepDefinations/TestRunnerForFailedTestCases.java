package com.stepDefinations;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



// For Failed TestCases  only
@CucumberOptions(
		features= {"@tagetfailed/failestestcases.txt"},
		glue= {"Features"},strict=true, dryRun=false,monochrome=true,
		plugin= {"pretty","html:targetReports/cucumberReports/cucumber-reports",
				"json:targetReports/cucumberReports/cucumbert-reports.json","rerun:tagetfailed/failestestcases.txt"}
		//tags={"@smoke"}
		)
public class TestRunnerForFailedTestCases extends AbstractTestNGCucumberTests{
}
