package co.com.choucair.certification.reto.task;


import co.com.choucair.certification.reto.userinterface.FormularioPage;
import net.serenitybdd.screenplay.Actor;
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
    private String strClave;

    public Formulario(String strNombre, String strApellido, String strCorreo, String strIdioma, String strMes, String strDia, String strAno, String strClave){
        this.strNombre =strNombre;
        this.strApellido =strApellido;
        this.strCorreo =strCorreo;
        this.strIdioma =strIdioma;
        this.strMes =strMes;
        this.strDia =strDia;
        this.strAno =strAno;
        this.strClave =strClave;
    }

    public static Formulario the(String strNombre, String strApellido, String strCorreo, String strIdioma, String strMes, String strDia, String strAno, String strClave) {
        return Tasks.instrumented(Formulario.class, strNombre,strApellido,strCorreo,strIdioma,strMes,strDia,strAno,strClave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String Mes = Text.of(FormularioPage.SELECT_MONTH).viewedBy(actor).asString();
        String Dia = Text.of(FormularioPage.SELECT_DAY).viewedBy(actor).asString();


        actor.attemptsTo(Enter.theValue(strNombre).into(FormularioPage.ENTER_NAME),
                Enter.theValue(strApellido).into(FormularioPage.ENTER_LASTNAME),
                Enter.theValue(strCorreo).into(FormularioPage.ENTER_CORREO),
                Enter.theValue(strIdioma).into(FormularioPage.INPUT_LANGUAGE),
                Click.on(FormularioPage.SELECT_LANGUAJE),
                Click.on(FormularioPage.INPUT_MONTH),
                Click.on(FormularioPage.SELECT_MONTH),
                Click.on(FormularioPage.INPUT_DAY),
                Click.on(FormularioPage.SELECT_DAY),
                Click.on(FormularioPage.INPUT_YEAR),
                Click.on(FormularioPage.SELECT_YEAR)
        );

        if((strMes.equals(Mes)) && (strDia.equals(Dia))){
            actor.attemptsTo(Click.on(FormularioPage.ENTER_BUTTON));

            for(int i=0;i<2;i++){
                try {
                    Thread.sleep(5000);
                    actor.attemptsTo(Click.on(FormularioPage.ENTER_BUTTON));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        actor.attemptsTo(Enter.theValue(strClave).into(FormularioPage.ENTER_PASSWORD),
                Enter.theValue(strClave).into(FormularioPage.ENTER_CONFIRM_PASSWORD),
                Click.on(FormularioPage.INPUT_NEWS),
                Click.on(FormularioPage.INPUT_TERM_COND),
                Click.on(FormularioPage.INPUT_PRIVACY)
        );



    }


}

