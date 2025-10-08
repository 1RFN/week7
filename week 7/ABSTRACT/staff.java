public class staff extends employ{
    @Override
    public void calculatebonus(){
        int bonus = (int) (getSalary() * 0.01);
        System.out.println(getName() + " gets a bonus of " + bonus);
    }
}
