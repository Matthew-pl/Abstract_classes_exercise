public abstract class DomesticPet {
    String name;
    int age;

    DomesticPet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getVoice (){};

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
