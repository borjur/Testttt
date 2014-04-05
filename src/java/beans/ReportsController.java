package beans;

import entities.Reports;
import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "reportsController")
@ViewScoped
public class ReportsController extends AbstractController<Reports> implements Serializable {

    public ReportsController() {
        super(Reports.class);
    }
}
