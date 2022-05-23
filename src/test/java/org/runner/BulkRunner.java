package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\NITHIN RAJ E\\eclipse-workspace\\SampleCucumber\\src\\test\\resources\\bulk.feature"},snippets = SnippetType.CAMELCASE,glue= {"com.bulk"})
public class BulkRunner {

}
