package net.nerdycraft.admintools.vote;

import com.vexsoftware.votifier.model.Vote;
import com.vexsoftware.votifier.model.VotifierEvent;
import cpw.mods.fml.common.Mod;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.common.MinecraftForge;

/**
 * Created by Rico on 26.02.2016.
 * VoteListener
 */
public class VoteListener {

    @Mod.EventHandler
    private void onPlayerVoted(VotifierEvent event) {

        String uname = event.getVote().getUsername();

        EntityPlayer p = MinecraftServer.getServer().getConfigurationManager().func_152612_a(uname);

    }
}
