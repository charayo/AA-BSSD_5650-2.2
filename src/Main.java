import java.util.Scanner;

public class Main {

    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the animal type: ");
        String userAnimal = sc.nextLine();

        System.out.print("Can the animal fly? : ");
        String animalFlys = sc.nextLine();

        System.out.print("What food does it eat? : ");
        String food = sc.nextLine();

        System.out.print("Sound it makes : ");
        String sound = sc.nextLine();

        System.out.print("Enter from these options the number of legs it has: '2' or '4' or 'no legs :");
        int legs = sc.nextInt();

        System.out.println("**************input starts here********");
        System.out.print("Animal type:  " + userAnimal + " ");
        System.out.print("No of Legs:  " + legs + " ");
        System.out.println("Can it fly? :  " + animalFlys);
        System.out.println("**************input ends here***********");

        Animal duck = new Duck();
        Animal dog = new Dog();
        Animal turtle = new Turtle();
        Animal enteredName = new InpAnimal(userAnimal, legs, animalFlys, food, sound);

        testAnimal(duck);
        testAnimal(dog);
        testAnimal(turtle);
        testAnimal(enteredName);
        ambulation(userAnimal, animalFlys, food, sound);


    }
    public static void ambulation(String userAnimal, String animalFlys, String food, String sound){
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Do you wish to change your animal Ambulation? (answer with 'yes' or 'no' )");
        String choice = sc2.nextLine();

        if(choice.equals("yes")){
            System.out.println(choice);
            System.out.print("Enter from these options the number of legs it has: '2' or '4' or 'no legs :");
            int newLegs = sc2.nextInt();
            Animal modifiedAnimal = new InpAnimal(userAnimal, newLegs, animalFlys, food, sound);
            testAnimal(modifiedAnimal);
        }else{
            System.out.println("No change made to your animal");
        }
    }

    private static void testAnimal(Animal animal){
        String output = animal.animalName();
        output += "\n" + animal.speak();
        output += "\n" + animal.eat();
        output += "\n" + animal.pet();
        output += "\n" + animal.fly();
        output += "\n" + animal.walk();
        System.out.println(output);
        System.out.println("--------------------");
    }
}