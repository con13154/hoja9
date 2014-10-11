

package hojadetrabajo8;
import java.util.ArrayList;

/*Modificado 10/10/2014

Por: Isa Contreras 13154
     Erick de Mata 13648
     Luis Orellana 13140

Implementacion de estructura Simple set
*/

public class SimpleSet implements WordSet{
    
    private final ArrayList<Word> base = new ArrayList<Word>();
               
    @Override
        public Word get(Word word)
        {
                int index = base.indexOf(word);
                if(index == -1) return null;
                return base.get(index);
        }
        
    @Override
        public void add(Word wordObject)
        {
                base.add(wordObject);
        }
}
