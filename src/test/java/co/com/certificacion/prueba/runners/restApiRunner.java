package co.com.certificacion.prueba.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "co.com.certificacion.prueba.stepdefinitions",
        tags = "@create"

        )

public class restApiRunner {

}
