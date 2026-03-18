package MyZoo;

import java.io.*;
import java.util.*;

public class Zoo {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        HashMap<String, Integer> speciesCount = new HashMap<>();

        ArrayList<String> names = new ArrayList<>();
        Random rand = new Random();

        // Read names file
        try {
            BufferedReader nameReader = new BufferedReader(new FileReader("animalNames.txt"));
            String line;

            while ((line = nameReader.readLine()) != null) {
                names.add(line);
            }

            nameReader.close();
        }
        catch (IOException e) {
            System.out.println("Error reading animalNames.txt");
        }

        // Read arriving animals file
        try {
            BufferedReader reader = new BufferedReader(new FileReader("arrivingAnimals.txt"));
            String line;

            while ((line = reader.readLine()) != null) {

                String species = line.trim();

                // Random name
                String name = names.get(rand.nextInt(names.size()));

                // Random age
                int age = rand.nextInt(15) + 1;

                Animal animal = null;

                switch(species.toLowerCase()) {

                    case "hyena":
                        animal = new Hyena(name, age);
                        break;

                    case "lion":
                        animal = new Lion(name, age);
                        break;

                    case "tiger":
                        animal = new Tiger(name, age);
                        break;

                    case "bear":
                        animal = new Bear(name, age);
                        break;
                }

                if (animal != null) {

                    animals.add(animal);

                    speciesCount.put(
                            species,
                            speciesCount.getOrDefault(species, 0) + 1
                    );
                }
            }

            reader.close();

        }
        catch (IOException e) {
            System.out.println("Error reading arrivingAnimals.txt");
        }

        // Write report
        try {

            PrintWriter writer = new PrintWriter("newAnimals.txt");

            writer.println("===== Zoo Animal Report =====\n");

            for (Animal a : animals) {
                writer.println(a.getSpecies() + " : " + a.toString());
            }

            writer.println("\n===== Species Count =====");

            for (String species : speciesCount.keySet()) {
                writer.println(species + " : " + speciesCount.get(species));
            }

            writer.close();

        }
        catch (IOException e) {
            System.out.println("Error writing report.");
        }
    }
}
