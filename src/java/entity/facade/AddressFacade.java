/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.facade;

import entity.Address;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author bobmastrolilli
 */
@Stateless
public class AddressFacade extends AbstractFacade<Address>
{
    @PersistenceContext(unitName = "AppStockPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager()
    {
        return em;
    }

    public AddressFacade()
    {
        super(Address.class);
    }
    
}
