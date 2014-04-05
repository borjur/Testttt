package beans;

import entities.Users;
import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "usersController")
@ViewScoped
public class UsersController extends AbstractController<Users> implements Serializable {

    public UsersController() {
        super(Users.class);
    }
}
