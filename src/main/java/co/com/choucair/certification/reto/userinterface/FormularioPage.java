package co.com.choucair.certification.reto.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FormularioPage extends PageObject{

    public static final Target INPUT_NAME =  Target.the("Donde escribimos el nombre del usuario")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME =  Target.the("Donde escribimos el apellido del usuario")
            .located(By.id("lastName"));
    public static final Target INPUT_CORREO =  Target.the("Donde escribimos el Correo del usuario")
            .located(By.id("email"));

    public static final Target  INPUT_LANGUAGE  =  Target.the("Donde escribimos el idioma del usuario")
            .located(By.xpath("//input[contains(@type, 'search')]"));
    public static final Target SELECT_LANGUAJE = Target.the("Clic idioma buscado")
            .located(By.xpath("//span[@class='ui-select-highlight']"));

    public static final Target  INPUT_MONTH  =  Target.the("Click en Mes")
            .located(By.xpath("//select[@id='birthMonth']"));
    public static final Target  SELECT_MONTH  =  Target.the("Selecciona Mes")
            .located(By.xpath("//option[@label='June']"));

    public static final Target  INPUT_DAY  =  Target.the("Click en el día de nacimiento")
            .located(By.xpath("//select[@id='birthDay']"));
    public static final Target  SELECT_DAY  =  Target.the("Selecciona Día")
            .located(By.xpath("//option[@label='5']"));

    public static final Target  INPUT_YEAR  =  Target.the("Click en el año de nacimiento")
            .located(By.xpath("//select[@id='birthYear']"));
    public static final Target  SELECT_YEAR  =  Target.the("Selecciona Año")
            .located(By.xpath("//option[@label='1997']"));


    public static final Target ENTER_BUTTON1 =  Target.the("boton confirmar login")
            .located(By.xpath("//span[normalize-space()='Next: Location']"));

/*
                //a[contains(@class, 'btn btn-blue')]

    public static final Target LOGIN_BUTTON = Target.the("Boton que nos muestra el formulario para iniciar sesion")
            .located(By.buttonText("Ingresar"));

*/
}
