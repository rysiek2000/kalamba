package com.kalamba.task.SampleRest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ActionController {
    final Logger log = LoggerFactory.getLogger(ActionController.class);
    @Autowired
    private ActionRepository actionRepository;

    @PostMapping("/action")
    @ResponseStatus(HttpStatus.OK)
    public void addAction(@RequestBody Action action) {
        log.info("Add Action");
        actionRepository.save(action);
    }
}
