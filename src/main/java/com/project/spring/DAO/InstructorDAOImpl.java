package com.project.spring.DAO;

import com.project.spring.entity.Instructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InstructorDAOImpl implements InstructorDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Instructor> findAllInstructors() {

        Session session = sessionFactory.openSession(); //open a session
        session.beginTransaction(); //begin the transaction
        Query<Instructor> instructorQuery = session.createQuery("from Instructor", Instructor.class);  //do some query
        List<Instructor> instructorList= instructorQuery.list();

        session.getTransaction().commit();  // commit the transaction
        return instructorList;
    }
}
