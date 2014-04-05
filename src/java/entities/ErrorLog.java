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
@Table(name = "error_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ErrorLog.findAll", query = "SELECT e FROM ErrorLog e"),
    @NamedQuery(name = "ErrorLog.findById", query = "SELECT e FROM ErrorLog e WHERE e.id = :id"),
    @NamedQuery(name = "ErrorLog.findByCreated", query = "SELECT e FROM ErrorLog e WHERE e.created = :created"),
    @NamedQuery(name = "ErrorLog.findByClass1", query = "SELECT e FROM ErrorLog e WHERE e.class1 = :class1"),
    @NamedQuery(name = "ErrorLog.findByMethod", query = "SELECT e FROM ErrorLog e WHERE e.method = :method"),
    @NamedQuery(name = "ErrorLog.findByDescription", query = "SELECT e FROM ErrorLog e WHERE e.description = :description")})
public class ErrorLog implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Size(max = 20)
    @Column(name = "class")
    private String class1;
    @Size(max = 20)
    @Column(name = "method")
    private String method;
    @Size(max = 255)
    @Column(name = "description")
    private String description;

    public ErrorLog() {
    }

    public ErrorLog(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        if (!(object instanceof ErrorLog)) {
            return false;
        }
        ErrorLog other = (ErrorLog) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ErrorLog[ id=" + id + " ]";
    }
    
}
