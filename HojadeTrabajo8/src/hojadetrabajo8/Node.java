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
class Node {
    Node(Comparable theKey) {
        key = theKey;
        left = right = null;
    }

    Comparable key;          // The data in the node
    Node left;         // Left child
    Node right;        // Right child
}
