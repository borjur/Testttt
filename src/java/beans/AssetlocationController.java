package beans;

import entities.Assetlocation;
import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "assetlocationController")
@ViewScoped
public class AssetlocationController extends AbstractController<Assetlocation> implements Serializable {

    public AssetlocationController() {
        super(Assetlocation.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setAssetlocationPK(new entities.AssetlocationPK());
    }
}
