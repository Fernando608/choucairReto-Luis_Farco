package co.com.choucair.certification.reto.task;

import co.com.choucair.certification.reto.userinterface.UtestRegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Registro implements Task {

    public static Registro onThePage() {
        return Tasks.instrumented(Registro.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Click.on(UtestRegistroPage.REGISTRO_BUTTON));
}

}