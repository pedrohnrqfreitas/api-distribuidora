package com.distribuidorapixoca.demo.servico;

import com.distribuidorapixoca.demo.dto.CarteiraDeCigarroDTO;
import com.distribuidorapixoca.demo.model.CarteiraCigarro;

import java.util.List;

public interface CarteiraCigarroServico {
    public List<CarteiraCigarro> getAllCarteiraCigarros();
    public CarteiraDeCigarroDTO createCarteiraCigarro(CarteiraDeCigarroDTO pdt);
    public void deleteCarteiraCigarro(Long id);
    public CarteiraCigarro updateCarteiraQuant(Long quantidade, Long id);
}
