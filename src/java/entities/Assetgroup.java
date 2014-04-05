/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Agape
 */
@Entity
@Table(name = "assetgroup")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Assetgroup.findAll", query = "SELECT a FROM Assetgroup a"),
    @NamedQuery(name = "Assetgroup.findByAssetID", query = "SELECT a FROM Assetgroup a WHERE a.assetgroupPK.assetID = :assetID"),
    @NamedQuery(name = "Assetgroup.findByGroupID", query = "SELECT a FROM Assetgroup a WHERE a.assetgroupPK.groupID = :groupID")})
public class Assetgroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AssetgroupPK assetgroupPK;

    public Assetgroup() {
    }

    public Assetgroup(AssetgroupPK assetgroupPK) {
        this.assetgroupPK = assetgroupPK;
    }

    public Assetgroup(int assetID, int groupID) {
        this.assetgroupPK = new AssetgroupPK(assetID, groupID);
    }

    public AssetgroupPK getAssetgroupPK() {
        return assetgroupPK;
    }

    public void setAssetgroupPK(AssetgroupPK assetgroupPK) {
        this.assetgroupPK = assetgroupPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (assetgroupPK != null ? assetgroupPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Assetgroup)) {
            return false;
        }
        Assetgroup other = (Assetgroup) object;
        if ((this.assetgroupPK == null && other.assetgroupPK != null) || (this.assetgroupPK != null && !this.assetgroupPK.equals(other.assetgroupPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Assetgroup[ assetgroupPK=" + assetgroupPK + " ]";
    }
    
}
