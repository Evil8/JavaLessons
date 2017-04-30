package controller.command;

import controller.command.impl.AddOrder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anton_Khmyzov on 4/19/2017.
 */
public final class CommandProvider {
    private final Map<CommandName, Command> repository = new HashMap<>();

    public CommandProvider() {
//        repository.put(CommandName.ADD_CUSTOMER, new SingIn());
        repository.put(CommandName.ADD_ORDER, new AddOrder());
//        repository.put(CommandName.ADD_SPORTGOOD, new AddBook());
//        repository.put(CommandName.WRONG_REQUEST, new WrongRequest());   //...
    }

    public Command getCommand(String name) {
        CommandName commandName = null;
        Command command = null;
        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        } catch (IllegalArgumentException | NullPointerException e) {    //write log
            command = repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}
