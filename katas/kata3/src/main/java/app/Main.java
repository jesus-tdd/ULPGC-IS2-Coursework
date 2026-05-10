package app;

import model.Pokemon;
import tasks.HistogramBuilder;
import viewmodel.Histogram;

import java.util.List;

import static model.Pokemon.*;

public class Main {
    static void main() {
        List<Pokemon> list = new RemotePokeLoader(CsvPokeParser::parse).loadAll();
        Histogram<Type> histogram = new HistogramBuilder().build(list, p -> p.types().stream());
        for (Type bin : histogram) {
            System.out.println(bin + ": " + histogram.count(bin));
        }
        System.out.println("Total: " + histogram.size());
    }
}
