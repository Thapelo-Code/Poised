// We create a class called project.
public class Project {

    /* Attributes
       We create the attributes as private.
       Making them accessible within the declared class.
       The attributes are int projectNumber, String projectName,
       String buildingType, String building Address, int erfNumber,
       int projectFee, int totalAmountPaid, String projectDeadline.
     */
    private int projectNumber;
    private String projectName;
    private String buildingType;
    private String buildingAddress;
    private int erfNumber;
    private int projectFee;
    private int totalAmountPaid;
    private String projectDeadline;

    /* Constructor
       The constructor method will pass in parameters
       int projectNumber, String projectName,
       String buildingType, String buildingAddress,
       int erfNumber, int projectFee, int totalAmountPaid,
       String projectDeadline.
       We then use this keyword.
       To invoke the current class constructor.
     */
    public Project(int projectNumber, String projectName, String buildingType, String buildingAddress, int erfNumber, int projectFee, int totalAmountPaid, String projectDeadline){

        this.setProjectNumber(projectNumber);
        this.setProjectName(projectName);
        this.setBuildingType(buildingType);
        this.setBuildingAddress(buildingAddress);
        this.setErfNumber(erfNumber);
        this.setProjectFee(projectFee);
        this.setTotalAmountPaid(totalAmountPaid);
        this.setProjectDeadline(projectDeadline);

    }
    /* Methods
       We create a method for all our Attributes.
       We create our getters and setters.
       We first get the projectNumber set to int.
       Then return the projectNumber.
     */
    public int getProjectNumber() {
        return projectNumber;
    }

    /* We set public method.
       Which will be visible from classes in our packages.
       We then setProjectNumber
       The return type is void.
     */
    public void setProjectNumber(int projectNumber) {
        this.projectNumber = projectNumber;
    }
    /*  We first get the ProjectName set to String.
        Then return the ProjectName.
    */
    public String getProjectName() {
        return projectName;
    }
    /*  We then setProjectName
        The return type is void.
    */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    /*  We first get the BuildingType set to String.
        Then return the BuildingType.
    */
    public String getBuildingType() {
        return buildingType;
    }
    /*  We then setBuildingType
        The return type is void.
    */
    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }
    /*  We first get the BuildingType set to String.
        Then return the BuildingType.
    */
    public String getBuildingAddress() {
        return buildingAddress;
    }
    /*  We then setBuildingAddress
        The return type is void.
    */
    public void setBuildingAddress(String buildingAddress) {
        this.buildingAddress = buildingAddress;
    }
    /*  We first get the ErfNumber set to int.
        Then return the ErfNumber.
    */
    public int getErfNumber() {
        return erfNumber;
    }
    /*  We then setErfNumber
        The return type is void.
    */
    public void setErfNumber(int erfNumber) {
        this.erfNumber = erfNumber;
    }
    /*  We first get the ProjectFee set to int.
        Then return the ProjectFee.
    */
    public int getProjectFee() {
        return projectFee;
    }
    /*  We then setProjectFee
        The return type is void.
    */
    public void setProjectFee(int projectFee) {
        this.projectFee = projectFee;
    }
    /*  We first get the ProjectDeadline set to String.
        Then return the ProjectDeadline.
    */
    public String getProjectDeadline() {
        return projectDeadline;
    }
    /*  We then setProjectDeadline
        The return type is void.
    */
    public void setProjectDeadline(String projectDeadline) {
        this.projectDeadline = projectDeadline;
    }
    /*  We first get the TotalAmountPaid set to int.
        Then return the TotalAmountPaid.
    */
    public int getTotalAmountPaid() {
        return totalAmountPaid;
    }
    /*  We then setTotalAmountPaid
        We then increase the total amount paid from the initial amount.
        This will be effective in our main project.
    */
    public void setTotalAmountPaid(int totalAmountPaid) {
        this.totalAmountPaid += totalAmountPaid;
    }
    /* toString method.
       We set String to output.
       Then initialize our out to the attributes.
       Then we return the output.
     */
    public String toString(){
        String output = "Project Number: " + projectNumber;
        output += "\nProject Name: " + projectName;
        output += "\nBuilding Type: " + buildingType;
        output += "\nBuilding Address: " + buildingAddress;
        output += "\nERF Number: " + erfNumber;
        output += "\nProject Fee: " + projectFee;
        output += "\nTotal Amount Paid: " + totalAmountPaid;
        output += "\nProject Deadline: " + projectDeadline;
        return output;
    }
}



