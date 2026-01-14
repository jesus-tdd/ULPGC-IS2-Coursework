package es.ulpgc.software.imageviewer.architecture.model;

public interface ImageDisplay {

    void on(Shift shift);
    void on(Released released);

    void paint(Paint... paints);

    int width();

    interface Shift {
        void offset(int value);
    }

    interface Released {
        void offset(int value);
    }

    public record Paint(byte[] bitmap, int offset) {

    }
}
