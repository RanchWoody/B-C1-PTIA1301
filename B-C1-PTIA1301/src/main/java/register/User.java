package register;

public class User {


    private String name;
    private int birthYear;
    private String address;

    public User()
    {
        this.name = "John Doe";
        this.birthYear = 1997;
        this.address = "Valahol a semmi közepén";
    }

    public String getName()
    {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public User(String name, int birthYear, String address) {
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }

    public int ageIn(int year)
    {
        if(year < birthYear)
        {
            return 0;
        }
        return year - birthYear;
    }

}
