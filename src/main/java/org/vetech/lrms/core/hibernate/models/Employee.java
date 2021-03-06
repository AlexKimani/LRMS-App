package org.vetech.lrms.core.hibernate.models;
// Generated Feb 10, 2015 12:59:31 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Employee generated by hbm2java
 */
public class Employee  implements java.io.Serializable {


     private Integer employeeId;
     private Person person;
     private Location location;
     private JobTitle jobTitle;
     private int jobTitleId;
     private Integer createdBy;
     private Date createdOn;
     private Integer modifiedBy;
     private Date modifiedOn;
     private String uuid;
     private Set fileLendingsForReceivedBy = new HashSet(0);
     private Set fileLendingsForLenderId = new HashSet(0);
     private Set branches = new HashSet(0);
     private Set salarieses = new HashSet(0);
     private Set transactionses = new HashSet(0);
     private Set schedulers = new HashSet(0);
     private Set visits = new HashSet(0);
     private Set empExpenditures = new HashSet(0);

    public Employee() {
    }

	
    public Employee(Person person, Location location, JobTitle jobTitle, int jobTitleId, String uuid) {
        this.person = person;
        this.location = location;
        this.jobTitle = jobTitle;
        this.jobTitleId = jobTitleId;
        this.uuid = uuid;
    }
    public Employee(Person person, Location location, JobTitle jobTitle, int jobTitleId, Integer createdBy, Date createdOn, Integer modifiedBy, Date modifiedOn, String uuid, Set fileLendingsForReceivedBy, Set fileLendingsForLenderId, Set branches, Set salarieses, Set transactionses, Set schedulers, Set visits, Set empExpenditures) {
       this.person = person;
       this.location = location;
       this.jobTitle = jobTitle;
       this.jobTitleId = jobTitleId;
       this.createdBy = createdBy;
       this.createdOn = createdOn;
       this.modifiedBy = modifiedBy;
       this.modifiedOn = modifiedOn;
       this.uuid = uuid;
       this.fileLendingsForReceivedBy = fileLendingsForReceivedBy;
       this.fileLendingsForLenderId = fileLendingsForLenderId;
       this.branches = branches;
       this.salarieses = salarieses;
       this.transactionses = transactionses;
       this.schedulers = schedulers;
       this.visits = visits;
       this.empExpenditures = empExpenditures;
    }
   
    public Integer getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    public Person getPerson() {
        return this.person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }
    public Location getLocation() {
        return this.location;
    }
    
    public void setLocation(Location location) {
        this.location = location;
    }
    public JobTitle getJobTitle() {
        return this.jobTitle;
    }
    
    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }
    public int getJobTitleId() {
        return this.jobTitleId;
    }
    
    public void setJobTitleId(int jobTitleId) {
        this.jobTitleId = jobTitleId;
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
    public Set getFileLendingsForReceivedBy() {
        return this.fileLendingsForReceivedBy;
    }
    
    public void setFileLendingsForReceivedBy(Set fileLendingsForReceivedBy) {
        this.fileLendingsForReceivedBy = fileLendingsForReceivedBy;
    }
    public Set getFileLendingsForLenderId() {
        return this.fileLendingsForLenderId;
    }
    
    public void setFileLendingsForLenderId(Set fileLendingsForLenderId) {
        this.fileLendingsForLenderId = fileLendingsForLenderId;
    }
    public Set getBranches() {
        return this.branches;
    }
    
    public void setBranches(Set branches) {
        this.branches = branches;
    }
    public Set getSalarieses() {
        return this.salarieses;
    }
    
    public void setSalarieses(Set salarieses) {
        this.salarieses = salarieses;
    }
    public Set getTransactionses() {
        return this.transactionses;
    }
    
    public void setTransactionses(Set transactionses) {
        this.transactionses = transactionses;
    }
    public Set getSchedulers() {
        return this.schedulers;
    }
    
    public void setSchedulers(Set schedulers) {
        this.schedulers = schedulers;
    }
    public Set getVisits() {
        return this.visits;
    }
    
    public void setVisits(Set visits) {
        this.visits = visits;
    }
    public Set getEmpExpenditures() {
        return this.empExpenditures;
    }
    
    public void setEmpExpenditures(Set empExpenditures) {
        this.empExpenditures = empExpenditures;
    }




}


