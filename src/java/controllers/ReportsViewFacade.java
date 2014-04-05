/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.ReportsView;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Agape
 */
@Stateless
public class ReportsViewFacade extends AbstractFacade<ReportsView> {
    @PersistenceContext(unitName = "TesttttPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ReportsViewFacade() {
        super(ReportsView.class);
    }
    
}
