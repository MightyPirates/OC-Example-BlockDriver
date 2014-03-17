package li.cil.oc.example.block;

import li.cil.oc.api.Network;
import li.cil.oc.api.network.*;
import li.cil.oc.api.prefab.DriverTileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.world.World;

/**
 * This driver allows interacting with vanilla furnaces via the Adapter block.
 */
public class DriverFurnace extends DriverTileEntity {
    @Override
    public Class<?> getTileEntityClass() {
        return TileEntityFurnace.class;
    }

    @Override
    public ManagedEnvironment createEnvironment(World world, int x, int y, int z) {
        return new Environment((TileEntityFurnace) world.getBlockTileEntity(x, y, z));
    }

    public class Environment extends li.cil.oc.api.prefab.ManagedEnvironment {
        protected final TileEntityFurnace furnace;

        public Environment(TileEntityFurnace furnace) {
            this.furnace = furnace;
            node = Network.newNode(this, Visibility.Network).
                    withComponent("furnace").
                    create();
        }

        // The following methods are available to programs running on computers
        // that are connected to the adapter block managing this environment.

        @Callback
        public Object[] getBurnTime(Context context, Arguments args) {
            return new Object[]{furnace.furnaceBurnTime};
        }

        @Callback
        public Object[] getCookTime(Context context, Arguments args) {
            return new Object[]{furnace.furnaceCookTime};
        }

        @Callback
        public Object[] getCurrentItemBurnTime(Context context, Arguments args) {
            return new Object[]{furnace.currentItemBurnTime};
        }

        @Callback
        public Object[] isBurning(Context context, Arguments args) {
            return new Object[]{furnace.isBurning()};
        }
    }
}
