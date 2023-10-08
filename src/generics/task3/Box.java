package generics.task3;

public class Box<K,T extends Fruit> {
    private T value;
    private K key;

    public Box(T value, K key) {
        this.value = value;
        this.key = key;
    }

    @Override
    public String toString() {
        return   "Ключ = " + key+", ТИП - "+ key.getClass().getName()+  "\nЗначение = " + value +", ТИП - "+ key.getClass().getName();
    }


}
