package additionalTask;

public class SimpleHashtable{
        private static final int TABLE_SIZE = 100; // Size of the underlying array
        private final Object[] table = new Object[TABLE_SIZE];

        // Hashing function
        private int hashFunction(String key) {
            // Your custom hashing logic here
            return key.hashCode() % TABLE_SIZE;
        }

        // Method to insert data
        public void insert(String key, Object value) {
            int index = hashFunction(key);
            table[index] = value;
        }

        // Other methods can go here

        public static void main(String[] args) {
            SimpleHashtable hashtable = new SimpleHashtable();
            hashtable.insert("name", "John");
            hashtable.insert("age", 25);
            // ...
        }
    }

