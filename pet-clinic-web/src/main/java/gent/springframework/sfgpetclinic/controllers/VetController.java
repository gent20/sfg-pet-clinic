/*
 * Created by Gent Kastrati
 */

/*
 * Created by Gent Kastrati
 */

package gent.springframework.sfgpetclinic.controllers;

import gent.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","/vets/index","/vets/index.html","/vets.html"})
    public String listVets(Model model){

        model.addAttribute("vets",vetService.findAll());
        return "vets/index";
    }

}
