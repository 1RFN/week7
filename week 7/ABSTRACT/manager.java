public class manager extends employ {
    
    @Override
    public void calculatebonus(){
        int bonus = (int) (getSalary() * 0.1);
        System.out.println(getName() + " gets a bonus of " + bonus);
    }
}
