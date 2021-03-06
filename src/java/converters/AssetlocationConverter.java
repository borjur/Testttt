package converters;

import entities.Assetlocation;
import controllers.AssetlocationFacade;
import beans.util.JsfUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "assetlocationConverter")
public class AssetlocationConverter implements Converter {

    @Inject
    private AssetlocationFacade ejbFacade;
    private static final String SEPARATOR = "#";
    private static final String SEPARATOR_ESCAPED = "\\#";

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
        if (value == null || value.length() == 0 || JsfUtil.isDummySelectItem(component, value)) {
            return null;
        }
        return this.ejbFacade.find(getKey(value));
    }

    entities.AssetlocationPK getKey(String value) {
        entities.AssetlocationPK key;
        String values[] = value.split(SEPARATOR_ESCAPED);
        key = new entities.AssetlocationPK();
        key.setAssetID(Integer.parseInt(values[0]));
        key.setLocationID(Integer.parseInt(values[1]));
        return key;
    }

    String getStringKey(entities.AssetlocationPK value) {
        StringBuffer sb = new StringBuffer();
        sb.append(value.getAssetID());
        sb.append(SEPARATOR);
        sb.append(value.getLocationID());
        return sb.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
        if (object == null
                || (object instanceof String && ((String) object).length() == 0)) {
            return null;
        }
        if (object instanceof Assetlocation) {
            Assetlocation o = (Assetlocation) object;
            return getStringKey(o.getAssetlocationPK());
        } else {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Assetlocation.class.getName()});
            return null;
        }
    }
}
