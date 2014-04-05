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
@Table(name = "ReportsView")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReportsView.findAll", query = "SELECT r FROM ReportsView r"),
    @NamedQuery(name = "ReportsView.findById", query = "SELECT r FROM ReportsView r WHERE r.id = :id"),
    @NamedQuery(name = "ReportsView.findByTag", query = "SELECT r FROM ReportsView r WHERE r.tag = :tag"),
    @NamedQuery(name = "ReportsView.findByAssetName", query = "SELECT r FROM ReportsView r WHERE r.assetName = :assetName"),
    @NamedQuery(name = "ReportsView.findByModel", query = "SELECT r FROM ReportsView r WHERE r.model = :model"),
    @NamedQuery(name = "ReportsView.findBySerNo", query = "SELECT r FROM ReportsView r WHERE r.serNo = :serNo"),
    @NamedQuery(name = "ReportsView.findByValue", query = "SELECT r FROM ReportsView r WHERE r.value = :value"),
    @NamedQuery(name = "ReportsView.findByAssetCondition", query = "SELECT r FROM ReportsView r WHERE r.assetCondition = :assetCondition"),
    @NamedQuery(name = "ReportsView.findByAssetType", query = "SELECT r FROM ReportsView r WHERE r.assetType = :assetType"),
    @NamedQuery(name = "ReportsView.findByName", query = "SELECT r FROM ReportsView r WHERE r.name = :name"),
    @NamedQuery(name = "ReportsView.findByAddress", query = "SELECT r FROM ReportsView r WHERE r.address = :address"),
    @NamedQuery(name = "ReportsView.findByCity", query = "SELECT r FROM ReportsView r WHERE r.city = :city"),
    @NamedQuery(name = "ReportsView.findByState", query = "SELECT r FROM ReportsView r WHERE r.state = :state"),
    @NamedQuery(name = "ReportsView.findByZip", query = "SELECT r FROM ReportsView r WHERE r.zip = :zip"),
    @NamedQuery(name = "ReportsView.findByPhone", query = "SELECT r FROM ReportsView r WHERE r.phone = :phone"),
    @NamedQuery(name = "ReportsView.findByDistrict", query = "SELECT r FROM ReportsView r WHERE r.district = :district")})
public class ReportsView implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    @Id
    private int id;
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
    @Size(min = 1, max = 30)
    @Column(name = "name")
    private String name;
    @Size(max = 50)
    @Column(name = "address")
    private String address;
    @Size(max = 50)
    @Column(name = "city")
    private String city;
    @Size(max = 20)
    @Column(name = "state")
    private String state;
    @Size(max = 10)
    @Column(name = "zip")
    private String zip;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 20)
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @NotNull
    @Column(name = "district")
    private int district;

    public ReportsView() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    
}
