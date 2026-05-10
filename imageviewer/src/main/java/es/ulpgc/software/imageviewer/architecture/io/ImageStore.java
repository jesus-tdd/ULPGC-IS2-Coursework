package es.ulpgc.software.imageviewer.architecture.io;

import java.util.stream.Stream;

public interface ImageStore {
    Stream<String> images();
}
