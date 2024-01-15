import java.util.ArrayList;
import java.util.List;

class Box<T> {
    private List<T> items = new ArrayList<>();

    public void put(T item) {
        items.add(item);
    }

    public T get() {
        if (items.isEmpty()) {
            return null;
        }
        return items.remove(items.size() - 1);
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Box = ").append(items).toString();
    }

    public static void printBox(Box<?> box) {
        System.out.println(box);
    }

    public static Box<Fruit> getFruitBox() {
        Box<Fruit> fruitBox = new Box<>();
        fruitBox.put(new Apple());
        fruitBox.put(new Orange());
        return fruitBox;
    }
}

class Fruit {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Orange extends Fruit {
    @Override
    public String toString() {
        return "Orange";
    }
}

class Main {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = Box.getFruitBox();
        Box.printBox(fruitBox);
    }
}
