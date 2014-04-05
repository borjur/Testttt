package beans;

import entities.District;
import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "districtController")
@ViewScoped
public class DistrictController extends AbstractController<District> implements Serializable {

    public DistrictController() {
        super(District.class);
    }
}
