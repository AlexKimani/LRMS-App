package org.vetech.lrms.core.hibernate.models;
// Generated Feb 10, 2015 12:59:31 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Client generated by hbm2java
 */
public class Client  implements java.io.Serializable {


     private Integer clientId;
     private Person person;
     private int clientTypeId;
     private Integer createdBy;
     private Date createdOn;
     private Integer modifiedBy;
     private Date modifiedOn;
     private String uuid;
     private Set files = new HashSet(0);

    public Client() {
    }

	
    public Client(Person person, int clientTypeId, String uuid) {
        this.person = person;
        this.clientTypeId = clientTypeId;
        this.uuid = uuid;
    }
    public Client(Person person, int clientTypeId, Integer createdBy, Date createdOn, Integer modifiedBy, Date modifiedOn, String uuid, Set files) {
       this.person = person;
       this.clientTypeId = clientTypeId;
       this.createdBy = createdBy;
       this.createdOn = createdOn;
       this.modifiedBy = modifiedBy;
       this.modifiedOn = modifiedOn;
       this.uuid = uuid;
       this.files = files;
    }
   
    public Integer getClientId() {
        return this.clientId;
    }
    
    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }
    public Person getPerson() {
        return this.person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }
    public int getClientTypeId() {
        return this.clientTypeId;
    }
    
    public void setClientTypeId(int clientTypeId) {
        this.clientTypeId = clientTypeId;
    }
    public Integer getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }
    public Date getCreatedOn() {
        return this.createdOn;
    }
    
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
    public Integer getModifiedBy() {
        return this.modifiedBy;
    }
    
    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
    public Date getModifiedOn() {
        return this.modifiedOn;
    }
    
    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    public Set getFiles() {
        return this.files;
    }
    
    public void setFiles(Set files) {
        this.files = files;
    }




}


