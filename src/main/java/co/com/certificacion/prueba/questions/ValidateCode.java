package co.com.certificacion.prueba.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateCode implements Question {

    public static Question<Integer> was(){

        return new ValidateCode();
    }


    @Override
    public Object answeredBy(Actor actor) {
        return SerenityRest.lastResponse().getStatusCode();
    }
}
