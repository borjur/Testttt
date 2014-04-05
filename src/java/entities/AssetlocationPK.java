/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Agape
 */
@Embeddable
public class AssetlocationPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "assetID")
    private int assetID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "locationID")
    private int locationID;

    public AssetlocationPK() {
    }

    public AssetlocationPK(int assetID, int locationID) {
        this.assetID = assetID;
        this.locationID = locationID;
    }

    public int getAssetID() {
        return assetID;
    }

    public void setAssetID(int assetID) {
        this.assetID = assetID;
    }

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) assetID;
        hash += (int) locationID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AssetlocationPK)) {
            return false;
        }
        AssetlocationPK other = (AssetlocationPK) object;
        if (this.assetID != other.assetID) {
            return false;
        }
        if (this.locationID != other.locationID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.AssetlocationPK[ assetID=" + assetID + ", locationID=" + locationID + " ]";
    }
    
}
