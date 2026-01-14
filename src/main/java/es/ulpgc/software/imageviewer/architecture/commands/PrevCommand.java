package es.ulpgc.software.imageviewer.architecture.commands;

import es.ulpgc.software.imageviewer.architecture.presenter.ImagePresenter;

public class PrevCommand implements Command{
    private final ImagePresenter presenter;

    public PrevCommand(ImagePresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void execute() {
        presenter.show(presenter.image().previous());
    }
}
