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
@Table(name = "assetlocation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Assetlocation.findAll", query = "SELECT a FROM Assetlocation a"),
    @NamedQuery(name = "Assetlocation.findByAssetID", query = "SELECT a FROM Assetlocation a WHERE a.assetlocationPK.assetID = :assetID"),
    @NamedQuery(name = "Assetlocation.findByLocationID", query = "SELECT a FROM Assetlocation a WHERE a.assetlocationPK.locationID = :locationID")})
public class Assetlocation implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AssetlocationPK assetlocationPK;

    public Assetlocation() {
    }

    public Assetlocation(AssetlocationPK assetlocationPK) {
        this.assetlocationPK = assetlocationPK;
    }

    public Assetlocation(int assetID, int locationID) {
        this.assetlocationPK = new AssetlocationPK(assetID, locationID);
    }

    public AssetlocationPK getAssetlocationPK() {
        return assetlocationPK;
    }

    public void setAssetlocationPK(AssetlocationPK assetlocationPK) {
        this.assetlocationPK = assetlocationPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (assetlocationPK != null ? assetlocationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Assetlocation)) {
            return false;
        }
        Assetlocation other = (Assetlocation) object;
        if ((this.assetlocationPK == null && other.assetlocationPK != null) || (this.assetlocationPK != null && !this.assetlocationPK.equals(other.assetlocationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Assetlocation[ assetlocationPK=" + assetlocationPK + " ]";
    }
    
}
