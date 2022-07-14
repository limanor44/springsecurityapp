package com.limanor44.springsecurityapp.controller;

import com.limanor44.springsecurityapp.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @Autowired
   private RoleService roleService;

}
