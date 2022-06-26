package controller;

import seeders.MainData;
import view.InputView;
import view.MainMenuView;
import view.MessageDialog;

public class Controller {
    // untuk data dummy
    protected MainData dummyDatabase;

    // untuk view
    protected InputView inputView;
    protected MainMenuView mainMenu;
    protected MessageDialog messageDialog;

    public Controller(){
        this.mainMenu = new MainMenuView();
        this.messageDialog = new MessageDialog();
        this.inputView = new InputView();
        this.dummyDatabase = new MainData();
    }
}
