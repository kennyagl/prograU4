package hashtable;

import unidad4.ordenamiento.Documento;

/**
 *
 * @author Kenny
 */
public class HashEntry {

    private String key;
    private Documento value;
    private HashEntry next;

    public HashEntry(String key, Documento value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Documento getValue() {
        return value;
    }

    public HashEntry getNext() {
        return next;
    }

    public void setNext(HashEntry next) {
        this.next = next;
    }

}
