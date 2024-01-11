import java.util.LinkedList;

class Entry<K, V> { //Этот класс представляет элемент хэш-таблицы, состоящий из ключа и значения
    K key;
    V value;

    Entry(K key, V value) { //конструктор, который принимает ключ и значение и инициализирует соответствующие поля.
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }
}


public class HashTable <K, V> {
    private LinkedList<Entry<K, V>>[] table = new LinkedList[16]; //массив связанных списков типа Entry
    private int size; //отслеживает количество элементов в таблице

    private int hash(K key) { //определене индекса в массиве table на основе хэш-кода ключа
        return key.hashCode() % table.length;
    }

    public void put(K key, V value) { // добавляет новую запись в хэш-таблицу
        int index = hash(key); //определение индекса в массиве
        if (table[index] == null) {
            table[index] = new LinkedList<Entry<K, V>>();
        }
        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) { //совпадает ли ключ текущей записи с добавляемым ключом
                entry.setValue(value);
                return;
            }
        }
        table[index].add(new Entry<K, V>(key,value));
        size++;
    }

    public V getValue(K key) { //принимаем ключ K и возвращаем соответствующее ему значение V
        int index = hash(key);
        V value = null;
        if (table[index] == null) {
            return value;
        }
        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                value = entry.getValue();
                break;
            }
        }
        return value;
    }

    public void remoteKey(K key) {
        int index = hash(key);
        if (table[index] == null) {
            return;
        }
        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                table[index].remove(entry);
                size--;
                break;
            }
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}