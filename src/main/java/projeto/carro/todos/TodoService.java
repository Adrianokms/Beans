package projeto.carro.todos;


import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository repository;

    public TodoService(TodoRepository todoRepository){
        this.repository = todoRepository;
    }

    public TodoEntity salvar(TodoEntity novoTodo){
        return repository.save(novoTodo);
    }

    public void atualizarSttatus(TodoEntity todo){
        repository.save(todo);
    }

    public TodoEntity buscarPorID(Integer id){
        return repository.findById(id).orElse(null);
    }
}
