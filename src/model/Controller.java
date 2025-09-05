package model;

public class Controller {

    private Pokemon[] pokemons;
    private String[] types;

    public Controller(int size, int typeSize){
        pokemons = new Pokemon[size];
        types = new String[typeSize];
    }

    public void addType(String type, int i){
        if (i >= 0 && i < types.length){
            types[i] = type;
        }
    }

    public void addPokemon(String name, String type, String ability, int age, int i){
        if (i >= 0 && i < pokemons.length){
            Pokemon poke = new Pokemon(name, type, ability, age);
            pokemons[i] = poke;
        }
    }   

    public Pokemon[] getPokemons() {
        return pokemons;
    }

    public void setPokemons(Pokemon[] pokemons) {
        this.pokemons = pokemons;
    }

    public String[] getTypes() {
        return types;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }

}
