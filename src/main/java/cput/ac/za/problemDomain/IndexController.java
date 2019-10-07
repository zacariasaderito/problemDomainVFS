package cput.ac.za.problemDomain;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
//    @RequestMapping

    @GetMapping("/home/document/insurance/getall")
    @ResponseBody
    public String getHome() {

        return "EU SOU BEM MAU XE!";
    }
}
