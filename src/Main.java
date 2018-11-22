import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ResourceBundle;
import java.io.BufferedReader;

import static java.lang.Thread.sleep;

public class Main {

    /*private static final ResourceBundle i18n =
            ResourceBundle.getBundle("bundle");*/

    Hero hero = new Hero();

    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        String cadena = null;
        System.out.println("Hello");
        System.out.println("Welcome to my game");
        System.out.println("Let's start by creating your hero");
        Hero hero = new Hero();
        hero.setName();
        hero.setHair();
        hero.setAge();
        System.out.println("Let's show your hero: ");
        System.out.println("Age: " + hero.getName());
        System.out.println("Hair: " + hero.getAge());
        System.out.println("Name: " + hero.getHair());
        System.out.println("Is this correct? (y/n)");
        try {
            cadena = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Let's start");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("3");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("2");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("1");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("START");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Your hero dies, the world is destroyed and Java is the worst language in the world");
        System.out.println("Bye");
    }

    public void hero(){
        hero.setAge();
    }
}
