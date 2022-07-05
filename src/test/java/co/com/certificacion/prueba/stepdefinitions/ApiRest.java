package co.com.certificacion.prueba.stepdefinitions;


import co.com.certificacion.prueba.questions.ValidateCode;
import co.com.certificacion.prueba.tasks.CreateEmployee;
import co.com.certificacion.prueba.tasks.DeleteEmployee;
import co.com.certificacion.prueba.tasks.GetEmployees;
import co.com.certificacion.prueba.tasks.GetOneEmployee;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import io.cucumber.junit.Cucumber;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import net.serenitybdd.screenplay.rest.interactions.Delete;
import org.junit.runner.RunWith;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

@RunWith(Cucumber.class)

public class ApiRest {


    private static final String restApiUrl = "http://dummy.restapiexample.com/";
    Actor actor = Actor.named("admin").whoCan(CallAnApi.at(restApiUrl));

    @When("^I GET the result of the employee list$")
    public void i_get_the_result_of_the_employee_list() {

        actor.attemptsTo(GetEmployees.employee());


    }
    @Then("^the response has following response status success$")
    public void the_response_has_following_response_status_success() {


        actor.should(seeThat("the status code", ValidateCode.was(),equalTo(200)));



    }
    @When("^I GET the result one employee$")
    public void i_get_the_result_one_employee(){


        actor.attemptsTo(GetOneEmployee.oneEmployee());

    }

    @When("^I DELETE one employee$")
    public void i_delete_one_employee(){


        actor.attemptsTo(DeleteEmployee.deleteEmployee());

    }

    @When("^I Create one employee$")
    public void i_create_one_employee()  {


        actor.attemptsTo(CreateEmployee.createEmployee());

    }

    @Then("^the response has following response status success employee created$")
    public void the_response_has_following_response_status_success_employee_created()  {

        actor.should(seeThat("employee created, status code", ValidateCode.was(),equalTo(200)));

    }

}
