package com.distribuidorapixoca.demo.servico;

import com.distribuidorapixoca.demo.dto.CarteiraDeCigarroDTO;
import com.distribuidorapixoca.demo.dto.CategoriaListDTO;
import com.distribuidorapixoca.demo.model.CarteiraCigarro;
import com.distribuidorapixoca.demo.repositorio.CarteiraDeCigarroRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarteiraCigarroServico {

    private CarteiraDeCigarroRepositorio carteiraDeCigarroRepositorio;

    public CarteiraCigarroServico(CarteiraDeCigarroRepositorio carteiraDeCigarroRepositorio){
        this.carteiraDeCigarroRepositorio = carteiraDeCigarroRepositorio;
    }

    public List<CarteiraCigarro> getAllCarteiraCigarros(){
        List<CarteiraCigarro> carteiraCigarros = carteiraDeCigarroRepositorio.findAll();
        return carteiraCigarros;
    }

    public CarteiraDeCigarroDTO createCarteiraCigarro(CarteiraDeCigarroDTO pdt){
        CarteiraCigarro carteiraCigarroEntidade = new CarteiraCigarro();
        carteiraCigarroEntidade.setPreco(pdt.getPreco());
        carteiraCigarroEntidade.setUnidade(pdt.getUnidade());
        carteiraCigarroEntidade.setQuantidade(pdt.getQuantidade());
        carteiraCigarroEntidade.setNome(pdt.getNome());
        carteiraCigarroEntidade.setMarca(pdt.getMarca());
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
