package com.example.trabalhotavinho;

import model.Categoria;
import model.Produto;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CategoriaTest {

    @Test
    void deveCriarCategoriaComAtributosCorretos() {
        Categoria categoria = new Categoria();
        categoria.setId(1L);
        categoria.setNome("Eletrônicos");

        List<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto();
        produto1.setId(10L);
        produto1.setNome("Smartphone");
        produto1.setPreco(2500.0);
        produto1.setCategoria(categoria);

        Produto produto2 = new Produto();
        produto2.setId(11L);
        produto2.setNome("Notebook");
        produto2.setPreco(4500.0);
        produto2.setCategoria(categoria);

        produtos.add(produto1);
        produtos.add(produto2);

        categoria.setProdutos(produtos);

        assertEquals(1L, categoria.getId());
        assertEquals("Eletrônicos", categoria.getNome());

        assertNotNull(categoria.getProdutos());
        assertEquals(2, categoria.getProdutos().size());

        assertEquals("Smartphone", categoria.getProdutos().get(0).getNome());
        assertEquals("Notebook", categoria.getProdutos().get(1).getNome());

        // Verifica se o relacionamento bidirecional está ok
        assertEquals(categoria, categoria.getProdutos().get(0).getCategoria());
        assertEquals(categoria, categoria.getProdutos().get(1).getCategoria());
    }
}
