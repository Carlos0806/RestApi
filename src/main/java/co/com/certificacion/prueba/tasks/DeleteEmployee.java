package co.com.certificacion.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Delete;

public class DeleteEmployee implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Delete.from("public/api/v1/delete/2"));


    }

    public static DeleteEmployee deleteEmployee(){
        return Tasks.instrumented(DeleteEmployee.class);
    }
}
