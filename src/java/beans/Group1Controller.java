package beans;

import entities.Group1;
import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "group1Controller")
@ViewScoped
public class Group1Controller extends AbstractController<Group1> implements Serializable {

    public Group1Controller() {
        super(Group1.class);
    }
}
