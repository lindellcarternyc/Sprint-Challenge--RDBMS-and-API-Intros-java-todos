package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todos;
import com.lambdaschool.todos.repository.TodosRepository;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Transactional
@Service(value = "todosService")
public class TodosServiceImpl implements TodosService {
    @Autowired
    TodosRepository todosRepository;

    @Transactional
    @Override
    public void markComplete(long todoid) {
        Todos todo = todosRepository.findById(todoid)
                .orElseThrow(() -> new EntityNotFoundException("Todo with id '" + todoid + "' NOT FOUND"));
        todo.setCompleted(true);
    }
}
