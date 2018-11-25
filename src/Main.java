import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ResourceBundle;
import java.io.BufferedReader;

import static java.lang.Thread.sleep;

public class Main {

    public static final ResourceBundle i18n =
            ResourceBundle.getBundle("myProp_es");

    Hero hero = new Hero();

    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        String cadena = null;
        System.out.println(i18n.getString("Greeting"));
        System.out.println(i18n.getString("Welcome"));
        System.out.println(i18n.getString("Start"));
        Hero hero = new Hero();
        hero.setName();
        hero.setHair();
        hero.setAge();
        System.out.println(i18n.getString("Show"));
        System.out.println(i18n.getString("Age") + hero.getName());
        System.out.println(i18n.getString("Hair") + hero.getAge());
        System.out.println(i18n.getString("Name") + hero.getHair());
        System.out.println(i18n.getString("Correct"));
        try {
            cadena = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(i18n.getString("Begin"));
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
        System.out.println(i18n.getString("Starter"));
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i18n.getString("Explanation"));
        System.out.println(i18n.getString("Leaving"));
    }

}
