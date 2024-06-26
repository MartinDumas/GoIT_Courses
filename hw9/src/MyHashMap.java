public class MyHashMap<K, V> {
    private static final int DEFAULT_SIZE = 8;
    private Entry<K, V>[] context;
    private int size;
    private Entry<K, V> nullKeyEntry; // For storing the null key entry

    public MyHashMap() {
        this.context = new Entry[DEFAULT_SIZE];
        this.size = 0;
        this.nullKeyEntry = null; // Initialize the null key entry
    }

    public void put(K key, V value) {
        if (key == null) {
            if (nullKeyEntry == null) {
                nullKeyEntry = new Entry<>(null, value);
                size++;
            } else {
                nullKeyEntry.value = value;
            }
            return;
        }

        int index = calculateIndex(key.hashCode());
        Entry<K, V> newEntry = new Entry<>(key, value);

        if (context[index] == null) {
            context[index] = newEntry;
        } else {
            Entry<K, V> current = context[index];
            while (true) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                if (current.next == null) {
                    current.next = newEntry;
                    break;
                }
                current = current.next;
            }
        }
        size++;
    }

    public V get(K key) {
        if (key == null) {
            return nullKeyEntry != null ? nullKeyEntry.value : null;
        }

        int index = calculateIndex(key.hashCode());
        Entry<K, V> current = context[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void remove(K key) {
        if (key == null) {
            if (nullKeyEntry != null) {
                nullKeyEntry = null;
                size--;
            }
            return;
        }

        int index = calculateIndex(key.hashCode());
        Entry<K, V> current = context[index];
        Entry<K, V> previous = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    context[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    public void clear() {
        context = new Entry[DEFAULT_SIZE];
        nullKeyEntry = null; // Clear the null key entry
        size = 0;
    }

    public int size() {
        return size;
    }

    private int calculateIndex(int hashCode) {
        return Math.abs(hashCode % context.length);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        boolean first = true;

        if (nullKeyEntry != null) {
            sb.append("null=").append(nullKeyEntry.value);
            first = false;
        }

        for (Entry<K, V> entry : context) {
            while (entry != null) {
                if (!first) {
                    sb.append(", ");
                }
                sb.append(entry.toString());
                entry = entry.next;
                first = false;
            }
        }
        sb.append("}");
        return sb.toString();
    }

    static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }
    }
}
