package com.atul.springdata.springdata.controllers;

import com.atul.springdata.springdata.entity.Category;
import com.atul.springdata.springdata.entity.UnitOfMeasure;
import com.atul.springdata.springdata.repos.CategoryRepo;
import com.atul.springdata.springdata.repos.UnitOfMeasureRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class IndexController {

    private CategoryRepo categoryRepo;
    private UnitOfMeasureRepo unitOfMeasureRepo;

    public IndexController(CategoryRepo categoryRepo, UnitOfMeasureRepo unitOfMeasureRepo) {
        this.categoryRepo = categoryRepo;
        this.unitOfMeasureRepo = unitOfMeasureRepo;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/index", produces = {"application/json", "application/xml" })
    public String index() {
        Optional<Category> american = categoryRepo.findByDescription("American");
        Optional<UnitOfMeasure> uom = unitOfMeasureRepo.findByUom("pinch");

        System.out.println(american.get().getDescription());
        System.out.println("uom is --> " + uom.get().getUom());
        return "Hello index";
    }
}
