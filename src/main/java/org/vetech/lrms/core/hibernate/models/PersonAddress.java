package org.vetech.lrms.core.hibernate.models;
// Generated Feb 10, 2015 12:59:31 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * PersonAddress generated by hbm2java
 */
public class PersonAddress  implements java.io.Serializable {


     private Integer personAddressId;
     private Person person;
     private String postalAddress;
     private Integer postalCode;
     private Integer postalLocationId;
     private Integer clientLocationId;
     private String country;
     private String state;
     private String district;
     private String location;
     private String sublocation;
     private String estate;
     private Integer createdBy;
     private Date createdOn;
     private Integer modifiedBy;
     private Date modifiedOn;
     private String uuid;

    public PersonAddress() {
    }

	
    public PersonAddress(Person person, String uuid) {
        this.person = person;
        this.uuid = uuid;
    }
    public PersonAddress(Person person, String postalAddress, Integer postalCode, Integer postalLocationId, Integer clientLocationId, String country, String state, String district, String location, String sublocation, String estate, Integer createdBy, Date createdOn, Integer modifiedBy, Date modifiedOn, String uuid) {
       this.person = person;
       this.postalAddress = postalAddress;
       this.postalCode = postalCode;
       this.postalLocationId = postalLocationId;
       this.clientLocationId = clientLocationId;
       this.country = country;
       this.state = state;
       this.district = district;
       this.location = location;
       this.sublocation = sublocation;
       this.estate = estate;
       this.createdBy = createdBy;
       this.createdOn = createdOn;
       this.modifiedBy = modifiedBy;
       this.modifiedOn = modifiedOn;
       this.uuid = uuid;
    }
   
    public Integer getPersonAddressId() {
        return this.personAddressId;
    }
    
    public void setPersonAddressId(Integer personAddressId) {
        this.personAddressId = personAddressId;
    }
    public Person getPerson() {
        return this.person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }
    public String getPostalAddress() {
        return this.postalAddress;
    }
    
    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }
    public Integer getPostalCode() {
        return this.postalCode;
    }
    
    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }
    public Integer getPostalLocationId() {
        return this.postalLocationId;
    }
    
    public void setPostalLocationId(Integer postalLocationId) {
        this.postalLocationId = postalLocationId;
    }
    public Integer getClientLocationId() {
        return this.clientLocationId;
    }
    
    public void setClientLocationId(Integer clientLocationId) {
        this.clientLocationId = clientLocationId;
    }
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    public String getDistrict() {
        return this.district;
    }
    
    public void setDistrict(String district) {
        this.district = district;
    }
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    public String getSublocation() {
        return this.sublocation;
    }
    
    public void setSublocation(String sublocation) {
        this.sublocation = sublocation;
    }
    public String getEstate() {
        return this.estate;
    }
    
    public void setEstate(String estate) {
        this.estate = estate;
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




}


