package com.example.Journal.App.services;

import com.example.Journal.App.Repository;
import com.example.Journal.App.entity.journal_entries;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {

    @Autowired
    private Repository repository;

    public void saveentry(journal_entries entry) {
        repository.save(entry);
    }

    public List<journal_entries> getall() {
        return repository.findAll();
    }

    public Optional<journal_entries> findById(ObjectId id){

     return repository.findById(id);

    }

}
