public class Customer {
    private String name;
    private String email;
    private char gender;
    public Customer()
    {
        name = "";
        email = "";
        gender = ' ';
    }
    public Customer(String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public Customer(String name)
    {
        this.name = name;
    }


    public String getName()
    {
        return name;
    }
    public char getGender()
    {
        return gender;
    }
    public String getEmail()
    {
        return email;
    }
    public void setGender(char gender)
    {
        this.gender = gender;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void print()
    {
        System.out.print(name+" ("+gender+") at "+email+"\n");
    }

}
