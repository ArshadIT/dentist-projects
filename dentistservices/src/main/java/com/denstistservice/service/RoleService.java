package com.denstistservice.service;

import com.denstistservice.dao.RoleDao;
import com.denstistservice.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
       return roleDao.save(role);
    }
}
