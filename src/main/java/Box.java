import java.util.ArrayList;
import java.util.List;

public class Box<T extends Boxable> {
    private List<T> items = new ArrayList<>();

    public List<T> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Box{" +
                "items=" + items +
                '}';
    }

    public void addItem(T t) {
        items.add(t);
    }

    public T getLatestItem() {
        return items.get(items.size() - 1);
    }

    public double getTotalWeight() {
        double sum = 0;
        for (T t : items) {
            //sum += 1;
            sum += t.getWeight();
        }
        return sum;
    }
}


