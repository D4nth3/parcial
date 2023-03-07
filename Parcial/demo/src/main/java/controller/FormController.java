package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import modelo.Empleado;

@Controller
// @SessionAttributes("empleado")
public class FormController {

    @GetMapping("/form")
    public String form(Model model){
        Empleado empleado = new Empleado();
        model.addAttribute("titulo", "formulario");
        model.addAttribute("empleado", empleado);
        return "form";
    }

    @PostMapping("/form")
    public String procesar(@Valid Empleado empleado, BindingResult result, Model model){
        if(result.hasErrors()){
            model.addAttribute("titulo", "resultado formulario");
            return "form";
        }
        return "resultado";
    }

    
}
