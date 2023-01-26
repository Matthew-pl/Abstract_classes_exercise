public class Dog extends DomesticPet {

    DogRaceEnum race;
    Muzzle muzzle;

    Dog(String name, int age, DogRaceEnum raceEnum) {
        super(name, age);
        this.race = raceEnum;
        this.muzzle = new Muzzle(MuzzleSize.M, "Leather", 100);
        System.out.printf("We have created new Dog of %s race, its name is %s%n", this.race, this.name);
    }

    public Muzzle getMuzzle () {
        return this.muzzle;
    }

    public void setMuzzle (Muzzle muzzle) {
        this.muzzle = muzzle;
    }

    public void getVoice() {
        System.out.printf("%s is barking: RAF RAF!%n", this.name);
    }

}
