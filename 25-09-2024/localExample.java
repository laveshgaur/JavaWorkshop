//localization
import java.util.*;
class localExample{
    public static void main(String args[]){
        Locale locale = Locale.getDefault();
        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getISO3Language());
        System.out.println(locale.getCountry());
        System.out.println(locale.getDisplayCountry());
    }
}