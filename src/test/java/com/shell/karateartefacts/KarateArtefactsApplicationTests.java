package com.shell.karateartefacts;

import com.intuit.karate.junit4.Karate;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Karate.class)
@CucumberOptions(features = "classpath: src/main/resources/userController.feature" )
public class KarateArtefactsApplicationTests {



}
