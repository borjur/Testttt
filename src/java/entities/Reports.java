/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Agape
 */
@Entity
@Table(name = "Reports")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reports.findAll", query = "SELECT r FROM Reports r"),
    @NamedQuery(name = "Reports.findById", query = "SELECT r FROM Reports r WHERE r.id = :id"),
    @NamedQuery(name = "Reports.findByTag", query = "SELECT r FROM Reports r WHERE r.tag = :tag"),
    @NamedQuery(name = "Reports.findByName", query = "SELECT r FROM Reports r WHERE r.name = :name"),
    @NamedQuery(name = "Reports.findByModel", query = "SELECT r FROM Reports r WHERE r.model = :model"),
    @NamedQuery(name = "Reports.findBySerial", query = "SELECT r FROM Reports r WHERE r.serial = :serial"),
    @NamedQuery(name = "Reports.findByValue", query = "SELECT r FROM Reports r WHERE r.value = :value"),
    @NamedQuery(name = "Reports.findByCondtion", query = "SELECT r FROM Reports r WHERE r.condtion = :condtion"),
    @NamedQuery(name = "Reports.findByType", query = "SELECT r FROM Reports r WHERE r.type = :type"),
    @NamedQuery(name = "Reports.findByLocationName", query = "SELECT r FROM Reports r WHERE r.locationName = :locationName"),
    @NamedQuery(name = "Reports.findByAddress", query = "SELECT r FROM Reports r WHERE r.address = :address"),
    @NamedQuery(name = "Reports.findByCity", query = "SELECT r FROM Reports r WHERE r.city = :city"),
    @NamedQuery(name = "Reports.findByState", query = "SELECT r FROM Reports r WHERE r.state = :state"),
    @NamedQuery(name = "Reports.findByZip", query = "SELECT r FROM Reports r WHERE r.zip = :zip"),
    @NamedQuery(name = "Reports.findByPhone", query = "SELECT r FROM Reports r WHERE r.phone = :phone"),
    @NamedQuery(name = "Reports.findByDistrict", query = "SELECT r FROM Reports r WHERE r.district = :district")})
public class Reports implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "tag")
    private String tag;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "model")
    private String model;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "serial")
    private String serial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "value")
    private String value;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "condtion")
    private String condtion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "locationName")
    private String locationName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "zip")
    private String zip;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @NotNull
    @Column(name = "district")
    private int district;

    public Reports() {
    }

    public Reports(Integer id) {
        this.id = id;
    }

    public Reports(Integer id, String tag, String name, String model, String serial, String value, String condtion, String type, String locationName, String address, String city, String state, String zip, String phone, int district) {
        this.id = id;
        this.tag = tag;
        this.name = name;
        this.model = model;
        this.serial = serial;
        this.value = value;
        this.condtion = condtion;
        this.type = type;
        this.locationName = locationName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.district = district;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCondtion() {
        return condtion;
    }

    public void setCondtion(String condtion) {
        this.condtion = condtion;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
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
        if (!(object instanceof Reports)) {
            return false;
        }
        Reports other = (Reports) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Reports[ id=" + id + " ]";
    }
    
}
