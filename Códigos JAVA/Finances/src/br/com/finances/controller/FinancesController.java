package br.com.finances.controller;

import br.com.finances.dao.FinancesDao;
import br.com.finances.model.Finances;

public class FinancesController {
    private Finances obrigacao;
    private FinancesDao dao;
    
    public FinancesController(){
        dao = new FinancesDao();
        novo();
    }
    
    public void novo(){
        setObrigacao(new Finances());
    }
    
    public Finances getObrigacao() {
        return obrigacao;
    }

    public void setObrigacao(Finances obrigacao) {
        this.obrigacao = obrigacao;
    }
    
    public void salvar(){
        dao.create(obrigacao);
        novo();
    }
}
