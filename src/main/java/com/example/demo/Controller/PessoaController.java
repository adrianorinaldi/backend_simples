package com.example.demo.Controller;

import com.example.demo.Entity.PessoaEntity;
import com.example.demo.Service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin({"*"})
@RestController
@RequestMapping({"/"})
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping({"/teste_conexao"})
    public ResponseEntity<String> testeConexao() {
        return ResponseEntity.status(HttpStatus.OK).body("deu tudo certinhoo");
    }
    @GetMapping({"/buscar_todas"})
    public ResponseEntity<List<PessoaEntity>> buscarTodasContas() {
        return ResponseEntity.status(HttpStatus.OK).body(this.pessoaService.buscarTodos());
    }

}
