/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rene.control;

import java.util.ArrayList;
import br.com.rene.model.pojo.ClienteFornecedor;

/**
 *
 * @author PLASMAT
 */
public class ClienteFornecedorControle {
    
    private ArrayList<ClienteFornecedor> lista;
    private static ClienteFornecedorControle instaciaRep;
    
    private ClienteFornecedorControle() {
        this.lista = new ArrayList<>();
    }
    
    private static ClienteFornecedorControle obterInstacia(){
        if (instaciaRep == null) {
             instaciaRep = new ClienteFornecedorControle();
        }
        return instaciaRep;
    }
    
    public ArrayList<ClienteFornecedor> listarTodos(){
        return this.lista;
    }
    
    public void Inserir (ClienteFornecedor clifor) throws Exception {
        if (clifor == null) {
            throw new Exception("O cliente fornecedor não foi instanciado");
        }
        if (clifor.getCpfcnpj() == null) {
            throw new Exception("O cliente fornecedor não foi instanciado");
        }
        if (clifor.getCpfcnpj().trim().equals("")) {
            throw new Exception("O campo CPF/CNPJ é obrigatório");
        }
        if (clifor.getRazaoSocial() == null) {
            throw new Exception("O cliente fornecedor não foi instanciado");
        }
        if (clifor.getRazaoSocial().trim().equals("")) {
            throw new Exception("O campo CPF/CNPJ é obrigatório");
        }
        if (this.VerificarExistencia(clifor) >= 0) {
            throw new Exception("O registro já existe");
        }
        this.lista.add(clifor);
    }
    
    public void Atualizar (ClienteFornecedor clifor) throws Exception {
        
    }
    
    public void Excluir (ClienteFornecedor clifor) throws Exception {
        
    }
    
    public int VerificarExistencia (ClienteFornecedor clifor) {
        int retorno = -1;
        for (int i = 0; i < this.lista.size(); i++) {
            if (clifor.getCpfcnpj().trim().equals(this.lista.get(i).getCpfcnpj().trim())) {
               retorno = i;
               break;
            }
            return retorno;
        }
        return 1 ;
    }
}
