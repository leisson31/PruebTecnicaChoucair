package stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidarRegistro;
import tasks.AbrirLa;
import tasks.Registrar;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class stepdefinitions {


    // Metodo predefinido que prepara el escenario al actor
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    // Precondición de la feature traducida a cucumber
    @Dado("^leisson quiere registarse en la pagina Utest$")
    public void leisson_quiere_registarse_en_la_pagina_Utest() {
        //The Actor called, llama al actor
        // WasAbleto precondición de acción en tiempo pasado
        theActorCalled("Usuario").wasAbleTo(AbrirLa.pagina());
    }

    // Precondición de la feature traducida a cucumber
    @Cuando("^ingrese toda la informacion requerida$")
    public void ingrese_toda_la_informacion_requerida() {
        theActorInTheSpotlight().attemptsTo(Registrar.usuario());
    }

    // Precondición de la feature traducida a cucumber
    @Entonces("^se completa el registro de manera exitosa$")
    public void se_completa_el_registro_de_manera_exitosa() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarRegistro.exitoso()));
    }
}
