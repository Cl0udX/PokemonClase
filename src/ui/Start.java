package ui;

import java.util.Scanner;
import model.Controller;

public class Start {

    private Scanner sc;
    private Controller controller;

    public Start() {
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Start start = new Start();
        start.init();
    }

    public void init() {
        System.out.println("Hola mundo, bienvenido a la aplicacion de Pokemon");
        System.out.println("Por favor ingresa el numero tipos que deseas registrar");

        String in = sc.nextLine();
        int typeSize = Integer.parseInt(in);

        System.out.println("Por favor ingresa el numero de pokemones que deseas registrar");
        String in2 = sc.nextLine();
        int pokemonSize = Integer.parseInt(in2);

        controller = new Controller(pokemonSize, typeSize);
        registerTypes();
        registerPokemons();

        showPokemons();
    }

    public void registerTypes() {
        for (int i = 0; i < controller.getTypes().length; i++) {
            System.out.println("Por favor ingresa el tipo " + (i + 1));
            String type = sc.nextLine();
            controller.addType(type, i);
        }
    }

    public void registerPokemons() {
        for (int i = 0; i < controller.getPokemons().length; i++) {
            System.out.println("Por favor ingresa el nombre del pokemon " + (i + 1));
            String name = sc.nextLine();

            System.out.println("Por favor ingresa la habilidad del pokemon " + (i + 1));
            String ability = sc.nextLine();

            System.out.println("Por favor ingresa la edad del pokemon " + (i + 1));
            int age = Integer.parseInt(sc.nextLine());

            for (int j = 0; j < controller.getTypes().length; j++) {
                System.out.println((j) + ". " + controller.getTypes()[j]);
            }

            System.out.println("Por favor ingresa el numero del tipo del pokemon " + (i + 1));
            int typeIndex = Integer.parseInt(sc.nextLine());

            String type = controller.getTypes()[typeIndex];

            controller.addPokemon(name, type, ability, age, i);
        }
    }

    public void showPokemons() {
        for (int i = 0; i < controller.getPokemons().length; i++) {
            System.out.println("--------------------------");
            System.out.println("Pokemon #" + (i + 1));
            System.out.println("Nombre: " + controller.getPokemons()[i].getName());
            System.out.println("Tipo: " + controller.getPokemons()[i].getType());
            System.out.println("Habilidad: " + controller.getPokemons()[i].getAbility());
            System.out.println("Edad: " + controller.getPokemons()[i].getAge());
            System.out.println("-------------------------");
        }
    }
}