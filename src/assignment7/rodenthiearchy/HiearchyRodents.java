package assignment7.rodenthiearchy;

public class HiearchyRodents {

    public static void main(String[] args) {

        Rodent[] rodents = new Rodent[3];

        rodents[0] = new Mouse();
        rodents[0].eat();
        rodents[0].sleep();
        rodents[0].jump();

        rodents[1] = new Gerbil();
        rodents[1].eat();
        rodents[1].sleep();
        rodents[1].jump();

        rodents[2] = new Hamster();
        rodents[2].eat();
        rodents[2].sleep();
        rodents[2].jump();
    }
}
