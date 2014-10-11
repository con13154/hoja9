/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hojadetrabajo8;

/*Modificado 10/10/2014

Por: Isa Contreras 13154
     Erick de Mata 13648
     Luis Orellana 13140

Implementacion de factory para las estructuras realziadas
*/
class WordSetFactory {
  	public static WordSet generateSet(int tipo)
	{
        
            // aqui se regresara el set empleando sus implementaciones:
			// if tipo == 2 cree una instancia para un Wordset implementao con Red Black Tree
			// if tipo == 3 cree una instancia para un Wordset implementado con Splay Tree
			// if tipo == 4 cree una instancia para un Wordset implementado con Hash table
			// if tipo == 5 cree una instancia para un Wordset implementado con TreeMap
           
	    if (tipo == 1)
		return new SimpleSet();
            if(tipo == 2)
                return new RedBlackTree();
            if(tipo == 3)
                return new SplayTree();
            if(tipo == 4)
                return new HashTable();
            if(tipo == 5)
                return new SetTreeMap();
            else
	
            return null; // modificarlo para que regrese la implementacion seleccionada
	}
}
