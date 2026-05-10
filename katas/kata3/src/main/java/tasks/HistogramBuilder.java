package tasks;

import model.Pokemon;
import viewmodel.Histogram;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class HistogramBuilder {
    public <T> Histogram<T> build(List<Pokemon> list, Function<Pokemon, Stream<T>> binarize) {
        Histogram<T> histogram = new Histogram<>();
        for (Pokemon pokemon : list) {
            binarize.apply(pokemon).forEach(histogram::put);
        }
        return histogram;
    }
}
