package lojaloja.apilojaloja;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class ControllerHelloWorld {


    @GetMapping
    public String helloWorld(){

        return "Hello World";
    }


    @PostMapping
    public void cadastrar(@RequestBody String json){

        System.out.println(json);
    }

}
