package validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FacesValidator("occupationValidator")
public class OccupationValidator implements Validator {

    private final static String[] occupation;

    static {
        occupation = new String[4];
        occupation[0] = "Sales";
        occupation[1] = "Warehouse";
        occupation[2] = "Customer Service";
        occupation[3] = "Manager";
    }

    //private final static String occupation = "Sales";

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object value) {
        /*Matcher matcher = Pattern.compile(occupation).matcher(value.toString());
        if (!matcher.matches()) {
            FacesMessage msg =
                    new FacesMessage("Occupation failed.",
                            "Invalid Occupation.");
            msg.setSeverity(FacesMessage.SEVERITY_INFO);
            throw new ValidatorException(msg);
        }*/
        Matcher matcher = Pattern.compile("Sales").matcher(value.toString());
        Matcher matcher2 = Pattern.compile("Warehouse").matcher(value.toString());
        Matcher matcher3 = Pattern.compile("Customer Service").matcher(value.toString());
        Matcher matcher4 = Pattern.compile("Manager").matcher(value.toString());
        if (!matcher.matches() && !matcher2.matches() && !matcher3.matches() && !matcher4.matches()) {
            FacesMessage msg =
                    new FacesMessage("Occupation failed. ",
                            "Invalid Occupation.");
            msg.setSeverity(FacesMessage.SEVERITY_INFO);
            throw new ValidatorException(msg);
        }
    }
}
