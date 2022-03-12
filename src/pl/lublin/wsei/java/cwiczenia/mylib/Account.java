package pl.lublin.wsei.java.cwiczenia.mylib;
import org.apache.commons.lang3.StringUtils;

public class Account {
    private String name;


    public static String capitalize(String aStr)
    {
        String[] tokens = StringUtils.split(aStr);
        for(int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        return StringUtils.join(tokens,' ');
    }

    public void setName(String name) {
        this.name = capitalize(name);
    }

    public String getName() {
        return name;
    }

    private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";

    private static String translitRepl[] = {"a","b","v","g","d","e","je","zh","z","y","i","ji","j", "k","l","m","n","o","p","r","s","t","u","f","h","c","ch","sh","shh","'","ju","ja"};

    public String translit(String arg){
        String marg = arg.toLowerCase();
        String art;
        //StringUtils.indexOf(ukrAlphabet);
        for(int i = 0; i < marg.length(); i++) {
            art = translitRepl[StringUtils.indexOf(ukrAlphabet, marg.charAt(i))];

            //System.out.println(art);
            //System.out.println(marg.indexOf(art));
            //System.out.println(marg.charAt(i));
            //System.out.println(StringUtils.indexOf(ukrAlphabet, marg.charAt(i)));

            System.out.print(art);
        }
        return " ";
    }

}
