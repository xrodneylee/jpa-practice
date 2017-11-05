package org.guanpu.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.guanpu.demo.entity.TodoList;

public class App 
{
    public static void main( String[] args )
    {
    	TodoList todoList = new TodoList();
    	todoList.setItem("skyport");
    	todoList.setDetail("cache bug");
    	System.out.println("==================" + todoList.getItem());
    	EntityManager em = Persistence.createEntityManagerFactory("org.guanpu.demo.jpa").createEntityManager();
    	em.getTransaction().begin();
    	em.persist(todoList);
    	em.getTransaction().commit();
    	
//    	todoList = findById(new Long(2));
//    	System.out.println(todoList.getItem());
    }
    
    private static TodoList findById(Long id) {
    	EntityManager em = Persistence.createEntityManagerFactory("org.guanpu.demo.jpa").createEntityManager();
        EntityTransaction etx = em.getTransaction();
        etx.begin();
        TodoList todolist = em.find(TodoList.class, id);
        etx.commit();
        em.close();              
        return todolist;
    }
}
