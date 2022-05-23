package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\NITHIN RAJ E\\eclipse-workspace\\SampleCucumber\\src\\test\\resources\\testing.feature"}, glue= {"org.stepdef"})
public class TestRunner {

}
