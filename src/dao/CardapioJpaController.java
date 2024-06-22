/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaQuery;
import model.Cardapio;

/**
 *
 * @author Thiago
 */
public class CardapioJpaController implements Serializable {
    
    public CardapioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public void create(Cardapio cardapio) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(cardapio);
        em.getTransaction().commit();
        em.close();
    }
    
    public void edit(Cardapio cardapio) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(cardapio);
        em.getTransaction().commit();
        em.close();
    }
    public void remove(Cardapio cardapio) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.merge(cardapio));
        em.getTransaction().commit();
        em.close();
    }
    
    public Cardapio find(Object id) {
        EntityManager em = emf.createEntityManager();
        Cardapio cardapio = em.find(Cardapio.class, id);
        em.close();
        return cardapio;
    }
    
    public List<Cardapio> findAll() {
        EntityManager em = emf.createEntityManager();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Cardapio.class));
        List<Cardapio> result = em.createQuery(cq).getResultList();
        em.close();
        return result;
    }
    
    public List<Cardapio> findRange(int[] range) {
        EntityManager em = emf.createEntityManager();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Cardapio.class));
        javax.persistence.Query q = em.createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        List<Cardapio> result = q.getResultList();
        em.close();
        return result;
    }
    
    public int count() {
        EntityManager em = emf.createEntityManager();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<Cardapio> rt = cq.from(Cardapio.class);
        cq.select(em.getCriteriaBuilder().count(rt));
        javax.persistence.Query q = em.createQuery(cq);
        int count = ((Long) q.getSingleResult()).intValue();
        em.close();
        return count;
    }
    
}
