import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ResourceBundle;

public class Hero {

    private static final ResourceBundle i18n =
            Main.i18n;

    private String hair = null;
    private String age = null;
    private String name = null;

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader (isr);



    public String getHair() {
        return hair;
    }

    public void setHair() {
        System.out.println(i18n.getString("Haircolor"));
        String cadena = null;
        try {
            cadena = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.hair = cadena;
    }

    public String getAge() {
        return age;
    }

    public void setAge() {
        System.out.println(i18n.getString("Edad"));
        String cadena = null;
        try {
            cadena = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.age = cadena;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.println(i18n.getString("Nombre"));
        String cadena = null;
        try {
            cadena = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.name = cadena;
    }
}
