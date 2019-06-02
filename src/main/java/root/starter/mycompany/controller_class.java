package root.starter.mycompany;




import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author knl
 */
@RestController
public class controller_class {
    
 @RequestMapping("/check")
public String checked()
{
    return "server runing";
    
}
}