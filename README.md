This is an example mod, demonstrating how to implement a block driver that allows access to blocks and their tile entities adjacent to an Adapter block from programs on an OpenComputers computer connected to the Adapter block.

**Important**: you'll need the OpenComputers API in your classpath to compile this example.

The example driver will allow reading information from a vanilla furnace. When a furnace is placed to an appropriately imprinted adapter that is connected to a computer it can be accessed as a component named "furnace":
```
lua> =component.furnace.isBurning()
false
```

Feel free to submit pull requests to expand and/or clarify documentation!