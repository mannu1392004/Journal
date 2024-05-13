package com.example.Journal.App.controller;

import com.example.Journal.App.entity.journal_entries;
import com.example.Journal.App.services.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    @Autowired
    private JournalEntryService journalEntryService;

    @PostMapping
    public Boolean entry(@RequestBody journal_entries data) {
        journalEntryService.saveentry(data);
        return true;
    }

    @GetMapping("/get")
    public List<journal_entries> getall() {
        return journalEntryService.getall();
    }

    @GetMapping("/id{myid}")
    public Optional<journal_entries> getbyId(@PathVariable ObjectId myid){
        return journalEntryService.findById(myid);
    }





}
