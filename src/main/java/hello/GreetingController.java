package hello;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@RestController
//@ApiIgnore
public class GreetingController {
    @RequestMapping(value="/greeting", method=RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_VALUE)
    public GreetingForm requestBody(@RequestBody GreetingForm form) {
        return form;
    }

//    @RequestMapping(value="/greeting", method=RequestMethod.POST, consumes= MediaType.TEXT_PLAIN_VALUE)
//    public GreetingForm queryString(@ModelAttribute GreetingForm form) {
//        return form;
//    }

}
