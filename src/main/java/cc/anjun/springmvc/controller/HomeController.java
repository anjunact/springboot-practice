package cc.anjun.springmvc.controller;

import cc.anjun.springmvc.CityMapper;
import cc.anjun.springmvc.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private CityMapper cityMapper;
    @RequestMapping("/")
    public List<City>  hello(){
       return cityMapper.getList();
    }
}
