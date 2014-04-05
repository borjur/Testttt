package beans;

import entities.Location;
import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "locationController")
@ViewScoped
public class LocationController extends AbstractController<Location> implements Serializable {

    public LocationController() {
        super(Location.class);
    }
}
