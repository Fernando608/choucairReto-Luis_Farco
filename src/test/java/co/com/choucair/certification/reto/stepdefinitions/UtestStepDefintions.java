package co.com.choucair.certification.reto.stepdefinitions;

import co.com.choucair.certification.reto.model.UtestData;
import co.com.choucair.certification.reto.task.Formulario;
import co.com.choucair.certification.reto.task.OpenUp;
import co.com.choucair.certification.reto.task.Registro;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class UtestStepDefintions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Luis quiere registrarse en el sitio Utest$")
    public void luisQuiereRegistrarseEnElSitioUtest() {
        OnStage.theActorCalled("Luis").wasAbleTo(OpenUp.thePage(), Registro.onThePage());

    }

    @When("^inicia el proceso de registro en Utest$")
    public void iniciaElProcesoDeRegistroEnUtest(List<UtestData> utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Formulario.the(utestData.get(0).getStrNombre(),utestData.get(0).getStrApellido(),
                utestData.get(0).getStrCorreo(),utestData.get(0).getStrIdioma(), utestData.get(0).getStrMes(),utestData.get(0).getStrDia(),
                utestData.get(0).getStrAno()));
    }

    @Then("^verifica el proceso final de registro$")
    public void verificaElProcesoFinalDeRegistro() {

    }

}
