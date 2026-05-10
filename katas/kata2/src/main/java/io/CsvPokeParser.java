package io;

import model.Pokemon;
import model.Pokemon.Type;

import java.util.ArrayList;
import java.util.List;

public class CsvPokeParser implements PokeParser {
    @Override
    public Pokemon parse(String s) {
        return parse(s.split(","));
    }

    private Pokemon parse(String[] split) {
        return new Pokemon(removeMarks(split[1]), toTypes(List.of(split[3], split[4])), toInt(split[12]));
    }

    private int toInt(String s) {
        return Integer.parseInt(s);
    }

    private List<Type> toTypes(List<String> strings) {
        List<Type> list = new ArrayList<>();
        for (String s : strings) {
            if (s.equals("\" \"")) continue;
            list.add(toType(s));
        }
        return list;
    }

    private Type toType(String s) {
        return Type.valueOf(removeMarks(s));
    }

    private String removeMarks(String s) {
        return s.replaceAll("\"", "");
    }
}
