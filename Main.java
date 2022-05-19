// We import our packages.

import java.util.*;
import static java.lang.System.exit;

// This is our main class.

public class Main {
    /* We then create a menu option.
       A string array will store all the options.
       Then we print out the option to the user.
     */
    public static void printMenu(String[] options){
        for (String option : options){
            System.out.println(option);
        }
        System.out.println("Please choose your option : ");
    }
    // We create a method to input project details.
    public static Project getproject(){

        /* We create a scanner to request input from user.
           The user will input the project number.
           Then we print out requesting user to enter project number.
           We set int prNumber initialise it to the users input.
         */

        System.out.println("Project Details");
        Scanner ins = new Scanner(System.in);
        System.out.println("Please enter Project Number");
        int prNumber = ins.nextInt();

        /* We create a scanner to request input from user.
           The user will input the project name.
           Then we print out requesting user to enter project name.
           We set string prName initialise it to the users input.
        */

        Scanner prn = new Scanner(System.in);
        System.out.println("Please enter the Project Name");
        String prName = prn.nextLine();

        /* We create a scanner to request input from user.
           The user will input the building type.
           Then we print out requesting user to enter building type.
           We set string buildtype initialise it to the users input.
         */

        Scanner bt = new Scanner(System.in);
        System.out.println("Please enter the Building Type");
        String buildType = bt.nextLine();

        /* We create a scanner to request input from user.
           The user will input the Building Address.
           Then we print out requesting user to enter Building Address.
           We set string buildAddress initialise it to the users input.
        */

        Scanner add = new Scanner(System.in);
        System.out.println("Please enter the Building Address");
        String buildAddress = add.nextLine();

        /* We create a scanner to request input from user.
           The user will input the ERF Number.
           Then we print out requesting user to enter ERF Number.
           We set int erfnumber initialise it to the users input.
         */

        Scanner erf = new Scanner(System.in);
        System.out.println("Please enter the ERF Number");
        int erfNumber = erf.nextInt();

        /* We create a scanner to request input from user.
           The user will input the Project Fee.
           Then we print out requesting user to enter Project Fee.
           We set int initialise it to the users input.
         */

        Scanner pf = new Scanner(System.in);
        System.out.println("Please enter the Project Fee");
        int prFee = pf.nextInt();

        /* We create a scanner to request input from user.
           The user will input the Total Amount Paid.
           Then we print out requesting user to enter Total Amount Paid.
           We set int initialise it to the users input.
         */

        Scanner tmp = new Scanner(System.in);
        System.out.println("Please enter the Total Amount Paid");
        int totalPaid = tmp.nextInt();

        /* We create a scanner to request input from user.
           The user will input the Project Deadline.
           Then we print out requesting user to enter Project Deadline.
           We set int initialise it to the users input.
         */

        Scanner pd = new Scanner(System.in);
        System.out.println("Please enter the Project Deadline");
        String prDeadline = pd.nextLine();

        /* We then return new Project.
           Passing in arguments from the users input.
         */

        return new Project(prNumber, prName, buildType, buildAddress, erfNumber, prFee, totalPaid ,prDeadline);
    }
    /* Then we create a method for our person details.
       This method will gather details we require.
       It can either get the contract, customer etc.
     */
    public static Person getperson(){

        /* We create a scanner to request input from user.
           The user will input the Contractors Details.
           Then we print out requesting user to enter name of the contractors.
         */

        System.out.println("Contractors Details");
        Scanner n = new Scanner(System.in);
        System.out.println("Please enter the name of the contractors");
        String arName = n.nextLine();


        /* We create a scanner to request input from user.
           The user will input the telephone number.
           Then we set the telephone number to a String.
           Scanner set as tele.
         */

        Scanner tele = new Scanner(System.in);
        System.out.println("Please enter the contractors telephone number");
        String telephoneNr = tele.nextLine();

        /* We create a scanner to request input from user.
           The user will input the contractors email address.
           Then we set the contractors email address to a String.
         */

        Scanner mail = new Scanner(System.in);
        System.out.println("Please enter the contractors email address");
        String emailAdd = mail.nextLine();

        /* We create a scanner to request input from user.
           The user will input the contractors physical address.
           Then we set the contractors physical address to a String.
         */

        Scanner dress = new Scanner(System.in);
        System.out.println("Please enter the contractors physical address");
        String pyAddress = dress.nextLine();

        /* We then return new Person.
           Passing in arguments from the users input.
         */

        return new Person(arName, telephoneNr, emailAdd,pyAddress);

    }

    /* In our main
       We pass in parameters.
       Namely, the Project institutionalBuilding set to the get project method.
       Then the Person contractors set to get the getperson method.
     */

    public static void main(String[] args) {
        Project institutionalBuilding = getproject();
        Person contractors = getperson();

        /* Creation of the Menu.
           We then store all option as a string array.
           We store option with numbers at the beginning.
           The user will then select just a number.
         */

        String[] options = {"1 - Create New Project",
                            "2 - Edit Project Deadline",
                            "3 - Change Total Amount Fee Paid",
                            "4 - Update Contractors Contact Details",
                            "5 - Exit",
        };
        // The user will choose from the menu option.

        Scanner op = new Scanner(System.in);
        /* Set the option to an integer set it to 1.
           The user can only select an integer as a choice.
         */

        int option = 1;

        /* We then create a while loop.
           This will be executed unless until user enters 5 for exit.
         */
        while (option != 5){
            printMenu(options);
            // Create a try and catch if input is not an int.
            try{
                option = op.nextInt();
                /* Creation of case 1 - 5 from the user input option.
                   Case 1 will get the project details and execute the toString.
                   Case 2 which will be option 2 will execute project method.
                   We use the switch statement as our conditional statement.
                   We execute the programme by first creating a project.
                   As we do not have an arrayList to store the projects.
                   We all call our getperson() method aswell.
                 */
                switch (option){
                    case 1:
                        institutionalBuilding = getproject();
                        contractors = getperson();
                        System.out.println("===============");
                        System.out.println("Projects To Do");
                        System.out.println("===============");
                        System.out.println(institutionalBuilding+ "\n");
                        System.out.println(contractors + "\n");
                        break;
                    case 2: option2(institutionalBuilding); break;
                    case 3: option3(institutionalBuilding); break;
                    case 4: option4(contractors); break;
                    case 5: exit(0);
                }
            }
            // The catch block will display an error message.

            catch (Exception ex){
                System.out.println("Please enter an Integer value between 1 and " + options.length);
                op.next();
            }
        }
    }
    /* Options Method.
       We create a method for option 1.
       This method will call the getproject() method when option 1 is selected.
     */
    private static void option1() {
        //Project
        System.out.println("Create New Project");
        Project institutionalBuilding = getproject();
        System.out.println("===============");
        System.out.println("Projects To Do");
        System.out.println("===============");
        System.out.println(institutionalBuilding + "\n");


        // Building contractor
        System.out.println("====================");
        Person contractors = getperson();
        System.out.println("Building Contractors");
        System.out.println("====================");
        System.out.println(contractors + "\n");

    }

    private static void option2(Project projObject) {
        System.out.println("Edit Project Deadline");

        /* We create a scanner to input our new due date.
           We then print out to the user what they need to input
           We take in the new string due date
           We call our institutionalBuilding.setProjectDeadline pass in parameter nDueDate.
           Then print out with the new due date.
         */
//
        Scanner ins = new Scanner(System.in);
        System.out.println("Please enter new Project Deadline Date: ");
        String prDeadlineDate = ins.nextLine();
        projObject.setProjectDeadline(prDeadlineDate);
        System.out.println(projObject);
    }

    /* Option 3 selection
       We then print out to the user what they need to input.
       Then we take the object institutionalBuilding and invoke our setters.
       We call our institutionalBuilding.setTotalAmountPaid pass in parameter prTotalAmountFeePaid.
       Then print out institutionalBuilding with the fee paid.
     */
    private static void option3(Project institutionalBuilding) {
        System.out.println("Change Total Amount Fee Paid");
        Scanner ins = new Scanner(System.in);
        System.out.println("Please enter the total amount fee paid to date ");
        int prTotalAmountFeePaid = ins.nextInt();
        institutionalBuilding.setTotalAmountPaid(prTotalAmountFeePaid);
        System.out.println(institutionalBuilding);
    }

    /* Option 4 selection
       We then print out to the user what the user need to input.
       Then we printout the object contractors.
       Then we take the object contractors and invoke our setters.
       We call our contractors.setTelephoneNumber pass in parameter prContractorsContactDetails.
       Then print out object contractors  with the updated contacts.
         */
    private static void option4(Person contractors) {
        System.out.println("Update Contractors Contact Details");
        System.out.println(contractors);
        Scanner ins = new Scanner(System.in);
        System.out.println("Please enter contractors new contact details");
        String prContractorsContactDetails = ins.nextLine();
        contractors.setTelephoneNumber(prContractorsContactDetails);
        System.out.println(contractors);
    }
}
