package co.com.certificacion.prueba.tasks;

import io.restassured.specification.RequestSpecification;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class CreateEmployee implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to("api/v1/create").with(request -> request.header("Content-Type", "application/json").body("{\"name\": \"test\",\"salary\": \"123\",\"age\": \"23\"}")));
    }


    public static CreateEmployee createEmployee(){
        return Tasks.instrumented(CreateEmployee.class);
    }
}
