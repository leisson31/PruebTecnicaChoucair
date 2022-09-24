package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.*;

public class Registrar implements Task {

    public static Registrar usuario() {
        return Tasks.instrumented(Registrar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        //Se definen las acciones para el actor
        actor.attemptsTo(Click.on(PaginaBase.JOINTODAY),
                Enter.theValue("Leisson").into(PrimeraPagina.TXTNOMBRE),
                Enter.theValue("Gracia").into(PrimeraPagina.TXTAPELLIDO),
                Enter.theValue("leissongracia3@gmail.com").into(PrimeraPagina.TXTCORREO),
                SelectFromOptions.byVisibleText("January").from(PrimeraPagina.TXTMESNACIMIENTO),
                SelectFromOptions.byVisibleText("12").from(PrimeraPagina.TXTDIANACIMIENTO),
                SelectFromOptions.byVisibleText("1996").from(PrimeraPagina.TXTANIONACIMIENTO),
                Click.on(PrimeraPagina.BTNNEXT)
        );


        //Metodo de espera explicita para detener la automatización
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        actor.attemptsTo(Click.on(SegundoPagina.BTNNEXT));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(Click.on(TerceraPagina.BTNNEXT));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(Enter.theValue("Leison123*").into(CuartaPagina.TXTPASSWORD),
                Enter.theValue("Leison123*").into(CuartaPagina.TXTCONFIRMPASS),
                Click.on(CuartaPagina.CHECKPYS),
                Click.on(CuartaPagina.CHECKTYC),
                Click.on(CuartaPagina.BTNNEXT)
        );

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
