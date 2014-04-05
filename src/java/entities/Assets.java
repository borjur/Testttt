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
 * @author B
 */
@Entity
@Table(name = "assets")
@XmlRootElement
@NamedQueries({                           //EXEC GETALLASSETS
    @NamedQuery(name = "Assets.findAll", query = "SELECT a FROM Assets a"),
    @NamedQuery(name = "Assets.findById", query = "SELECT a FROM Assets a WHERE a.id = :id"),
    @NamedQuery(name = "Assets.findByLocationId", query = "SELECT a FROM Assets a WHERE a.locationId = :locationId"),
    @NamedQuery(name = "Assets.findByGroupId", query = "SELECT a FROM Assets a WHERE a.groupId = :groupId"),
    @NamedQuery(name = "Assets.findByCreated", query = "SELECT a FROM Assets a WHERE a.created = :created"),
    @NamedQuery(name = "Assets.findByModified", query = "SELECT a FROM Assets a WHERE a.modified = :modified"),
    @NamedQuery(name = "Assets.findByTag", query = "SELECT a FROM Assets a WHERE a.tag = :tag"),
    @NamedQuery(name = "Assets.findByAssetName", query = "SELECT a FROM Assets a WHERE a.assetName = :assetName"),
    @NamedQuery(name = "Assets.findByModel", query = "SELECT a FROM Assets a WHERE a.model = :model"),
    @NamedQuery(name = "Assets.findBySerNo", query = "SELECT a FROM Assets a WHERE a.serNo = :serNo"),
    @NamedQuery(name = "Assets.findByValue", query = "SELECT a FROM Assets a WHERE a.value = :value"),
    @NamedQuery(name = "Assets.findByAssetCondition", query = "SELECT a FROM Assets a WHERE a.assetCondition = :assetCondition"),
    @NamedQuery(name = "Assets.findByAssetType", query = "SELECT a FROM Assets a WHERE a.assetType = :assetType"),
    @NamedQuery(name = "Assets.findByStatus", query = "SELECT a FROM Assets a WHERE a.status = :status")})
public class Assets implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "location_id")
    private int locationId;
    @Column(name = "group_id")
    private Integer groupId;
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Column(name = "modified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modified;
    @Size(max = 50)
    @Column(name = "tag")
    private String tag;
    @Size(max = 50)
    @Column(name = "asset_name")
    private String assetName;
    @Size(max = 50)
    @Column(name = "model")
    private String model;
    @Size(max = 50)
    @Column(name = "ser_no")
    private String serNo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "value")
    private Float value;
    @Size(max = 50)
    @Column(name = "asset_condition")
    private String assetCondition;
    @Size(max = 50)
    @Column(name = "asset_type")
    private String assetType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private short status;

    public Assets() {
    }

    public Assets(Integer id) {
        this.id = id;
    }

    public Assets(Integer id, int locationId, short status) {
        this.id = id;
        this.locationId = locationId;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerNo() {
        return serNo;
    }

    public void setSerNo(String serNo) {
        this.serNo = serNo;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public String getAssetCondition() {
        return assetCondition;
    }

    public void setAssetCondition(String assetCondition) {
        this.assetCondition = assetCondition;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
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
        if (!(object instanceof Assets)) {
            return false;
        }
        Assets other = (Assets) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Assets[ id=" + id + " ]";
    }
    
}
