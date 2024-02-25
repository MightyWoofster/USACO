package School;
public class Contact{
    //private instance variables
    private String name; //contact's name
    private String phoneNum; // contact's phone number
    private String email; // contact's email
    private String birthday; //contact's birthday
    //static class variable
    private static String school = "N/A"; //contact's school 

    //contructors
    public Contact(){
        name = "not set";
        phoneNum = "not set";
        email = "not set";
        birthday = "not set";
    }
    //overloaded constructor with 4 parameters
    public Contact(String name, String phoneNum, String email, String birthday){
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
        this.birthday = birthday;
    }

    //accessor methods for instance variables
    public String getName(){
        return name;
    }
    public String getPhoneNum(){
        return phoneNum;
    }
    public String getEmail(){
        return email;
    }
    public String getBirthday(){
        return birthday;
    }

    //mutator methods for instance variables
    public void setName(String name){
        this.name = name;
    }
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }

    //accessor for static school variable
    public static String getSchool(){
        return school;
    }
    //mutator for static school variable
    public static void setSchool(String school){
        Contact.school = school;
    }

    //overrides the toString method
    public String toString(){
        return "Contact name: " + name + "; Phone #: " + phoneNum + "; Email: " + email + "; Birthday: " + birthday;
    }

    //main method
    public static void main(String[] args){
        //create objects
        Contact sophia = new Contact("Sophia Yang", "949-878-0118", "sophia.j.yang26@gmail.com", "01/26/2007");
        Contact siena = new Contact("Siena", "949-520-0671", "N/A", "N/A");
        Contact karen = new Contact("Karen", "N/A", "karentryoung@gmail.com", "01/05/207");
        Contact unknown = new Contact();
        Contact MsCali = new Contact("Ms. Cali", "N/A", "CatherineCali@iusd.org", "N/A");
        //set the school
        Contact.setSchool("Northwood High School");
        //set siena's birthday
        siena.setBirthday("01/22/2006");
        //print the objects
        System.out.println(sophia);
        System.out.println(siena);
        System.out.println(karen);
        System.out.println(unknown);
        System.out.println(MsCali);
    }
}