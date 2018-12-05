//Create the AdvancedSuperheroApplication class and write the following instructions in its main method:
//        . Create a SuperheroCaller. Reuse the one from exercise 4.
//        . Create one Joker.
//        . Use the SuperheroCaller ten times to call one superhero and make him fight the joker.
//        -------------------------------------------------
//        Damn you, Spiderman! You managed to weaken me!
//        Damn you, Batman! You managed to weaken me!
//        Damn you, Spiderman! You managed to weaken me!
//        Damn you, Spiderman! You managed to weaken me!
//        Damn you, Batman! You managed to weaken me!
//        Damn you, Batman! You managed to weaken me!
//        Damn you, Batman! You managed to weaken me!
//        Damn you, Spiderman! You managed to weaken me!
//        Damn you, Batman! You managed to weaken me!
//        Damn you, Spiderman! You managed to weaken me!
//        You all defeated me! But I will be back!
//        --------------------------------------------------
public class AdvancedSuperheroApplication {
    public static void main(String[] args) {
        SuperheroCaller superheroCaller = new SuperheroCaller();
        Joker joker = new Joker();
        for (int times = 0; times<10; times++) {
            Superhero superhero = superheroCaller.call();
            superhero.fight(joker);
        }
    }
}