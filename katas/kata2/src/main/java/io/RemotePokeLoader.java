package io;

import model.Pokemon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class RemotePokeLoader implements PokeLoader{

    @Override
    public List<Pokemon> loadAll() {
        try {
            return loadFrom(new URL("https://raw.githubusercontent.com/lgreski/pokemonData/refs/heads/master/Pokemon.csv"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<Pokemon> loadFrom(URL url) throws IOException {
        return loadFrom(url.openConnection());
    }

    private List<Pokemon> loadFrom(URLConnection connection) throws IOException {
        try(InputStream inputStream = connection.getInputStream()) {
            return loadFrom(toReader(inputStream));
        }
    }

    private List<Pokemon> loadFrom(BufferedReader reader) throws IOException {
        List<Pokemon> list = new ArrayList<>();
        PokeParser parser = new CsvPokeParser();
        reader.readLine();
        while (true) {
            String line = reader.readLine();
            if (line == null) break;
            list.add(parser.parse(line));
        }
        return list;
    }

    private BufferedReader toReader(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream));
    }
}
