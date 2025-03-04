package br.com.bancodigital.DAO;

import br.com.bancodigital.model.SeguroViagem;
import br.com.bancodigital.model.SeguroFraude;

import java.util.ArrayList;
import java.util.List;

public class SeguroDAO {
    private List<SeguroViagem> segurosViagem;
    private List<SeguroFraude> segurosFraude;

    public SeguroDAO() {
        this.segurosViagem = new ArrayList<>();
        this.segurosFraude = new ArrayList<>();
    }

    public void contratarSeguroViagem(SeguroViagem seguro) {
        segurosViagem.add(seguro);
    }

    public void contratarSeguroFraude(SeguroFraude seguro) {
        segurosFraude.add(seguro);
    }

    public void cancelarSeguro(int numeroApolice) {
        segurosViagem.removeIf(seguro -> seguro.getNumeroApolice() == numeroApolice);
        segurosFraude.removeIf(seguro -> seguro.getNumeroApolice() == numeroApolice);
    }

    public SeguroViagem buscarSeguroViagem(int numeroApolice) {
        for (SeguroViagem seguro : segurosViagem) {
            if (seguro.getNumeroApolice() == numeroApolice) {
                return seguro;
            }
        }
        return null;
    }

    public SeguroFraude buscarSeguroFraude(int numeroApolice) {
        for (SeguroFraude seguro : segurosFraude) {
            if (seguro.getNumeroApolice() == numeroApolice) {
                return seguro;
            }
        }
        return null;
    }

    public List<SeguroViagem> listarSegurosViagem() {
        return segurosViagem;
    }

    public List<SeguroFraude> listarSegurosFraude() {
        return segurosFraude;
    }
}