public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("=======Dog==========");

        // dog
        Bulldog myPetDog = new Bulldog();

        myPetDog.bark();
        System.out.println(myPetDog.eyeColor);
        System.out.println(myPetDog.furColor);


        System.out.println("=======Cat==========");

        // cat
        Siamese myPetCat = new Siamese();

        myPetCat.meow();
        System.out.println(myPetCat.eyeColor);
        System.out.println(myPetCat.furColor);
    }
}