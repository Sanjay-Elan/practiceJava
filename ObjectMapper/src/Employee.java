package EmployeePackage;
public class Employee {
    private String FirstName;
    private String LastName;
    private Integer empID;
    private String Designation;
    private String[] Address;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = FirstName;
    }
    public String getLastName() {
        return LastName;
    }

    public void setLastName(String firstName) {
        this.LastName = LastName;
    }

    public Integer getEmpID() {
        return empID;
    }

    public void setEmpID(Integer empID) {
        this.empID = empID;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public String[] getAddress() {
        return Address;
    }

    public void setAddress(String[] address) {
        this.Address = address;
    }

    @Override
    public String toString() {
        return "Employee[First Name= "+FirstName+ ", Last Name= "+LastName+ ", Employee ID= "+empID+ ", Designation= " +Designation+ ", Address= " +Address+"]";
    }
}