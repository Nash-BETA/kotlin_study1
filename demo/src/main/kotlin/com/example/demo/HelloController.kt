package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

//@Controllerをつける事でルーティングを行える
@Controller
class HelloController {
    //@GetMappingの引数えパスを指定する
    @GetMapping("/")
    fun index(model: Model):String {
        model.addAttribute("message", "Hello World!!!")
        return  "index"
    }
}
