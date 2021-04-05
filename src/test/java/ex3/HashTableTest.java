package ex3;

import org.junit.jupiter.api.Assertions;

class HashTableTest {
    HashTable hashTable = new HashTable();

    @org.junit.jupiter.api.Test
    void count() {

        Assertions.assertEquals(hashTable.count(), 0);
        Assertions.assertEquals(0, hashTable.count());

        hashTable.put("1","1");
        Assertions.assertEquals(hashTable.count(), 1);
        Assertions.assertEquals(1, hashTable.count());

        hashTable.put("2","2");
        Assertions.assertEquals(hashTable.count(), 2);
        Assertions.assertEquals(2, hashTable.count());
        System.out.println(hashTable.count());


        hashTable.put("3","3");
        Assertions.assertEquals(hashTable.count(), 3);
        Assertions.assertEquals(3, hashTable.count());

        hashTable.drop("1");
        Assertions.assertEquals(hashTable.count(), 2);
        System.out.println(hashTable.count());
    }

    @org.junit.jupiter.api.Test
    void put() {
        hashTable.put("0", "");
        hashTable.put("1", "1");
        hashTable.put("2", "2");
        hashTable.put("", "3");
        hashTable.put("4", "4");
        hashTable.put("5", "5");
        hashTable.put("6", "6");
        hashTable.put("7", "7");
        hashTable.put("8", "..............................................................");
        hashTable.put("9", "9");
        hashTable.put("10","10");
        System.out.println(hashTable.toString());

        hashTable.put("11","Original");
        System.out.println(hashTable.toString());

        hashTable.put("11","SobreEscrito");
        System.out.println(hashTable.toString());

    }

    @org.junit.jupiter.api.Test
    void get() {

        hashTable.put("1", "1");
        hashTable.put("2", "2");
        hashTable.put("3", "");
        hashTable.put("4", null);
        hashTable.put("5", "╠╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╠╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬");
        System.out.println(hashTable.toString());

        Assertions.assertEquals("1", hashTable.get("1"));
        Assertions.assertEquals("2", hashTable.get("2"));
        Assertions.assertEquals("", hashTable.get("3"));

        Assertions.assertEquals(null, hashTable.get("4"));

        Assertions.assertEquals("╠╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╠╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬", hashTable.get("5"));
    }

    @org.junit.jupiter.api.Test
    void drop() {

        hashTable.put("1", "1");
        hashTable.put("2", "2");
        hashTable.put("3", "3");
        hashTable.put("4", "╠╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╠╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬╬");
        hashTable.put("5", "5");
        hashTable.put("6", "");
        hashTable.put("7", null);
        hashTable.put("8", "8");

        System.out.println(hashTable.toString());

        hashTable.drop("4");
        hashTable.drop("6");
        hashTable.drop("7");
        hashTable.drop("8");

        System.out.println(hashTable.toString());
    }
}