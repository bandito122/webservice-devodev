/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bobmastrolilli
 */
@Entity
@Table(name = "address")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Address.findAll", query = "SELECT a FROM Address a"),
    @NamedQuery(name = "Address.findByAddressId", query = "SELECT a FROM Address a WHERE a.addressId = :addressId"),
    @NamedQuery(name = "Address.findByCustomerId", query = "SELECT a FROM Address a WHERE a.customerId = :customerId"),
    @NamedQuery(name = "Address.findByFirstname", query = "SELECT a FROM Address a WHERE a.firstname = :firstname"),
    @NamedQuery(name = "Address.findByLastname", query = "SELECT a FROM Address a WHERE a.lastname = :lastname"),
    @NamedQuery(name = "Address.findByCompany", query = "SELECT a FROM Address a WHERE a.company = :company"),
    @NamedQuery(name = "Address.findByAddress1", query = "SELECT a FROM Address a WHERE a.address1 = :address1"),
    @NamedQuery(name = "Address.findByAddress2", query = "SELECT a FROM Address a WHERE a.address2 = :address2"),
    @NamedQuery(name = "Address.findByCity", query = "SELECT a FROM Address a WHERE a.city = :city"),
    @NamedQuery(name = "Address.findByPostcode", query = "SELECT a FROM Address a WHERE a.postcode = :postcode"),
    @NamedQuery(name = "Address.findByCountryId", query = "SELECT a FROM Address a WHERE a.countryId = :countryId"),
    @NamedQuery(name = "Address.findByZoneId", query = "SELECT a FROM Address a WHERE a.zoneId = :zoneId")
})
public class Address implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "address_id")
    private Integer addressId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "customer_id")
    private int customerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "firstname")
    private String firstname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "lastname")
    private String lastname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "company")
    private String company;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "address_1")
    private String address1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "address_2")
    private String address2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "postcode")
    private String postcode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "country_id")
    private int countryId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "zone_id")
    private int zoneId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "custom_field")
    private String customField;

    public Address()
    {
    }

    public Address(Integer addressId)
    {
        this.addressId = addressId;
    }

    public Address(Integer addressId, int customerId, String firstname, String lastname, String company, String address1, String address2, String city, String postcode, int countryId, int zoneId, String customField)
    {
        this.addressId = addressId;
        this.customerId = customerId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.company = company;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.postcode = postcode;
        this.countryId = countryId;
        this.zoneId = zoneId;
        this.customField = customField;
    }

    public Integer getAddressId()
    {
        return addressId;
    }

    public void setAddressId(Integer addressId)
    {
        this.addressId = addressId;
    }

    public int getCustomerId()
    {
        return customerId;
    }

    public void setCustomerId(int customerId)
    {
        this.customerId = customerId;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    public String getAddress1()
    {
        return address1;
    }

    public void setAddress1(String address1)
    {
        this.address1 = address1;
    }

    public String getAddress2()
    {
        return address2;
    }

    public void setAddress2(String address2)
    {
        this.address2 = address2;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getPostcode()
    {
        return postcode;
    }

    public void setPostcode(String postcode)
    {
        this.postcode = postcode;
    }

    public int getCountryId()
    {
        return countryId;
    }

    public void setCountryId(int countryId)
    {
        this.countryId = countryId;
    }

    public int getZoneId()
    {
        return zoneId;
    }

    public void setZoneId(int zoneId)
    {
        this.zoneId = zoneId;
    }

    public String getCustomField()
    {
        return customField;
    }

    public void setCustomField(String customField)
    {
        this.customField = customField;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (addressId != null ? addressId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Address))
        {
            return false;
        }
        Address other = (Address) object;
        if ((this.addressId == null && other.addressId != null) || (this.addressId != null && !this.addressId.equals(other.addressId)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "entity.Address[ addressId=" + addressId + " ]";
    }
    
}
