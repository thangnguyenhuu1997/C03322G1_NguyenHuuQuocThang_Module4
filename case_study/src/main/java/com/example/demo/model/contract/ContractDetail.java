package com.example.demo.model.contract;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity(name = "contract_detail")
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_detail_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "contract_id", referencedColumnName = "contract_id")
    @JsonManagedReference
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "attach_facility_id", referencedColumnName = "attach_facility_id")
    @JsonManagedReference
    private AttachFacility attachFacility;

    @Column (name = "quantity")
    private Integer quantity;

    public ContractDetail() {
    }

    public ContractDetail(Contract contract, AttachFacility attachFacility, Integer quantity) {
        this.contract = contract;
        this.attachFacility = attachFacility;
        this.quantity = quantity;
    }

    public ContractDetail(Integer id, Contract contract, AttachFacility attachFacility, Integer quantity) {
        this.id = id;
        this.contract = contract;
        this.attachFacility = attachFacility;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachFacility getAttachFacility() {
        return attachFacility;
    }

    public void setAttachFacility(AttachFacility attachFacility) {
        this.attachFacility = attachFacility;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
