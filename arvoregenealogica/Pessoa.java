/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoregenealogica;

public class Pessoa {

    private String nome;
    private Pessoa mae;
    private Pessoa pai;

    public Pessoa(String nome, Pessoa mae, Pessoa pai) {
        this.nome = nome;
        this.mae = mae;
        this.pai = pai;
    }

    public boolean equals(Pessoa pessoa) {
        String meuNome = this.nome;
        Pessoa minhaMae = this.mae;
        if (pessoa.nome.equals(meuNome) == true && pessoa.mae == minhaMae) {
            return true;
        } else {
            return false;
        }
    }

    public boolean saoIrmaos(Pessoa pessoa) {
        Pessoa meuPai = this.pai;
        Pessoa minhaMae = this.mae;
        if (pessoa.mae == minhaMae || pessoa.pai == meuPai) {
            return true;
        } else {
            return false;
        }
    }

    private boolean ePai(Pessoa pessoa) {
        Pessoa meuPai = this.pai;
        if (pessoa == meuPai) {
            return true;
        } else {
            return false;
        }
    }

    private boolean eMae(Pessoa pessoa) {
        Pessoa minhaMae = this.mae;
        if (pessoa == minhaMae) {
            return true;
        } else {
            return false;
        }
    }

    private boolean eAvoMaterna(Pessoa pessoa) {
        Pessoa minhaMae = this.mae;
        Pessoa minhaAvoMaterna = minhaMae.mae;
        if (pessoa == minhaAvoMaterna) {
            return true;
        } else {
            return false;
        }
    }

    private boolean eAvoMaterno(Pessoa pessoa) {
        Pessoa minhaMae = this.mae;
        Pessoa meuAvoMaterno = minhaMae.pai;
        if (pessoa == meuAvoMaterno) {
            return true;
        } else {
            return false;
        }
    }

    private boolean eAvoPaterna(Pessoa pessoa) {
      Pessoa meuPai = this.pai;
        Pessoa minhaAvoPaterna = meuPai.mae;
        if (pessoa == minhaAvoPaterna) {
            return true;
        } else {
            return false;
        }
    }

    private boolean eAvoPaterno(Pessoa pessoa) {
       Pessoa meuPai = this.pai;
        Pessoa meuAvoPaterno = meuPai.pai;
        if (pessoa == meuAvoPaterno) {
            return true;
        } else {
            return false;
        }
    }

    public boolean eAntecessor(Pessoa pessoa) {
        // pessoa == jose; this == diego
        if (this.eMae(pessoa) == true
                || this.ePai(pessoa) == true
                || this.eAvoMaterna(pessoa) == true
                || this.eAvoMaterno(pessoa) == true
                || this.eAvoPaterna(pessoa) == true
                || this.eAvoPaterno(pessoa) == true) {
            return true;
        } else {
            return false;
        }
    }
}
