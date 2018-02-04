/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.facade;

import entity.CustomerGroup;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author bobmastrolilli
 */
@Stateless
public class CustomerGroupFacade extends AbstractFacade<CustomerGroup>
{
    @PersistenceContext(unitName = "AppStockPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager()
    {
        return em;
    }

    public CustomerGroupFacade()
    {
        super(CustomerGroup.class);
    }
    
}
