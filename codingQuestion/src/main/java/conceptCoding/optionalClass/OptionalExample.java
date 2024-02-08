package conceptCoding.optionalClass;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String nameStr = null;
        String nameStr1 = "Hello";
        Optional<String> optionalS = Optional.ofNullable(nameStr1);
        //System.out.println(optionalS.isPresent());

         Optional<String> value = getName("Hell World");
         Optional<String> value1 = getName(null);

        System.out.println(value1.orElse("No Value presented #null value"));
        System.out.println(value.orElse("Value Presented #null"));
    }

    public static Optional<String> getName(String name){
        return Optional.ofNullable(name);
    }
}
