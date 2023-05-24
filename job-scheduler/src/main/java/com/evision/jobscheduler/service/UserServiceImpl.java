package com.evision.jobscheduler.service;

import com.evision.jobscheduler.dao.UserRepository;
import com.evision.jobscheduler.model.User;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

@Service
public class UserServiceImpl {
    @Autowired
    public UserRepository userRepository;

//    Logger log = (Logger) LoggerFactory.getLogger(UserServiceImpl.class);
//    Schedule to add data to database in every 5 second

    @Scheduled(fixedRate = 5000)
    public void add2DbJob(){
        User user = new User();
        user.setName("Nikhil "+ new Random().nextInt(100000));
        userRepository.save(user);
        System.out.println("User inserted at  "+ LocalDateTime.now());
    }
//    Fetch data from database in every 15 seconds

    @Scheduled(cron = "0/10 * * * * *")
    public void fetchDbJob(){
        List<User> userList = userRepository.findAll();
        System.out.println("Details fetch at "+LocalDateTime.now());
        System.out.println("User fetched at this time are "+userList.size());
        for(User user: userList){
            System.out.println(user);
        }
    }
}
