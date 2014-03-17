This is an example mod, demonstrating how to implement a block driver that allows access to blocks and their tile entities adjacent to an Adapter block from programs on an OpenComputers computer connected to the Adapter block.

To run it, after cloning the repository, set up your workspace with gradle as usual:
```
gradlew setupDecompWorkspace idea
```
I recommend enabling the Gradle plugin in IDEA. When opening the project in IDEA with it enabled, it will ask you whether you'd like to import the Gradle project. When you do so, it'll automatically set up the library dependency on the OC API for you.

The example driver will allow reading information from a vanilla furnace. When a furnace is placed to an appropriately imprinted adapter that is connected to a computer it can be accessed as a component named "furnace":
```
lua> =component.furnace.isBurning()
false
```

Feel free to submit pull requests to expand and/or clarify documentation!