package Gerenciamento.Tarefas.Service;

import Gerenciamento.Tarefas.Models.TarefaModel;
import Gerenciamento.Tarefas.Repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public List<TarefaModel> listar(){
        return tarefaRepository.findAll();
    }

    public TarefaModel buscar(long id){
        return tarefaRepository.findById(id).get();
    }

    public TarefaModel criar(TarefaModel tarefaModel){
        return tarefaRepository.save(tarefaModel);
    }

    public void deletar(long id){
        tarefaRepository.deleteById(id);
    }



}
