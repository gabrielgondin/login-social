package ggo.sociallogin

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SocialLoginRest {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }
}
