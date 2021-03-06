package org.vetech.lrms.core.hibernate.models;
// Generated Feb 10, 2015 12:59:31 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * CaseClasses generated by hbm2java
 */
public class CaseClasses  implements java.io.Serializable {


     private String caseCode;
     private String caseName;
     private String description;
     private Boolean active;
     private Boolean ifRoot;
     private String uuid;
     private int caseId;
     private Set files = new HashSet(0);
     private Set caseMapsForParentId = new HashSet(0);
     private Set caseMapsForChildId = new HashSet(0);

    public CaseClasses() {
    }

	
    public CaseClasses(String caseCode, String caseName, String uuid, int caseId) {
        this.caseCode = caseCode;
        this.caseName = caseName;
        this.uuid = uuid;
        this.caseId = caseId;
    }
    public CaseClasses(String caseCode, String caseName, String description, Boolean active, Boolean ifRoot, String uuid, int caseId, Set files, Set caseMapsForParentId, Set caseMapsForChildId) {
       this.caseCode = caseCode;
       this.caseName = caseName;
       this.description = description;
       this.active = active;
       this.ifRoot = ifRoot;
       this.uuid = uuid;
       this.caseId = caseId;
       this.files = files;
       this.caseMapsForParentId = caseMapsForParentId;
       this.caseMapsForChildId = caseMapsForChildId;
    }
   
    public String getCaseCode() {
        return this.caseCode;
    }
    
    public void setCaseCode(String caseCode) {
        this.caseCode = caseCode;
    }
    public String getCaseName() {
        return this.caseName;
    }
    
    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Boolean getActive() {
        return this.active;
    }
    
    public void setActive(Boolean active) {
        this.active = active;
    }
    public Boolean getIfRoot() {
        return this.ifRoot;
    }
    
    public void setIfRoot(Boolean ifRoot) {
        this.ifRoot = ifRoot;
    }
    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    public int getCaseId() {
        return this.caseId;
    }
    
    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }
    public Set getFiles() {
        return this.files;
    }
    
    public void setFiles(Set files) {
        this.files = files;
    }
    public Set getCaseMapsForParentId() {
        return this.caseMapsForParentId;
    }
    
    public void setCaseMapsForParentId(Set caseMapsForParentId) {
        this.caseMapsForParentId = caseMapsForParentId;
    }
    public Set getCaseMapsForChildId() {
        return this.caseMapsForChildId;
    }
    
    public void setCaseMapsForChildId(Set caseMapsForChildId) {
        this.caseMapsForChildId = caseMapsForChildId;
    }




}


