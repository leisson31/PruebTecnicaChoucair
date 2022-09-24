package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PrimeraPagina {
    public static final Target TXTNOMBRE = Target.the("Caja de texto nombre").
            located(By.id("firstName"));
    public static final Target TXTAPELLIDO = Target.the("Caja de texto apellido").
            located(By.id("lastName"));
    public static final Target TXTCORREO = Target.the("Caja de texto Correo electronico").
            located(By.id("email"));
    public static final Target TXTDIANACIMIENTO = Target.the("Caja de texto dia nacimiento").
            located(By.id("birthDay"));
    public static final Target TXTMESNACIMIENTO = Target.the("Caja de texto mes nacimiento").
            located(By.id("birthMonth"));
    public static final Target TXTANIONACIMIENTO = Target.the("Caja de texto anio nacimiento").
            located(By.id("birthYear"));
    public static final Target BTNNEXT = Target.the("Boton Next").
            located(By.xpath("//span[contains(.,'Next: Location')]"));

}
