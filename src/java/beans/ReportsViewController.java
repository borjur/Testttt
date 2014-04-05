package beans;

import entities.ReportsView;
import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "reportsViewController")
@ViewScoped
public class ReportsViewController extends AbstractController<ReportsView> implements Serializable {

    public ReportsViewController() {
        super(ReportsView.class);
    }
}
