import java.security.SecureRandom;
import java.util.Scanner;

public class Email {
    
    private String firstname;
    private String lastname;
    private String department;
    private String password;
     private int mailboxCapacity; 
     private String alternateEmail;
     private String companysuffex = "aeuicompany.com";
     private int passwordlenght =10;
     private String email;


     //constructor to recieve the first name and last name

public Email(String firstname, String lastname) {

this.firstname = firstname;
this.lastname = lastname; 
System.out.println("New worker: " + firstname );


department = setdepartment();
System.out.println("Department: " + department);

password = generateRandomPassword(passwordlenght);
System.out.println("Your password: " + password);

email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + companysuffex;
System.out.println("Email: " + email);

System.out.println("Alternate Email: " + getAlternateEmail()); 

//System.out.println(toString());

}





     //Ask for the department
private String setdepartment(){

Scanner in = new Scanner(System.in);
System.out.println("Department Codes:\n 1 for Sales\n 2 for Development\n 3 for Accounting\n 0 for none: ");
int choice = in.nextInt();

switch(choice){
    case 1:
    return "Sales";
    case 2:
    return "Development";
    case 3:
    return "Accounting";
    default:
    return  " ";

}


}

     //Generate a random password 



 public static String generateRandomPassword(int passwordlenght) {
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialCharacters = "!@#$%^&*()-_=+[]{}|;:,.<>?";

        String combinedChars = upperCaseLetters + lowerCaseLetters + digits + specialCharacters;

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        // توليد كلمة مرور عشوائية بالحجم المحدد
        for (int i = 0; i < passwordlenght; i++) {
            int index = random.nextInt(combinedChars.length());
            password.append(combinedChars.charAt(index));
        }

        return password.toString();
    }

     // Set the mailbox capacity

public void setMailboxCapacity( int mailboxCapacity ){
    this.mailboxCapacity = mailboxCapacity;
}
    // Set the alternate email


    public void setAlternateEmail( String alternateEmail ){
        this.alternateEmail = alternateEmail;
    }

    // Change the password
    public void changePassword( String password ){
        this.password = password;
    }





    public String getFirstname() {
        return firstname;
    }





    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }





    public String getLastname() {
        return lastname;
    }





    public void setLastname(String lastname) {
        this.lastname = lastname;
    }





    public String getDepartment() {
        return department;
    }





    public void setDepartment(String department) {
        this.department = department;
    }





    public String getPassword() {
        return password;
    }





    public void setPassword(String password) {
        this.password = password;
    }





    public int getMailboxCapacity() {
        return mailboxCapacity;
    }





    public String getAlternateEmail() {
        return alternateEmail;
    }





    public String getCompanysuffex() {
        return companysuffex;
    }





    public void setCompanysuffex(String companysuffex) {
        this.companysuffex = companysuffex;
    }





    public int getPasswordLenght() {
        return passwordlenght;
    }





    public void setPasswordLenght(int passwordlenght) {
        this.passwordlenght = passwordlenght;
    }





    public String getEmail() {
        return email;
    }





    public void setEmail(String email) {
        this.email = email;
    }





    @Override
    public String toString() {
        return "Email [firstname=" + firstname + ", lastname=" + lastname + ", mailboxCapacity=" + mailboxCapacity + ", email=" + email + "]";
    }


    

}
