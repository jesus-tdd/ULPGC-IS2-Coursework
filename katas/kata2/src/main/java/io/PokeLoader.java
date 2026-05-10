package io;

import model.Pokemon;

import java.util.List;

public interface PokeLoader {
    List<Pokemon> loadAll();
}
