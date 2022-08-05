package com.distribuidorapixoca.demo.controlador;

import com.distribuidorapixoca.demo.dto.CarteiraDeCigarroDTO;
import com.distribuidorapixoca.demo.model.CarteiraCigarro;
import com.distribuidorapixoca.demo.servico.Aimpl.CarteiraCigarroServicoImpl;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/carteiracigarro")
public class CarteiraCigarroControler {

    private CarteiraCigarroServicoImpl carteiraCigarroServico;
    public CarteiraCigarroControler(CarteiraCigarroServicoImpl carteiraCigarroServico){
        this.carteiraCigarroServico = carteiraCigarroServico;
    }

    @GetMapping("/all")
    public List<CarteiraDeCigarroDTO> getAllCarteiraCigarro(){
        List<CarteiraCigarro> carteiraCigarros = carteiraCigarroServico.getAllCarteiraCigarros();
        return carteiraCigarros.stream().map(carteiraCigarro -> new CarteiraDeCigarroDTO(carteiraCigarro)).collect(Collectors.toList());
    }

    @PostMapping("/create-carteiracigarro")
    public CarteiraDeCigarroDTO createCarteiraCigarro(@RequestBody CarteiraDeCigarroDTO pdt){
        return carteiraCigarroServico.createCarteiraCigarro(pdt);
    }

    @DeleteMapping("/delete-pod/{id}")
    public void deleteCarteiraCigarro(@PathVariable Long id){
        carteiraCigarroServico.deleteCarteiraCigarro(id);
    }

    @PutMapping("/update-pod/{id}/{quantidade}")
    public CarteiraCigarro updateCarteiraCigarro(@PathVariable Long id,@PathVariable Long quantidade){
        return carteiraCigarroServico.updateCarteiraQuant(quantidade,id);
    }
}
