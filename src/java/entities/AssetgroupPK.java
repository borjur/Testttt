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
public class AssetgroupPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "assetID")
    private int assetID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "groupID")
    private int groupID;

    public AssetgroupPK() {
    }

    public AssetgroupPK(int assetID, int groupID) {
        this.assetID = assetID;
        this.groupID = groupID;
    }

    public int getAssetID() {
        return assetID;
    }

    public void setAssetID(int assetID) {
        this.assetID = assetID;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) assetID;
        hash += (int) groupID;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AssetgroupPK)) {
            return false;
        }
        AssetgroupPK other = (AssetgroupPK) object;
        if (this.assetID != other.assetID) {
            return false;
        }
        if (this.groupID != other.groupID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.AssetgroupPK[ assetID=" + assetID + ", groupID=" + groupID + " ]";
    }
    
}
