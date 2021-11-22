package co.com.choucair.certification.reto.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FormularioPage extends PageObject{

    public static final Target ENTER_NAME =  Target.the("Donde escribimos el nombre del usuario")
            .located(By.id("firstName"));
    public static final Target ENTER_LASTNAME =  Target.the("Donde escribimos el apellido del usuario")
            .located(By.id("lastName"));
    public static final Target ENTER_CORREO =  Target.the("Donde escribimos el Correo del usuario")
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


    public static final Target ENTER_PASSWORD =  Target.the("Escribimos la Clave del usuario")
            .located(By.id("password"));
    public static final Target ENTER_CONFIRM_PASSWORD =  Target.the("Escribimos nuevamente la Clave del usuario")
            .located(By.id("confirmPassword"));

    public static final Target INPUT_NEWS =  Target.the("Suscribe al usuario a recibir E-mails")
            .located(By.cssSelector("div:nth-child(4) label:nth-child(1)"));
    public static final Target INPUT_TERM_COND =  Target.the("Acepta terminos")
            .located(By.xpath("//*[@id=\"termOfUse\"]"));
    public static final Target INPUT_PRIVACY =  Target.the("Acepta Privacidad")
            .located(By.xpath("//*[@id=\"privacySetting\"]"));

    public static final Target NAME_WELCOME = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//span[normalize-space()='Complete Setup']"));


    public static final Target ENTER_BUTTON =  Target.the("boton confirmar login")
            .located(By.xpath(" //a[contains(@class, 'btn btn-blue')]"));

}
