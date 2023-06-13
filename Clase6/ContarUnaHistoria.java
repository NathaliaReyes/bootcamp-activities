package Clase6;

import java.util.Arrays;
import java.util.Scanner;

public class ContarUnaHistoria {
    public static void main(String[] args){
        //Crear un programa que cuente una historia al estilo de “Elige tu propia Aventura”.
        Scanner cargarDatos = new Scanner(System.in);
        System.out.println("Welcome to this adventure in Colorado's mountains!");
        Arrays.asList("It is a sunday morning, you are by yourself in the Rocky Mountain National Park." +
                "You’re hiking and the sky starts to look dark but you’re motivated to get to the top of the mountain.Suddenly, you got stuck in a hailstorm and the snow is deep and you need to take very quickly a decision:" +
                "1). Seek shelter in a nearby cave." +
                "2). Continue the hike and search for a safer shelter\n", "What option would you choose? (1 or 2)").forEach(System.out::println);
        int eleccion = cargarDatos.nextInt();

            if(eleccion == 1){
                for (String s : Arrays.asList("Faced with the arrival of rain, hail, and extreme cold," +
                        "you decide to seek shelter in a nearby cave to protect yourself from the harsh weather." +
                        "You venture into the cave and find a secure place to take cover until the storm passes " +
                        "but you notice that you’re not alone, you have the company of a 4 bear group." +
                        " " +
                        " What are you going to do?"
                        + "1). Slowly back away and leave the cave." + "2). Stay calm and observe the bears.\n", "\"What option would you choose? (1 or 2)\"")) {
                    System.out.println(s);
                }
                eleccion = cargarDatos.nextInt();

                if (eleccion == 1) {
                    System.out.println("You carefully back away from the bears in the cave and continue your hike.\nSoon, you stumble upon a cozy cabin where you find shelter from the storm.");
                    System.out.println("You wait it out and, once the weather clears, resume your hike, grateful for making the safe choice.");
                    System.out.println("With your heart filled with excitement and tranquility,\nyou decide to return home to share your incredible adventure with the world.\n\nCongratulations!!, you have had a successful ending to your quest!\n");
                } else if (eleccion == 2) {
                    System.out.println("You calmly observe the bears from a safe distance and quietly leave the cave.");
                    System.out.println("Continuing your hike, you find a serene spot to rest and reflect on the encounter.");
                    System.out.println("With a renewed appreciation for nature,\nyou continue your journey, carrying the memory of the peaceful bear encounter.");
                    System.out.println("With your heart filled with excitement and tranquility,\nyou decide to return home to share your incredible adventure with the world.\n\nCongratulations!!, you have had a successful ending to your quest!");
                }
            } else if (eleccion == 2) {
                System.out.println("You choose to continue the hike despite the rain, hail, and cold.");
                System.out.println(" You look for a safer shelter, such as a mountain refuge or a protected area.");
                System.out.println("You proceed with caution, using appropriate equipment to face the adverse conditions\nas you make your way towards a more sheltered location.");
                System.out.println("However,  you notice that you have company, you’re been observed by a 4 bear group.\nWhat are you going to do?\n");
                System.out.println("What option would you choose? (1 or 2)");
                eleccion = cargarDatos.nextInt();

                if (eleccion == 1) {
                    System.out.println("You back away from the bears and find a different route.");
                    System.out.println("Enjoying the scenery and learning from the experience, you reach the end of your journey safely.");
                    System.out.println("Grateful for the adventure, you return home to share your story of caution and respect.");
                    System.out.println("With your heart filled with excitement and tranquility,\nyou decide to return home to share your incredible adventure with the world.\n\nCongratulations!!, you have had a successful ending to your quest!\n");
                } else if (eleccion == 2) {
                    System.out.println("You calmly observe the bears from a safe distance and quietly exit the trail.");
                    System.out.println("Continuing your hike, you cherish the peaceful encounter and carry the memory with you.");
                    System.out.println("Safely reaching the end of your journey, you return home,\ninspired by the beauty of nature and the importance of respecting wildlife.");
                    System.out.println("With your heart filled with excitement and tranquility, you decide to return home to share your incredible adventure with the world.\n\nCongratulations!!, you have had a successful ending to your quest!\n");
                }
            } else {
                 System.out.println("invalid option. The aventure ends here.");
            }

        cargarDatos.close();
        }
    }
