package br.eti.julianograciano.tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/softpost.feature", glue={
        "classpath:br.eti.julianograciano.stepdefinitions", "classpath:br.eti.julianograciano.utils"})
public class TestRunnerSoftpost {
}