package model;

public class Pokemon {
    
    private String name;
    private String type;
    private String ability;
    private int age;


    public Pokemon(String name, String type, String ability, int age){
        this.name = name;
        this.type = type;
        this.ability = ability;
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public String getAbility() {
        return ability;
    }


    public void setAbility(String ability) {
        this.ability = ability;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
