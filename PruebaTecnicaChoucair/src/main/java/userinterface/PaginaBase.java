package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;



//Llama la url del ambiente
@DefaultUrl("https://utest.com/")
/**
 * Clase para abrir el
 * navegador con la URL base
 * */
public class PaginaBase extends PageObject {
/**
 * Elementos de la pagina principal
 */
public static final Target JOINTODAY = Target.the("Boton Join Today").
        located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up'][contains(.,'Join Today')]"));
}
