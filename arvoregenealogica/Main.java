/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoregenealogica;

public class Main {
    public static void main(String args[]) {
        // AVOS PATERNOS
        Pessoa joaoBatista = new Pessoa ("José Pereira", null, null);
        Pessoa candida = new Pessoa ("Sebastiana", null, null);
        // PAI
        Pessoa clemente = new Pessoa ("Ascânio", candida, joaoBatista);
        // AVOS MATERNOS
        Pessoa alaor = new Pessoa ("Antônio", null, null);
        Pessoa geralda = new Pessoa ("Maria", null, null);
        // MAE
        Pessoa luciana = new Pessoa ("Sirlene", geralda, alaor);
        // FILHOS
        Pessoa carol = new Pessoa ("Danielle", luciana, clemente);
        Pessoa caio = new Pessoa ("Diego", luciana, clemente);
        
        System.out.println(clemente.equals(clemente));
        System.out.println(caio.saoIrmaos(carol));
        System.out.println(caio.eAntecessor(clemente));
        System.out.println(caio.eAntecessor(luciana));
        System.out.println(caio.eAntecessor(geralda));
        System.out.println(carol.eAntecessor(alaor));
        System.out.println(carol.eAntecessor(joaoBatista));
        System.out.println(carol.eAntecessor(candida));
    }
}
