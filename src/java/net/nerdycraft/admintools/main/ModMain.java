package net.nerdycraft.admintools.main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.common.config.Configuration;


import net.nerdycraft.admintools.vote.VoteCommand;

/**
 * Created by Rico on 25.02.2016.
 * MainClass
 */
@Mod(modid = ModMain.MODID, name = ModMain.NAME, version = ModMain.VERSION)
public class ModMain {

    public static final String NAME = "NerdyCraft ServerTools";
    public static final String MODID = "nerdycraftAdmintools";
    public static final String VERSION = "1.7.10-A1";

    @Mod.Instance(NAME)
    public static ModMain instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        System.out.println("FMLPreInitializationEvent");

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {


    }

    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
        event.registerServerCommand(new VoteCommand());
        System.out.println("FMLServerStartingEvent");
    }
}
