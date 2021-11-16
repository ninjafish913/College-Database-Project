public abstract class Person 
{
    private String name, email;

    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return this.email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public Person()
    {
        setName("-Unknown-");
        setEmail("-Unknown-");
    }
    public Person(String name, String email)
    {
        setName(name);
        setEmail(email);
    }
}