package com.example.trabalhotavinho;

import model.Categoria;
import model.Produto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProdutoTest {

    @Test
    void deveCriarProdutoComAtributosCorretos() {
        Categoria categoria = new Categoria();
        categoria.setId(1L);
        categoria.setNome("Eletrônicos");

        Produto produto = new Produto();
        produto.setId(10L);
        produto.setNome("Smartphone");
        produto.setPreco(2500.0);
        produto.setCategoria(categoria);

        assertEquals(10L, produto.getId());
        assertEquals("Smartphone", produto.getNome());
        assertEquals(2500.0, produto.getPreco());
        assertNotNull(produto.getCategoria());
        assertEquals("Eletrônicos", produto.getCategoria().getNome());
    }
}
