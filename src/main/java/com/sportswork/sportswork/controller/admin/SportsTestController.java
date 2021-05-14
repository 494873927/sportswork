package com.sportswork.sportswork.controller.admin;

import com.sportswork.sportswork.core.entity.Role;
import com.sportswork.sportswork.core.entity.SportsTest;
import com.sportswork.sportswork.core.service.dto.PageDTO;
import com.sportswork.sportswork.core.service.impl.SportsTestServiceImp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@Controller("sportsTestController")
public class SportsTestController {
    @Resource
    private SportsTestServiceImp sportsTestServiceImp;

    @RequestMapping("/admin/sportsTest/list")
    @PreAuthorize("hasAnyRole('admin')")
    public String List(){
        return "/pages/view/admin/sportsTest/list";
    }

    @RequestMapping("/admin/sportsTest/getAllSportsTests")
    @PreAuthorize("hasAnyRole('admin')")
    @ResponseBody
    public Object getAllSportsTests(){
        return new PageDTO<SportsTest>().toPageDTO(sportsTestServiceImp.getAllSportsTests());
    }

    @RequestMapping(value = "/admin/sportsTest/add", method = RequestMethod.POST)
    @PreAuthorize("hasAnyRole('admin')")
    @ResponseBody
    public String add(SportsTest sportsTest) {
        sportsTestServiceImp.addSportsTest(sportsTest);
        return "success";
    }


    @RequestMapping(value = "/admin/sportsTest/edit", method = RequestMethod.POST)
    @PreAuthorize("hasAnyRole('admin')")
    @ResponseBody
    public String edit(SportsTest sportsTest) {
        sportsTestServiceImp.setSportsTest(sportsTest);
        return "success";
    }

    @RequestMapping(value = "/admin/sportsTest/delete", method = RequestMethod.POST)
    @PreAuthorize("hasAnyRole('admin')")
    @ResponseBody
    public String delete(@RequestParam String id) {
        sportsTestServiceImp.deleteSportsTest(id);
        return "true";
    }
}
