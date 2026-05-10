import io.PokeLoader;
import io.RemotePokeLoader;
import model.Pokemon;

import java.util.List;

public class Main {
    static void main() {
        PokeLoader loader = new RemotePokeLoader();
        List<Pokemon> list = loader.loadAll();
        for (Pokemon pokemon : list) {
            System.out.println(pokemon);
        }
    }
}
