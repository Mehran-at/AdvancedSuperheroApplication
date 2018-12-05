//Update the Batman, Superman and Spiderman classes from exercise 4 with the fight method. Inside it, it weakens the villain.
public class Superman implements Superhero {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public String toString() {
        return "Superman";
    }

    @Override
    public void fight(Villain villain) {
        villain.weaken(this.toString());
    }
}
