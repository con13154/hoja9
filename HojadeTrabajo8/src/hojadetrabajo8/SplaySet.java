/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hojadetrabajo8;

/**
 *
 * @author E. de Mata
 */
public class SplaySet implements WordSet{
    WSplayBST<Word> rbTree = new WSplayBST<Word>();
        @Override
        public void add(Word wordObject) {
                rbTree.add(wordObject);         
        }

        @Override
        public Word get(Word word) {
                return rbTree.get(word);
        }
}
