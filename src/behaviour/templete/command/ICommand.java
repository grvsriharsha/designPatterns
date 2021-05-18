package behaviour.templete.command;

import java.util.List;

/**
 * Created by admins on 8/5/17.
 */
abstract class ICommand {

    public abstract void execute(List<Stock> list);
}
