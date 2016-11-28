package com.conclusion.dao;

import com.conclusion.model.Conclusion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.*;

/**
 * Created by Shimon on 4/6/2016.
 */
@Component
public class ConclusionDao {
    private static final String CONCLUSION_COLLECTION = "conclusion";
    private final MongoTemplate mongoTemplate;

    @Autowired
    public ConclusionDao(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }


    public void insert(Conclusion conclusion) {
        mongoTemplate.insert(conclusion, CONCLUSION_COLLECTION);
    }

    public List<Conclusion> getByUserId(String userId) {
        Query query = Query.query(where("userId").is(userId));

        List<Conclusion> conclusions = mongoTemplate.find(query, Conclusion.class, CONCLUSION_COLLECTION);

        return conclusions;
    }

    public List<Conclusion> getByBookCid(String bookCid) {
        Query query = Query.query(where("bookCid").is(bookCid));

        List<Conclusion> conclusions = mongoTemplate.find(query, Conclusion.class, CONCLUSION_COLLECTION);

        return conclusions;
    }
}
