public abstract class animal {
    private String name;
    private int age;

    public animal (){

    }
    
    public animal (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getAge() {
        return age;
    }
    public void setAge (int m){
        this.age = m;
    }

    public abstract void makeSound ();

}
