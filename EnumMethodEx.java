import java.util.*;
 enum Country {
 
    US {
 
        public String getCurrency() {
            return "DOLLAR";
        }
    }, RUSSIA {
 
        public String getCurrency() {
            return "RUBLE";
        }
    }, INDIA {
 
        public String getCurrency() {
            return "RUPEE";
        }
    };
 
    public abstract String getCurrency();
}

public class EnumMethodEx {
    public static void main(String[] args) {
        for (Country country : Country.values()) {
            System.out.println(country.getCurrency() + " is the currecny of " + country.name());
        }
    }
}





