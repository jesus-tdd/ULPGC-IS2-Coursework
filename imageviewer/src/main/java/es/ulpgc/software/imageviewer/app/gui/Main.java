package es.ulpgc.software.imageviewer.app.gui;

import es.ulpgc.software.imageviewer.app.FileImageStore;
import es.ulpgc.software.imageviewer.architecture.commands.NextCommand;
import es.ulpgc.software.imageviewer.architecture.commands.PrevCommand;
import es.ulpgc.software.imageviewer.architecture.io.ImageStore;
import es.ulpgc.software.imageviewer.architecture.presenter.ImagePresenter;
import es.ulpgc.software.imageviewer.architecture.tasks.ImageProvider;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    private static File root;

    static void main() {
        root = new File("images");
        ImageStore store = new FileImageStore(root);
        ImageProvider provider = ImageProvider.with(store.images());
        SwingImageDisplay imageDisplay = new SwingImageDisplay();
        ImagePresenter presenter = new ImagePresenter(imageDisplay);
        presenter.show(provider.first(Main::readImage));
        Desktop.create(imageDisplay)
                .put("prev", new PrevCommand(presenter))
                .put("next", new NextCommand(presenter))
                .setVisible(true);
    }

    private static byte[] readImage(String id) {
        try {
            return Files.readAllBytes(new File(root, id).toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
