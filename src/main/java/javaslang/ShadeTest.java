package javaslang;

import com.amazonaws.services.lambda.runtime.Context;
import javaslang.control.Option;

public class ShadeTest {
    public String myHandler(String input, Context context) {
        final Function1<String, String> f = String::toUpperCase;
        Option.of(input).map(f::apply).forEach(System.out::println);
        return Option.of(input).map(f::apply).getOrElse("<empty>");
  }
}
