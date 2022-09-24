package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class TerceraPagina {

    public static final Target BTNNEXT = Target.the("Boton Next").
            located(By.xpath("//span[contains(.,'Next: Last Step')]"));


}
