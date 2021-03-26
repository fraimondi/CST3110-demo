import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

public class Hello {

  void doesNotCauseNPE() {
    Pointers.A a = Pointers.mayReturnNull(10);
    a.method();
  }

  void mayCauseNPE() {
    Random rng = new Random();
    Pointers.A a = Pointers.mayReturnNull(rng.nextInt());
    a.method();
  }

  public static void main(String[] args) {
    Hello myHello = new Hello();
    myHello.doesNotCauseNPE();
    myHello.mayCauseNPE();
    System.out.println("Hello world!");
  }

}
