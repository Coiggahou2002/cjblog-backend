//package com.coiggahou.blog.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import com.coiggahou.blog.entity.blog.Type;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/admin/type")
//@CrossOrigin
//public class TypeController {
//    @Autowired
//    private TypeService typeService;
//
//    @GetMapping("/get_all_types")
//    @ResponseBody
//    List<Type> getAllTypes() {
//        return typeService.listAllTypes();
//    }
//}
