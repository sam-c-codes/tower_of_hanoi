
public class TowerSolver {
    private TowerModel model;

    public TowerSolver()
    {
        // Nothing to do here
    }

    public void solve(TowerModel model)
    {
        this.model = model;
        // Call the missing solve method (not this one)
        solve(model.height(), 0, 1, 2)
    }

    // Create an overloaded solve(...) method
    // This new method will be recursive (call itself)
    //
    private void solve(int height, int source, int auxillary, int destination) {
        if (height == 1) {
            model.move(source, destination)
            return;
        }
    }

}
