package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CuartaPagina {

    public static final Target TXTPASSWORD = Target.the("Caja de password").
            located(By.id("password"));
    public static final Target TXTCONFIRMPASS = Target.the("Caja de texto confirmar pass").
            located(By.id("confirmPassword"));
    public static final Target CHECKTYC = Target.the("Check terminos y condiciones").
            located(By.xpath("//span[contains(@ng-class,'{error: userForm.termOfUse.$error.required}')]"));
    public static final Target CHECKPYS = Target.the("Check privacidad y seguridad").
            located(By.xpath("//span[contains(@ng-class,'{error: userForm.privacySetting.$error.required}')]"));
    public static final Target BTNNEXT = Target.the("Boton Next").
            located(By.id("laddaBtn"));
}
