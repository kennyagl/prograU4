package hashtable;

import unidad4.ordenamiento.Documento;

/**
 *
 * @author Kenny
 */
public class DocHashTable {

    private final Integer SIZE = 1000;

    HashEntry[] tabla = new HashEntry[SIZE];

    public void put(Documento value) {
        int posicion = hash(value.getIdentificador());

        HashEntry newEntry = new HashEntry(value.getIdentificador(), value);
        newEntry.setNext(null);

        if (tabla[posicion] == null) {
            //no tengo colision
            tabla[posicion] = newEntry;
        } else {
            //tengo colision
            HashEntry aux = tabla[posicion];
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }

            aux.setNext(newEntry);

        }
    }

    public Documento get(String identificador) {

        int posicion = hash(identificador);
        HashEntry aux = tabla[posicion];
        if (aux == null) {
            return null;
        } else {
            while (aux != null) {
                if (aux.getValue().getIdentificador().equals(identificador)) {
                    return aux.getValue();
                }
                aux = aux.getNext();
            }
            return null;
        }

    }

    public void remove(int key) {

    }

    public int hash(String identificador) {

        int aux = identificador.hashCode();
        //System.out.println("aux: " + aux);

        int hash = aux % SIZE;
        hash = Math.abs(hash);

        //System.out.println("hash: " + hash);
        return hash;

    }

    public static void main(String[] args) {
        DocHashTable hashTable = new DocHashTable();

        Documento doc1 = new Documento(89, "Libro1");
        Documento doc2 = new Documento(89, "Libro2");
        Documento doc3 = new Documento(91, "Libro3");
        Documento doc4 = new Documento(92, "Libro4");

        hashTable.put(doc1);
        hashTable.put(doc2);
        hashTable.put(doc3);
        hashTable.put(doc4);

        System.out.println(hashTable.get(doc1.getIdentificador()));
        System.out.println(hashTable.get(doc2.getIdentificador()));
        System.out.println(hashTable.get(doc3.getIdentificador()));
        System.out.println(hashTable.get(doc4.getIdentificador()));

    }

}
