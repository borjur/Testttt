/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Assetlocation;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Boris
 */
@Stateless
public class AssetlocationFacade extends AbstractFacade<Assetlocation> {
    @PersistenceContext(unitName = "TesttttPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AssetlocationFacade() {
        super(Assetlocation.class);
    }
    
}
