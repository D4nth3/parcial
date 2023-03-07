package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import modelo.Empleado;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {
    @GetMapping({"/", ""})
    public String indexController(Model model){
        Empleado empleado = new Empleado();
        model.addAttribute("titulo", "perfil");
        model.addAttribute("empleado", empleado);
        empleado.setId("12345");
        empleado.setNombre("Camilo");
        empleado.setApellido("Vélez");
        empleado.setCorreo("juan@eam.com");
        empleado.setDireccion("calle 34 apto 201");
        empleado.setTelefono("7896541");
        model.addAttribute("cuerpo", "perfil del empleado" .concat(empleado.getNombre()));
        return "empleado/index";
    }


    
}
