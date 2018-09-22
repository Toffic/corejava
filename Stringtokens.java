/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.StringTokenizer;

/**
 *
 * @author Pro
 */
public class Stringtokens {
    public static void main(String[] args) {
        String para = "this is about to be seperated by the string tokenizer method pretty quick watch and learn";
        
        StringTokenizer st=new StringTokenizer(para," ");
        while(st.hasMoreTokens()){
            String tokens = st.nextToken();
            System.out.println(tokens);
        }
    }
    
}
