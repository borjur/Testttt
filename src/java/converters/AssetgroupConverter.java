package converters;

import entities.Assetgroup;
import controllers.AssetgroupFacade;
import beans.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "assetgroupConverter")
public class AssetgroupConverter implements Converter {

    @Inject
    private AssetgroupFacade ejbFacade;
    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    entities.AssetgroupPK getKey(String value) {
        entities.AssetgroupPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new entities.AssetgroupPK();
        key.setAssetID(Integer.parseInt(values[0]));
        key.setGroupID(Integer.parseInt(values[1]));
        return key;
    }

    String getStringKey(entities.AssetgroupPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getAssetID());
        sb.append(SEPARATOR);
        sb.append(value.getGroupID());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Assetgroup) {
            Assetgroup o = (Assetgroup) object;
            return getStringKey(o.getAssetgroupPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Assetgroup.class.getName()});
            return null;
        }
    }
}
