package lambdas;

public class Converter {

    @FunctionalInterface
   interface Converteer<F,T>{
       T convert(F from);
   }

    public static void main(String[] args) {
        Converteer<String,Integer> conv = (Integer::valueOf);
        System.out.println(conv.convert("123"));
        Converteer<Integer,Integer> convc = (f -> Integer.valueOf(f));
    }

}
