package pl.finsys.inheritance_and_interfaces;

public abstract class AbstractRecipe {

    public void execute() {
        getReady();
        doTheDish();
        cleanup();
    }

    abstract void getReady();

    abstract void doTheDish();

    abstract void cleanup();
}
