package org.vetech.lrms.core.hibernate.models;
// Generated Feb 10, 2015 12:59:31 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Role generated by hbm2java
 */
public class Role  implements java.io.Serializable {


     private int roleId;
     private String role;
     private String roleDescription;
     private Boolean active;
     private String uuid;
     private Set roleMapsForRoleTwo = new HashSet(0);
     private Set roleMapsForRoleOne = new HashSet(0);
     private Set roleMapsForRoleThree = new HashSet(0);

    public Role() {
    }

	
    public Role(int roleId, String role, String uuid) {
        this.roleId = roleId;
        this.role = role;
        this.uuid = uuid;
    }
    public Role(int roleId, String role, String roleDescription, Boolean active, String uuid, Set roleMapsForRoleTwo, Set roleMapsForRoleOne, Set roleMapsForRoleThree) {
       this.roleId = roleId;
       this.role = role;
       this.roleDescription = roleDescription;
       this.active = active;
       this.uuid = uuid;
       this.roleMapsForRoleTwo = roleMapsForRoleTwo;
       this.roleMapsForRoleOne = roleMapsForRoleOne;
       this.roleMapsForRoleThree = roleMapsForRoleThree;
    }
   
    public int getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
    public String getRole() {
        return this.role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    public String getRoleDescription() {
        return this.roleDescription;
    }
    
    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
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
    public Set getRoleMapsForRoleTwo() {
        return this.roleMapsForRoleTwo;
    }
    
    public void setRoleMapsForRoleTwo(Set roleMapsForRoleTwo) {
        this.roleMapsForRoleTwo = roleMapsForRoleTwo;
    }
    public Set getRoleMapsForRoleOne() {
        return this.roleMapsForRoleOne;
    }
    
    public void setRoleMapsForRoleOne(Set roleMapsForRoleOne) {
        this.roleMapsForRoleOne = roleMapsForRoleOne;
    }
    public Set getRoleMapsForRoleThree() {
        return this.roleMapsForRoleThree;
    }
    
    public void setRoleMapsForRoleThree(Set roleMapsForRoleThree) {
        this.roleMapsForRoleThree = roleMapsForRoleThree;
    }




}


