package beans;

import entities.Assetgroup;
import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "assetgroupController")
@ViewScoped
public class AssetgroupController extends AbstractController<Assetgroup> implements Serializable {

    public AssetgroupController() {
        super(Assetgroup.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setAssetgroupPK(new entities.AssetgroupPK());
    }
}
