package com.distribuidorapixoca.demo.servico;

import com.distribuidorapixoca.demo.dto.PodDTO;
import com.distribuidorapixoca.demo.model.Pod;
import com.distribuidorapixoca.demo.repositorio.PodRepositorio;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PodServico {

    private PodRepositorio podRepositorio;

    public PodServico(PodRepositorio podRepositorio) {
        this.podRepositorio = podRepositorio;
    }

    public List<Pod> getAllPod() {
        List<Pod> pods = podRepositorio.findAll();
        return pods;
    }

    public PodDTO createPod(PodDTO pdt) {
        Pod podEntidade = new Pod();
        podEntidade.setPreco(pdt.getPreco());
        podEntidade.setDescartavel(pdt.getIsDescartavel());
        podEntidade.setPuffs(pdt.getPuffs());
        podEntidade.setSabor(pdt.getSabor());
        podEntidade.setMarca(pdt.getMarca());
        podEntidade.setNome(pdt.getNome());
        podEntidade.setQuantidade(pdt.getQuantidade());

        podRepositorio.save(podEntidade);
        return pdt;
    }
    public void deletepod(Long id){
        podRepositorio.deleteById(id);
    }

    public Pod updatePodQuant(Long quantidade, Long id){
        Optional<Pod> pod = podRepositorio.findById(id);
        Pod podNovo = new Pod();
        if(!pod.isEmpty()){
            podNovo.setQuantidade(quantidade);
            podNovo.setId(id);
            podNovo.setMarca(pod.get().getMarca());
            podNovo.setPreco(pod.get().getPreco());
            podNovo.setPuffs(pod.get().getPuffs());
            podNovo.setNome(pod.get().getNome());
            podNovo.setSabor(pod.get().getSabor());
            podNovo.setDescartavel(pod.get().isDescartavel());
            podRepositorio.save(podNovo);
        }
        return podNovo;
    }



}
