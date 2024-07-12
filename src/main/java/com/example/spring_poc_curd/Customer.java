package com.example.spring_poc_curd;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hackathon")
public class Customer {
    private List<String> participants=new ArrayList<>();

    @PostConstruct
    public void define(){
        participants.add("Gv");
        participants.add("Eni");
        participants.add("Gowsi");
        participants.add("Dog");
    }

    @PutMapping("/alter/{index}")
    public String modify(@PathVariable("index") int index, @RequestBody String name){
        participants.set(index,name);
        return name+" has been replaced @ "+index;
    }

    @DeleteMapping("/delete/{name}")
    public String remove(@PathVariable("name") String name){
        participants.remove(name);
        return name+" has been removed from the event";
    }

    @PostMapping("/enroll")
    public String enroll(@RequestBody String participant){
        participants.add(participant);
        return participant+" has enrolled";
    }

    @GetMapping("/view")
    public List<String> viewAll(){
        return participants;
    }
}