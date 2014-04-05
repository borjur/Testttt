/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Agape
 */
@Entity
@Table(name = "asset_groups")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AssetGroups.findAll", query = "SELECT a FROM AssetGroups a"),
    @NamedQuery(name = "AssetGroups.findById", query = "SELECT a FROM AssetGroups a WHERE a.id = :id"),
    @NamedQuery(name = "AssetGroups.findByAssetId", query = "SELECT a FROM AssetGroups a WHERE a.assetId = :assetId"),
    @NamedQuery(name = "AssetGroups.findByCreated", query = "SELECT a FROM AssetGroups a WHERE a.created = :created"),
    @NamedQuery(name = "AssetGroups.findByName", query = "SELECT a FROM AssetGroups a WHERE a.name = :name"),
    @NamedQuery(name = "AssetGroups.findByStatus", query = "SELECT a FROM AssetGroups a WHERE a.status = :status")})
public class AssetGroups implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "asset_id")
    private int assetId;
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Size(max = 50)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private short status;

    public AssetGroups() {
    }

    public AssetGroups(Integer id) {
        this.id = id;
    }

    public AssetGroups(Integer id, int assetId, short status) {
        this.id = id;
        this.assetId = assetId;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AssetGroups)) {
            return false;
        }
        AssetGroups other = (AssetGroups) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.AssetGroups[ id=" + id + " ]";
    }
    
}
