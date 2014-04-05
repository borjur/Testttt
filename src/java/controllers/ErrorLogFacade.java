/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.ErrorLog;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Agape
 */
@Stateless
public class ErrorLogFacade extends AbstractFacade<ErrorLog> {
    @PersistenceContext(unitName = "TesttttPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ErrorLogFacade() {
        super(ErrorLog.class);
    }
    
}
