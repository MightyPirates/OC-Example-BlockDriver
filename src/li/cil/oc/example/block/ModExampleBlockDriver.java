package li.cil.oc.example.block;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;

/**
 * This mod demonstrates how to add support for third-party blocks, such as
 * blocks from vanilla Minecraft or from other mods. Block drivers are used
 * by the Adapter block to provide an environment for adjacent blocks.
 */
@Mod(modid = "OpenComputers|ExampleBlockDriver",
        name = "OpenComputers Addon Example - Block Driver",
        version = "1.0.0",
        dependencies = "required-after:OpenComputers@[1.2.0,)")
public class ModExampleBlockDriver {
    @Mod.Instance
    public static ModExampleBlockDriver instance;

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        li.cil.oc.api.Driver.add(new DriverFurnace());
    }
}
