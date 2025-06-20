package javabasics;

class Account{
    public String name;
    protected String email;
    private String password;

    // getters & setters
    public String getPassword(){
//        setPassword(randomPass);
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }

//    private void setPassword(String password){
//        this.password = password;
//    }

}

public class AccessModifier {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Maha Bank 1";
        account1.email = "mahabank@gmail.com";
        account1.setPassword("abcd");
        System.out.println("password: " + account1.getPassword());
    }
}
