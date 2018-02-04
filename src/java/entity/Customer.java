/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bobmastrolilli
 */
@Entity
@Table(name = "customer")
@NamedQueries(
{
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c"),
    @NamedQuery(name = "Customer.findByCustomerId", query = "SELECT c FROM Customer c WHERE c.customerId = :customerId"),
    @NamedQuery(name = "Customer.findByCustomerGroupId", query = "SELECT c FROM Customer c WHERE c.customerGroupId = :customerGroupId"),
    @NamedQuery(name = "Customer.findByStoreId", query = "SELECT c FROM Customer c WHERE c.storeId = :storeId"),
    @NamedQuery(name = "Customer.findByLanguageId", query = "SELECT c FROM Customer c WHERE c.languageId = :languageId"),
    @NamedQuery(name = "Customer.findByFirstname", query = "SELECT c FROM Customer c WHERE c.firstname = :firstname"),
    @NamedQuery(name = "Customer.findByLastname", query = "SELECT c FROM Customer c WHERE c.lastname = :lastname"),
    @NamedQuery(name = "Customer.findByEmail", query = "SELECT c FROM Customer c WHERE c.email = :email"),
    @NamedQuery(name = "Customer.findByTelephone", query = "SELECT c FROM Customer c WHERE c.telephone = :telephone"),
    @NamedQuery(name = "Customer.findByFax", query = "SELECT c FROM Customer c WHERE c.fax = :fax"),
    @NamedQuery(name = "Customer.findByPassword", query = "SELECT c FROM Customer c WHERE c.password = :password"),
    @NamedQuery(name = "Customer.findBySalt", query = "SELECT c FROM Customer c WHERE c.salt = :salt"),
    @NamedQuery(name = "Customer.findByNewsletter", query = "SELECT c FROM Customer c WHERE c.newsletter = :newsletter"),
    @NamedQuery(name = "Customer.findByAddressId", query = "SELECT c FROM Customer c WHERE c.addressId = :addressId"),
    @NamedQuery(name = "Customer.findByIp", query = "SELECT c FROM Customer c WHERE c.ip = :ip"),
    @NamedQuery(name = "Customer.findByStatus", query = "SELECT c FROM Customer c WHERE c.status = :status"),
    @NamedQuery(name = "Customer.findBySafe", query = "SELECT c FROM Customer c WHERE c.safe = :safe"),
    @NamedQuery(name = "Customer.findByCode", query = "SELECT c FROM Customer c WHERE c.code = :code"),
    @NamedQuery(name = "Customer.findByDateAdded", query = "SELECT c FROM Customer c WHERE c.dateAdded = :dateAdded")
})
public class Customer implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "customer_id")
    private Integer customerId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "customer_group_id")
    private int customerGroupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "store_id")
    private int storeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private int languageId;
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
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 96)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "telephone")
    private String telephone;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "fax")
    private String fax;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "salt")
    private String salt;
    @Lob
    @Size(max = 65535)
    @Column(name = "cart")
    private String cart;
    @Lob
    @Size(max = 65535)
    @Column(name = "wishlist")
    private String wishlist;
    @Basic(optional = false)
    @NotNull
    @Column(name = "newsletter")
    private boolean newsletter;
    @Basic(optional = false)
    @NotNull
    @Column(name = "address_id")
    private int addressId;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "custom_field")
    private String customField;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ip")
    private String ip;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private boolean status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "safe")
    private boolean safe;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "token")
    private String token;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    public Customer()
    {
    }

    public Customer(Integer customerId)
    {
        this.customerId = customerId;
    }

    public Customer(Integer customerId, int customerGroupId, int storeId, int languageId, String firstname, String lastname, String email, String telephone, String fax, String password, String salt, boolean newsletter, int addressId, String customField, String ip, boolean status, boolean safe, String token, String code, Date dateAdded)
    {
        this.customerId = customerId;
        this.customerGroupId = customerGroupId;
        this.storeId = storeId;
        this.languageId = languageId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.telephone = telephone;
        this.fax = fax;
        this.password = password;
        this.salt = salt;
        this.newsletter = newsletter;
        this.addressId = addressId;
        this.customField = customField;
        this.ip = ip;
        this.status = status;
        this.safe = safe;
        this.token = token;
        this.code = code;
        this.dateAdded = dateAdded;
    }

    public Integer getCustomerId()
    {
        return customerId;
    }

    public void setCustomerId(Integer customerId)
    {
        this.customerId = customerId;
    }

    public int getCustomerGroupId()
    {
        return customerGroupId;
    }

    public void setCustomerGroupId(int customerGroupId)
    {
        this.customerGroupId = customerGroupId;
    }

    public int getStoreId()
    {
        return storeId;
    }

    public void setStoreId(int storeId)
    {
        this.storeId = storeId;
    }

    public int getLanguageId()
    {
        return languageId;
    }

    public void setLanguageId(int languageId)
    {
        this.languageId = languageId;
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

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getTelephone()
    {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    public String getFax()
    {
        return fax;
    }

    public void setFax(String fax)
    {
        this.fax = fax;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getSalt()
    {
        return salt;
    }

    public void setSalt(String salt)
    {
        this.salt = salt;
    }

    public String getCart()
    {
        return cart;
    }

    public void setCart(String cart)
    {
        this.cart = cart;
    }

    public String getWishlist()
    {
        return wishlist;
    }

    public void setWishlist(String wishlist)
    {
        this.wishlist = wishlist;
    }

    public boolean getNewsletter()
    {
        return newsletter;
    }

    public void setNewsletter(boolean newsletter)
    {
        this.newsletter = newsletter;
    }

    public int getAddressId()
    {
        return addressId;
    }

    public void setAddressId(int addressId)
    {
        this.addressId = addressId;
    }

    public String getCustomField()
    {
        return customField;
    }

    public void setCustomField(String customField)
    {
        this.customField = customField;
    }

    public String getIp()
    {
        return ip;
    }

    public void setIp(String ip)
    {
        this.ip = ip;
    }

    public boolean getStatus()
    {
        return status;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }

    public boolean getSafe()
    {
        return safe;
    }

    public void setSafe(boolean safe)
    {
        this.safe = safe;
    }

    public String getToken()
    {
        return token;
    }

    public void setToken(String token)
    {
        this.token = token;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public Date getDateAdded()
    {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded)
    {
        this.dateAdded = dateAdded;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (customerId != null ? customerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer))
        {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.customerId == null && other.customerId != null) || (this.customerId != null && !this.customerId.equals(other.customerId)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "entity.Customer[ customerId=" + customerId + " ]";
    }
    
}
