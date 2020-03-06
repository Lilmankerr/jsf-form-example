import entity.User;
import service.impl.UserService;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class DataTableView implements Serializable {

    @Inject
    private UserService userService;


    public List<User> getUsers() {
        return userService.getNames();
    }
}
