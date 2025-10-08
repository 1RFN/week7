public class main {
    public static void main(String[] args) {
    dog myDog = new dog();
        myDog.setName("Fido");
        myDog.setAge(3);
        System.out.println("Name: " + myDog.getName());
        System.out.println("Age: " + myDog.getAge() + " years old");
        myDog.makeSound();
    }
}
