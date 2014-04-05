package beans;

import entities.AssetGroups;
import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "assetGroupsController")
@ViewScoped
public class AssetGroupsController extends AbstractController<AssetGroups> implements Serializable {

    public AssetGroupsController() {
        super(AssetGroups.class);
    }
}
