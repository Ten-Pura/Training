import java.util.ArrayList;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.io.IOException;

public class ArrayList_16_1 {
    public static void main(String[] args ) {
        ArrayList<String> list = new ArrayList<String>();

        if ( 0 < args.length) {
            for (String e: args) {
                list.add(e);
            }
        } else {
            System.out.println("Intput is empty.");
        }

        List<String> tmp = list.stream()
                            .map( str -> "Test:" + str)
                            .collect(Collectors.toList());

        if (tmp.isEmpty()){
            System.out.println("tmpはからです。");
        } else {
            tmp.stream()
                .filter(s -> s.endsWith("tomato"))
                .forEach(s -> System.out.println("TOMATO!!"));
        }
    }
}