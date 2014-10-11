
package hojadetrabajo8;
import java.util.*;

/*Modificado 10/10/2014

Por: Isa Contreras 13154
     Erick de Mata 13648
     Luis Orellana 13140

Implementacion de estructura HashTable mediante HashMap de JCF
*/

class HashTable implements WordSet{
    private HashMap<String,String> hash = new HashMap();
   
    @Override
    public void add(Word wordObject) {
        hash.put(wordObject.getWord(),wordObject.getType());
    }

    @Override
    public Word get(Word word) {
        if(!hash.containsKey(word.getWord())){
            return null;
        }
        return new Word(word.getWord(),hash.get(word.getWord()));
    }
}
       
