package hello;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingControllerQuery {

    @RequestMapping(value="/greeting", method= RequestMethod.POST)
    public GreetingForm queryString(@ModelAttribute GreetingForm form) {
        return form;
    }
}
