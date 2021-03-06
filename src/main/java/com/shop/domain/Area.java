package com.shop.domain;
// Generated Mar 31, 2020 7:37:15 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Area generated by hbm2java
 */
public class Area  implements java.io.Serializable {


     private Integer id;
     private District district;
     private String code;
     private String name;
     private String status;
     private Set<Shop> shops = new HashSet<Shop>(0);
     private Set<Shop> shops_1 = new HashSet<Shop>(0);

    public Area() {
    }

	
    public Area(District district) {
        this.district = district;
    }
    public Area(District district, String code, String name, String status, Set<Shop> shops, Set<Shop> shops_1) {
       this.district = district;
       this.code = code;
       this.name = name;
       this.status = status;
       this.shops = shops;
       this.shops_1 = shops_1;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public District getDistrict() {
        return this.district;
    }
    
    public void setDistrict(District district) {
        this.district = district;
    }
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Set<Shop> getShops() {
        return this.shops;
    }
    
    public void setShops(Set<Shop> shops) {
        this.shops = shops;
    }
    public Set<Shop> getShops_1() {
        return this.shops_1;
    }
    
    public void setShops_1(Set<Shop> shops_1) {
        this.shops_1 = shops_1;
    }




}


