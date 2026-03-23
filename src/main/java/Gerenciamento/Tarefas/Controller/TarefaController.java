package Gerenciamento.Tarefas.Controller;


import Gerenciamento.Tarefas.Models.TarefaModel;
import Gerenciamento.Tarefas.Service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public List<TarefaModel> listar(){
        return tarefaService.listar();
    }

    @GetMapping("/{id}")
    public TarefaModel buscar(@PathVariable long id){
        return tarefaService.buscar(id);
    }

    @PostMapping
    public TarefaModel criar(@RequestBody TarefaModel tarefaModel){
        return tarefaService.criar(tarefaModel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(long id){
        tarefaService.deletar(id);
        return ResponseEntity.noContent().build();
    }



}
