package co.com.choucair.certification.reto.task;


import co.com.choucair.certification.reto.userinterface.FormularioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

public class Formulario implements Task {
    private String strNombre;
    private String strApellido;
    private String strCorreo;
    private String strIdioma;
    private String strDia;
    private String strMes;
    private String strAno;

    public Formulario(String strNombre, String strApellido, String strCorreo, String strIdioma, String strMes, String strDia, String strAno){
        this.strNombre =strNombre;
        this.strApellido =strApellido;
        this.strCorreo =strCorreo;
        this.strIdioma =strIdioma;
        this.strMes =strMes;
        this.strDia =strDia;
        this.strAno =strAno;
    }

    public static Formulario the(String strNombre, String strApellido, String strCorreo, String strIdioma, String strMes, String strDia, String strAno) {
        return Tasks.instrumented(Formulario.class, strNombre,strApellido,strCorreo,strIdioma,strMes,strDia,strAno);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       // boolean resultMes;
        System.out.println("Local "+strMes);

        String Mes = Text.of(FormularioPage.SELECT_MONTH).viewedBy(actor).asString();
        String Dia = Text.of(FormularioPage.SELECT_DAY).viewedBy(actor).asString();

        System.out.println(""+Dia);
        System.out.println(""+Mes);

        actor.attemptsTo(Enter.theValue(strNombre).into(FormularioPage.INPUT_NAME),
                Enter.theValue(strApellido).into(FormularioPage.INPUT_LASTNAME),
                Enter.theValue(strCorreo).into(FormularioPage.INPUT_CORREO),
                Enter.theValue(strIdioma).into(FormularioPage.INPUT_LANGUAGE),
                Click.on(FormularioPage.SELECT_LANGUAJE),
                Click.on(FormularioPage.INPUT_MONTH),
                Click.on(FormularioPage.SELECT_MONTH),
                Click.on(FormularioPage.INPUT_DAY),
                Click.on(FormularioPage.SELECT_DAY),
                Click.on(FormularioPage.INPUT_YEAR),
                Click.on(FormularioPage.SELECT_YEAR),
                Click.on(FormularioPage.ENTER_BUTTON1)
        );
    }
}
