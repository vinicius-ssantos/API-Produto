package br.com.apiproduto.controller;


import br.com.apiproduto.entity.Produto;
import br.com.apiproduto.service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {


    // Injeção de dependência
    private final ProdutoService produtoService;

    // injetando a dependência no construtor
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public ResponseEntity<List<Produto>> buscarTodos() {
        return ResponseEntity.ok(produtoService.buscarTodos());
    }


    @PostMapping
    public ResponseEntity<Produto> salvar(@RequestBody Produto produto) {
        var novoProduto = produtoService.salvar(produto);
        return new ResponseEntity<>(novoProduto, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        produtoService.deletar(id);
        return  ResponseEntity.ok().build();
    }
}
