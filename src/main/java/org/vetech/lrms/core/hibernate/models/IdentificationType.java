package org.vetech.lrms.core.hibernate.models;
// Generated Feb 10, 2015 12:59:31 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * IdentificationType generated by hbm2java
 */
public class IdentificationType  implements java.io.Serializable {


     private int typeId;
     private String typeName;
     private String typeCode;
     private Boolean active;
     private String uuid;
     private Set personAttributes = new HashSet(0);

    public IdentificationType() {
    }

	
    public IdentificationType(int typeId, String typeName, String typeCode, String uuid) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.typeCode = typeCode;
        this.uuid = uuid;
    }
    public IdentificationType(int typeId, String typeName, String typeCode, Boolean active, String uuid, Set personAttributes) {
       this.typeId = typeId;
       this.typeName = typeName;
       this.typeCode = typeCode;
       this.active = active;
       this.uuid = uuid;
       this.personAttributes = personAttributes;
    }
   
    public int getTypeId() {
        return this.typeId;
    }
    
    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
    public String getTypeName() {
        return this.typeName;
    }
    
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    public String getTypeCode() {
        return this.typeCode;
    }
    
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }
    public Boolean getActive() {
        return this.active;
    }
    
    public void setActive(Boolean active) {
        this.active = active;
    }
    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    public Set getPersonAttributes() {
        return this.personAttributes;
    }
    
    public void setPersonAttributes(Set personAttributes) {
        this.personAttributes = personAttributes;
    }




}


