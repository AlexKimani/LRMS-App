package org.vetech.lrms.core.hibernate.models;
// Generated Feb 10, 2015 12:59:31 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * MiscExp generated by hbm2java
 */
public class MiscExp  implements java.io.Serializable {


     private Integer miscId;
     private String miscName;
     private String description;
     private Integer amount;
     private Boolean status;
     private Integer approvedBy;
     private int createdBy;
     private Date createdOn;

    public MiscExp() {
    }

	
    public MiscExp(int createdBy) {
        this.createdBy = createdBy;
    }
    public MiscExp(String miscName, String description, Integer amount, Boolean status, Integer approvedBy, int createdBy, Date createdOn) {
       this.miscName = miscName;
       this.description = description;
       this.amount = amount;
       this.status = status;
       this.approvedBy = approvedBy;
       this.createdBy = createdBy;
       this.createdOn = createdOn;
    }
   
    public Integer getMiscId() {
        return this.miscId;
    }
    
    public void setMiscId(Integer miscId) {
        this.miscId = miscId;
    }
    public String getMiscName() {
        return this.miscName;
    }
    
    public void setMiscName(String miscName) {
        this.miscName = miscName;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getAmount() {
        return this.amount;
    }
    
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public Boolean getStatus() {
        return this.status;
    }
    
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public Integer getApprovedBy() {
        return this.approvedBy;
    }
    
    public void setApprovedBy(Integer approvedBy) {
        this.approvedBy = approvedBy;
    }
    public int getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }
    public Date getCreatedOn() {
        return this.createdOn;
    }
    
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }




}

