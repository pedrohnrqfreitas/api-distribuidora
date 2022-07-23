package com.distribuidorapixoca.demo.controlador;

import com.distribuidorapixoca.demo.dto.PodDTO;
import com.distribuidorapixoca.demo.model.Pod;
import com.distribuidorapixoca.demo.servico.impl.PodServicoImpl;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Api/pods")
public class PodControlador {

    private PodServicoImpl podServico;
    public PodControlador(PodServicoImpl podServico) {
        this.podServico = podServico;
    }

    @GetMapping("/all")
    public List<Pod> getAllpods(){
        List<Pod> pods = new ArrayList<>();
        pods = podServico.getAllPod();
        return pods;
    }

    @PostMapping("/create-pod")
    public PodDTO createPod(@RequestBody PodDTO pdt) {
        return podServico.createPod(pdt);
    }

    @DeleteMapping("/delete-pod/{id}")
    public void deletePod(@PathVariable Long id){
        podServico.deletepod(id);
    }

    @PutMapping("/update-pod/{id}/{quantidade}")
    public Pod updatePod(@PathVariable Long id, @PathVariable Long quantidade){
        return podServico.updatePodQuant(quantidade,id);
    }

}
