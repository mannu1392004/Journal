package com.example.Journal.App;

import com.example.Journal.App.entity.journal_entries;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<
        journal_entries, ObjectId> {


}
