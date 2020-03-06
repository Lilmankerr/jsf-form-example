import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class HelloView implements Serializable {

    public String goToSpotlight() { return "/spotlight.xhtml?faces-redirect=true"; }

    public String goToDatatable() { return "/datatable.xhtml?faces-redirect=true"; }

}