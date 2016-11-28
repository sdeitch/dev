package com.conclusion.rest;

import com.conclusion.dao.ConclusionDao;
import com.conclusion.model.Conclusion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Shimon on 4/10/2016.
 */
@RestController
public class ConclusionControler {
    @Autowired
    private ConclusionDao conclusionDao;

    @RequestMapping("/conclusion")
    public void conclusion() {
        Conclusion conclusion = new Conclusion();
        conclusion.setUserId("jopa");
        conclusion.setPath("Big Jopa/Jopa");
        conclusion.setConclusion("realy Jopa");

        conclusionDao.insert(conclusion);
    }

}
