import co.com.certificacion.prueba.questions.ValidateCode;
import co.com.certificacion.prueba.tasks.CreateEmployee;
import co.com.certificacion.prueba.tasks.DeleteEmployee;
import co.com.certificacion.prueba.tasks.GetEmployees;
import co.com.certificacion.prueba.tasks.GetOneEmployee;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.CoreMatchers.*;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SerenityRunner.class)
public class TestRun {

    private static final String restApiUrl = "http://dummy.restapiexample.com/";


    @Test
    public void obtenerEmpleado(){


        Actor actor = Actor.named("admin").whoCan(CallAnApi.at(restApiUrl));

        actor.attemptsTo(CreateEmployee.createEmployee());

        actor.should(seeThat("the status code!!!!", ValidateCode.was(),equalTo(200)));
    }


}
