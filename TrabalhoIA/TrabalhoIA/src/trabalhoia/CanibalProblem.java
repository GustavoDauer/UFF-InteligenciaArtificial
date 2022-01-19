/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalhoia;

/**
 *
 * @author gustavo
 */
public class CanibalProblem implements Problem {

    public String result = "";
    
    @Override
    public int rules(Element element) {
        // Rule 1
        if(element.node[0] == 1) {
            return 1;
        }
        
        // Rule 2
        if(element.node[0] == 1) {
            return 2;
        }
        
        return 0;
    }
    
}
