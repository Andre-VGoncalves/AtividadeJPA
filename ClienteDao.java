package br.com.crud.dao;
 
import br.com.crud.model.Cliente;
import javax.persistence.EntityManager;
 
public class ClienteDao {
    
   private EntityManager em;
   
   public ClienteDao(EntityManager em){
       this.em = em;
   }
   
   public void salvarCliente(Cliente cli){
       em.getTransaction().begin();
       em.persist(cli);
       em.getTransaction().commit();
   }
   
   public Cliente buscarCliente(int id){
       return this.em.find(Cliente.class, id);
   }
   
   public void excluirCliente(int id){
       this.em.remove(id);
   }
   
   
}