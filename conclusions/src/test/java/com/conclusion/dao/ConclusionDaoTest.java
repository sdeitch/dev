package com.conclusion.dao;

import com.conclusion.Application;
import com.conclusion.model.Conclusion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Shimon on 4/26/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ConclusionDaoTest {
    @Autowired
    private ConclusionDao conclusionDao;

    @Test
    public void testInsert() {
        Conclusion conclusion = new Conclusion();
        conclusion.setUserId("jopa");
        conclusion.setPath("Big Jopa/Jopa/jopka");
        conclusion.setConclusion("realy Big Jopa");

        // insert to db
        conclusionDao.insert(conclusion);
    }
}