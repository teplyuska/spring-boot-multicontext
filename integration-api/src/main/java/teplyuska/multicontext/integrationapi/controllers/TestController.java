package teplyuska.multicontext.integrationapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
    private String sharedBean;

    @Autowired
    public TestController(String sharedBean) {
        this.sharedBean = sharedBean;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> getSharedBean() {
        return new ResponseEntity<>(sharedBean, HttpStatus.OK);
    }
}
