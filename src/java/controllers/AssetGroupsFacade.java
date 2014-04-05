/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.AssetGroups;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Boris
 */
@Stateless
public class AssetGroupsFacade extends AbstractFacade<AssetGroups> {
    @PersistenceContext(unitName = "TesttttPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AssetGroupsFacade() {
        super(AssetGroups.class);
    }
    
}
