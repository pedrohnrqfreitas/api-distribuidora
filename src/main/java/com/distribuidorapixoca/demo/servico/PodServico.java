package com.distribuidorapixoca.demo.servico;

import com.distribuidorapixoca.demo.dto.PodDTO;
import com.distribuidorapixoca.demo.model.Pod;

import java.util.List;

public interface PodServico {
    public List<Pod> getAllPod();
    public PodDTO createPod(PodDTO pdt);
    public void deletepod(Long id);
    public Pod updatePodQuant(Long quantidade, Long id);
}
