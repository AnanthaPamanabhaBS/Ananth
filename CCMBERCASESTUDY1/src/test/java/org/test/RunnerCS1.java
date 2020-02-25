package org.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@CucumberOptions(plugin= {"pretty","json:customer-report.json"})
@RunWith(Cucumber.class)
public class RunnerCS1 {
}
