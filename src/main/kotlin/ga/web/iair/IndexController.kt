package ga.web.iair

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.ui.Model
import org.springframework.ui.set

    @Controller
    class IndexController{

        @RequestMapping("/")
        fun index(model:Model): String{
            model["title"]="환영합니다"
            return "index"
        }

    }