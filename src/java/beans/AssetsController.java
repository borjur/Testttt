package beans;

import entities.Assets;
import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "assetsController")
@ViewScoped
public class AssetsController extends AbstractController<Assets> implements Serializable {

    public AssetsController() {
        super(Assets.class);
    }
}
