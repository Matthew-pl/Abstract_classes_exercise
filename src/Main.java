public class Main {
    public static void main(String[] args) {

    Dog max = new Dog("Max", 3, DogRaceEnum.BOXER);
    Cat winston = new Cat("Winston", 6, 5);
    max.getVoice();
    winston.getVoice();

    System.out.printf("%s has muzzle made of %s, but it is too small for it. Lets buy a new larger one!%n", max.name, max.muzzle.madeOf);
    max.setMuzzle(new Muzzle(MuzzleSize.XL, "Plastic", 3));

    System.out.printf("Now %s has a new muzzle made of %s. It was real bargain, paid only %s bucks for it!", max.name, max.muzzle.madeOf, max.muzzle.price);

    }

/*
    1.Analogous to the Dog class, create the Cat class, present its operation.
    2. create a superclass, such as PetDomestic, from which the Cat and Dog classes will inherit.
    Transfer all the common methods and attributes to the AnimalDomestic class.
    3. create an array storing an object of the Dog class and an object of the Cat class. List the sounds made by them.
    4. modify the pet application so that the PetDomestic class is abstract.
    5. create a class Muzzle (size, material of execution...), the object of which will contain the Dog (composition) class. Display the muzzle data through the object of the Dog.
*/

}