import java.util.ArrayList;
import java.util.List;
// Composite class
class Composite implements Component {
    private List<Component> components = new ArrayList<>();

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    public void operation() {
        System.out.println("Composite:");

        for (Component component : components) {
            component.operation();
        }
    }
}