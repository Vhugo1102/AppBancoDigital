package br.com.bancodigital.controller;

import java.util.List;

import br.com.bancodigital.DAO.SeguroDAO;
import br.com.bancodigital.model.SeguroFraude;
import br.com.bancodigital.model.SeguroViagem;

public class SeguroController {
    private SeguroDAO seguroDAO;

    public SeguroController(SeguroDAO seguroDAO) {
        this.seguroDAO = seguroDAO;
    }

    public void contratarSeguroViagem(SeguroViagem seguro) {
        seguroDAO.contratarSeguroViagem(seguro);
    }

    public void contratarSeguroFraude(SeguroFraude seguro) {
        seguroDAO.contratarSeguroFraude(seguro);
    }

    public void cancelarSeguro(int numeroApolice) {
        seguroDAO.cancelarSeguro(numeroApolice);
    }

    public SeguroViagem buscarSeguroViagem(int numeroApolice) {
        return seguroDAO.buscarSeguroViagem(numeroApolice);
    }

    public SeguroFraude buscarSeguroFraude(int numeroApolice) {
        return seguroDAO.buscarSeguroFraude(numeroApolice);
    }

    public List<SeguroViagem> listarSegurosViagem() {
        return seguroDAO.listarSegurosViagem();
    }

    public List<SeguroFraude> listarSegurosFraude() {
        return seguroDAO.listarSegurosFraude();
    }
}
