package com.example.demo.model.employee;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "role_id")
    private Integer roleId;

//    @Column("role_name")
    private String roleName;

//    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
//    private Set<UserRole> roles;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
//
//    public Set<UserRole> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(Set<UserRole> roles) {
//        this.roles = roles;
//    }
}
