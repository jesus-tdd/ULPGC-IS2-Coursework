package es.ulpgc.software.imageviewer.architecture.commands;

import es.ulpgc.software.imageviewer.architecture.presenter.ImagePresenter;

public class NextCommand implements Command {
    private final ImagePresenter presenter;

    public NextCommand(ImagePresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void execute() {
        presenter.show(presenter.image().next());
    }
}
