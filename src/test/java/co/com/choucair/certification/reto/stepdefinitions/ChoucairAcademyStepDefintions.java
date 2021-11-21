package co.com.choucair.certification.reto.stepdefinitions;

import co.com.choucair.certification.reto.task.OpenUp;
import co.com.choucair.certification.reto.task.Registro;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefintions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Luis quiere registrarse en el sitio Utest$")
    public void luisQuiereRegistrarseEnElSitioUtest() {
        OnStage.theActorCalled("Luis").wasAbleTo(OpenUp.thePage(), Registro.onThePage());

    }

    @When("^inicia el proceso de registro en Utest$")
    public void iniciaElProcesoDeRegistroEnUtest() {

    }

    @Then("^verifica el proceso final de registro$")
    public void verificaElProcesoFinalDeRegistro() {

    }

}
