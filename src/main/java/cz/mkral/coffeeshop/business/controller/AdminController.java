package cz.mkral.coffeeshop.business.controller;

import cz.mkral.coffeeshop.business.dto.DrinkDTO;
import cz.mkral.coffeeshop.business.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(
        path = "/admin")
@RequiredArgsConstructor
public class AdminController {

    private final AdminService adminService;

    @ResponseBody
    @GetMapping("/drinks")
    public List<DrinkDTO> getAllDrinks() {
        return adminService.getAllDrinks();
    }
}
