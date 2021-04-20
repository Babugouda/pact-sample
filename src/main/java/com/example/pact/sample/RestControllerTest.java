package com.example.pact.sample;

import com.example.pact.sample.model.GetResponse;
import com.example.pact.sample.model.PostRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class RestControllerTest {

    @GetMapping("/pact")
    public GetResponse getPact() {
        GetResponse model = new GetResponse();
        model.setCondition(true);
        model.setName("tom");
        return model;
    }

    @PostMapping("/pact")
    public ResponseEntity<Void> postPact(@RequestBody PostRequest postRequest) {
        return ResponseEntity.status(201).build();
    }
}
