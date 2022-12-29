public class SalariedEmployee extends Employee
{
    public double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,double weeklySalary)
    {

        super(firstName, lastName, socialSecurityNumber);

        if(weeklySalary <0.0)
        throw new IllegalArgumentException("Weekly salary must be >=0.0");

        this.weeklySalary = weeklySalary;
    }

    public void setWeeklysalary(double weeklySalary)
    {
        if(weeklySalary <0.0)
        throw new IllegalArgumentException("Weekly salary must be >=0.0");

        this.weeklySalary = weeklySalary;  
    }

    public double earnings()
    {
        return weeklySalary;
    }

    public String toString()
    {
        return String.format("salaried employee: %s%n%s: $%,.2f",super.toString(), "weekly salary", getWeeklySalary());
    }
}


    

