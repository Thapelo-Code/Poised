public class Person {
    /* Attributes
       We create the attributes as private.
       Making them accessible within the declared class.
       The attributes are String name, String telephoneNumber,
       String email, String physicalAddress.
     */
    private String name;
    private String telephoneNumber;
    private String email;
    private String physicalAddress;

    /* Constructor
       The constructor method will pass in parameters
       String name, String telephoneNumber, String email,
       String physicalAddress.
       We then use this keyword.
       To invoke the current class constructor.
     */
    public Person(String name, String telephoneNumber, String email, String physicalAddress) {
        this.setName(name);
        this.setTelephoneNumber(telephoneNumber);
        this.setEmail(email);
        this.setPhysicalAddress(physicalAddress);
    }

    /* Methods
       We create a method for all our Attributes.
       We create our getters and setters.
       We first get the name as a String.
       Then return the name.
     */

    public String getName() {
        return name;
    }

    /* We set public method.
       Which will be visible from classes in our packages.
       We then setName.
       The return type is void.
     */
    public void setName(String name) {
        this.name = name;
    }

    /*  We first get the TelephoneNumber set to String.
        Then return the TelephoneNumber.
    */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /*  We then setTelephoneNumber.
        The return type is void.
    */
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    /*  We first get the Email set to String.
        Then return the Email.
    */
    public String getEmail() {
        return email;
    }

    /*  We then setEmail.
        The return type is void.
    */
    public void setEmail(String email) {
        this.email = email;
    }

    /*  We first get the PhysicalAddress set to String.
        Then return the PhysicalAddress.
    */
    public String getPhysicalAddress() {
        return physicalAddress;
    }

    /*  We then setPhysicalAddress.
        The return type is void.
    */
    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    /* toString method.
       We set String to output.
       Then initialize our out to the attributes.
       Then we return the output.
     */

    public  String toString() {
        String output = "Name: " + name;
        output += "\nTelephone Number: " + telephoneNumber;
        output += "\nEmail Address: " + email;
        output += "\nPhysical Address: " + physicalAddress;
        return output;
    }
}


