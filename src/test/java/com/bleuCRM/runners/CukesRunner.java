package com.bleuCRM.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//connection between step definations and features
@RunWith(Cucumber.class)
@CucumberOptions(


        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports"// that takes html report (index)
        },
        features = "src/test/resources/features",
        glue = "com/bleuCRM/step_definitions",
        dryRun =false,//only check do you have corresponding step defination for the step
        tags = "@wip" //it executes which you select
)

public class CukesRunner {
}