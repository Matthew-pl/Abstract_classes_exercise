public class Cat extends DomesticPet {

    int whichLife;

    Cat (String name, int age, int whichLife) {
        super(name, age);
        this.whichLife = whichLife;
        System.out.printf("We created new cat named %s, it is its %s life!%n", this.name, this.whichLife);
    }

    public void getVoice() {
        System.out.printf("%s is mewing: Miau!%n", this.name);
    }

}
