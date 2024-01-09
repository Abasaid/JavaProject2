package org.example;
//14. Create Registration Class in which you would have variables such as email,
//userName and password that have an access scope only within its own class.
//After creating an object of the class, the user should be able to call methods
//and in each method separately pass values to set users email, username and
//password.
//Requirements:
//● Valid email consider to be only yahoo
//● Valid userName and password cannot be empty and should be of
//length larger than 6 characters. Also valid passwords cannot contain
//userName
class Registration{
    private String email;
    private String password;
    private String userName;

    public void setEmail(String email){
        if(email.endsWith("@yahoo.com")){
            this.email=email;
        }else{
            System.out.println("Please enter a valid yahoo email address");
        }
    }
    public void setUserName(String userName){
        if(userName.length() > 6){
            this.userName=userName;
        }else if(userName.isEmpty()){
            System.out.println("Invalid input");
        }else{
            System.out.println("Invalid username. Enter more than 6 characters");
        }

    }
    public void setPassword(String password){
        if(password.length() > 6 && !password.contains(userName)){
            this.password=password;
        }else if(password.isEmpty()){
            System.out.println("Invalid input");
        }else{
            System.out.println("Invalid password. Enter more than 6 characters");
        }
    }
    void printInfo(){
        System.out.println(email+" "+userName);
    }
}
public class Code14 {
    public static void main(String[] args) {
        Registration r=new Registration();
        r.setEmail("mymail@yahoo.com");
        r.setUserName("user015");
        r.printInfo();
        r.setEmail("mymail@gmail.gov");
        r.printInfo();
        r.setEmail("newMail@yahoo.com");
        r.printInfo();
    }
}
