public class Employees {
    private String firstName;
    private String lastName;
    private int employeeId;
    private String department;
    private double dateHired;
    private int salaryLevel;
    private String jobTitle;
    private boolean needsAccommodation;

    public Employees(String firstName, String lastName, int employeeId, String department, double dateHired, int salaryLevel, String jobTitle, boolean needsAccommodation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.department = department;
        this.dateHired = dateHired;
        this.salaryLevel = salaryLevel;
        this.jobTitle = jobTitle;
        this.needsAccommodation = needsAccommodation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getDateHired() {
        return dateHired;
    }

    public void setDateHired(double dateHired) {
        this.dateHired = dateHired;
    }

    public int getSalaryLevel() {
        return salaryLevel;
    }

    public void setSalaryLevel(int salaryLevel) {
        this.salaryLevel = salaryLevel;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public boolean isNeedsAccommodation() {
        return needsAccommodation;
    }

    public void setNeedsAccommodation(boolean needsAccommodation) {
        this.needsAccommodation = needsAccommodation;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeId=" + employeeId +
                ", department='" + department + '\'' +
                ", dateHired=" + dateHired +
                ", salaryLevel=" + salaryLevel +
                ", jobTitle='" + jobTitle + '\'' +
                ", needsAccommodation=" + needsAccommodation +
                '}';
    }
}