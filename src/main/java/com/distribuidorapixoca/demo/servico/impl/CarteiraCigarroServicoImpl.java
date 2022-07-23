package com.distribuidorapixoca.demo.servico.impl;

import com.distribuidorapixoca.demo.builder.CarteiraCigarroBuilder;
import com.distribuidorapixoca.demo.dto.CarteiraDeCigarroDTO;
import com.distribuidorapixoca.demo.model.CarteiraCigarro;
import com.distribuidorapixoca.demo.repositorio.CarteiraDeCigarroRepositorio;
import com.distribuidorapixoca.demo.servico.CarteiraCigarroServico;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarteiraCigarroServicoImpl implements CarteiraCigarroServico {

    private CarteiraDeCigarroRepositorio carteiraDeCigarroRepositorio;

    public CarteiraCigarroServicoImpl(CarteiraDeCigarroRepositorio carteiraDeCigarroRepositorio){
        this.carteiraDeCigarroRepositorio = carteiraDeCigarroRepositorio;
    }

    public List<CarteiraCigarro> getAllCarteiraCigarros(){
        List<CarteiraCigarro> carteiraCigarros = carteiraDeCigarroRepositorio.findAll();
        return carteiraCigarros;
    }

    public CarteiraDeCigarroDTO createCarteiraCigarro(CarteiraDeCigarroDTO pdt){
        CarteiraCigarro carteiraCigarroEntidade = CarteiraCigarroBuilder.builder().withMarca(pdt.getMarca()).withNome(pdt.getNome()).withQuantidade(pdt.getQuantidade()).withUnidade(pdt.getUnidade()).withPreco(pdt.getPreco()).build();
        carteiraDeCigarroRepositorio.save(carteiraCigarroEntidade);
        return pdt;
    }

    public void deleteCarteiraCigarro(Long id){
        carteiraDeCigarroRepositorio.deleteById(id);
    }

    public CarteiraCigarro updateCarteiraQuant(Long quantidade, Long id){
        Optional<CarteiraCigarro> carteiraCigarro = carteiraDeCigarroRepositorio.findById(id);
        CarteiraCigarro carteiraCigarroNovo = new CarteiraCigarro();
        if(carteiraCigarro.isPresent()){
            carteiraCigarroNovo = carteiraCigarro.get();
            carteiraCigarroNovo.setQuantidade(quantidade);
            carteiraDeCigarroRepositorio.save(carteiraCigarroNovo);
        }
        return carteiraCigarroNovo;
    }

}
