package actionpattern.commandpattern;

/**
 * 具体命令类
 * Created by Heyha on 2017/1/11.
 */
public class HelpCommand implements Command {
    private HelpHandler helpHandler;

    public HelpCommand() {
        this.helpHandler = new HelpHandler();
    }

    @Override
    public void execute() {
        helpHandler.display();
    }
}
