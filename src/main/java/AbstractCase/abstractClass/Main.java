package AbstractCase.abstractClass;

// Abstraction hides the complexity and only shows essential details.
// It can be achieved using abstract classes or interfaces.
public class Main {
    public static void main (String[] args) {
       Cat newCat = new Cat();
       newCat.sound();
       newCat.sleep();
    }
}
