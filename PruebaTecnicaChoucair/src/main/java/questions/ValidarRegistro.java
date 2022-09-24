package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.FailedConsequence;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.QuintaPagina;

public class ValidarRegistro implements Question<Boolean> {

    // Se crea variable para compara con el texto de la pagina cuando se realice un registro exitoso
    String texto = "First, please check your email inbox";


    public static ValidarRegistro exitoso() {
        return new ValidarRegistro();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

         //Extraemos el texto de la pagina con el registro exitoso
        String textoPagina = Text.of(QuintaPagina.LBLREGISTRO).viewedBy(actor).asString();
        Boolean resultado = false;


        // Condicional donde se compara el texto quemado con el texto de la pagina

        // SI texto y texto pagina son iguales variable bool es verdadero
        if (textoPagina.equals(texto)){
            resultado = true;
        }
        //Retornamos la variable bool con el resultado del condicional
        return resultado;


        //en caso tal no encuentre el texto de la pagina mandará error
    }
}
