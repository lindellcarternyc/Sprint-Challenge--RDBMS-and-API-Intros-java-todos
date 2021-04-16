package com.lambdaschool.todos.services;

import org.apache.commons.lang3.NotImplementedException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "todosService")
public class TodosServiceImpl implements TodosService{
    @Transactional
    @Override
    public void markComplete(long todoid) {
        throw new NotImplementedException("THIS IS NOT IMPLEMENTED");
    }
}
