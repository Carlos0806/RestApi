package co.com.certificacion.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class GetOneEmployee implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Get.resource("api/v1/employee/1"));

    }

    public static GetOneEmployee oneEmployee(){
        return Tasks.instrumented(GetOneEmployee.class);
    }
}
