package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class QuintaPagina {


    //Elemento de validación de registro exitoso
    public static final Target LBLREGISTRO = Target.the("Label Registro exitoso").
            located(By.xpath("//b[contains(.,'First, please check your email inbox')]"));
}
