package com.distribuidorapixoca.demo.controlador;

import com.distribuidorapixoca.demo.dto.CarteiraDeCigarroDTO;
import com.distribuidorapixoca.demo.model.CarteiraCigarro;
import com.distribuidorapixoca.demo.servico.CarteiraCigarroServico;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/carteiracigarro")
public class CarteiraCigarroControler {

    private CarteiraCigarroServico carteiraCigarroServico;
    public CarteiraCigarroControler(CarteiraCigarroServico carteiraCigarroServico){
        this.carteiraCigarroServico = carteiraCigarroServico;
    }

    @GetMapping("/all")
    public List<CarteiraCigarro> getAllCarteiraCigarro(){
        List<CarteiraCigarro> carteiraCigarros = new ArrayList<>();
        carteiraCigarros = carteiraCigarroServico.getAllCarteiraCigarros();
        return carteiraCigarros;
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
