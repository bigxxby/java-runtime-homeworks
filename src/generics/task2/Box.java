package generics.task2;

public class Box<T, K> {
    private T key;
    private K value;

    public Box(T key, K value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return   "Ключ = " + key+", ТИП - "+ key.getClass().getName()+  "\nЗначение = " + value +", ТИП - "+ key.getClass().getName();
    }

}
