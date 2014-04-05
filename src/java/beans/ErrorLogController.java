package beans;

import entities.ErrorLog;
import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "errorLogController")
@ViewScoped
public class ErrorLogController extends AbstractController<ErrorLog> implements Serializable {

    public ErrorLogController() {
        super(ErrorLog.class);
    }
}
