package net.nerdycraft.admintools.vote;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.nerdycraft.admintools.main.ModMain;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rico on 26.02.2016.
 * Vote Command
 */
public class VoteCommand implements ICommand {

    public VoteCommand() {

    }

    @Override
    public void processCommand(ICommandSender sender, String[] params) {
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }

    @Override
    public boolean isUsernameIndex(String[] astring, int i) {
        return false;
    }

    @Override
    public String getCommandName() {
        return "vote";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/vote";
    }

    @Override
    public List getCommandAliases() {
        return new ArrayList();
    }

    @Override
    public List addTabCompletionOptions(ICommandSender icommandsender, String[] astring) {
        return null;
    }

    @Override
    public int compareTo(@Nonnull Object o) {
        return 0;
    }
}
