package co.com.choucair.certification.reto.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestRegistroPage extends PageObject {
    public static final Target REGISTRO_BUTTON = Target.the("boton que nos muestra el formulario para iniciar sesion")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
