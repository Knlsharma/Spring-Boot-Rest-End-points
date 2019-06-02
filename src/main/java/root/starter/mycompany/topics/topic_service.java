/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.starter.mycompany.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author knl
 */
 @Service 
public class topic_service {
     
     List<topic> topics = new ArrayList<>(Arrays.asList(   new topic ("spring", "framwork1" ),
                     new topic ("javascript", "framwork2"),
                       new topic ("python", "framwork3") ));
  
       public List<topic> getAll()
      {
     return topics;
           }
       
       public topic getATopic(String id)
{
       
     return  topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
       
}

   public  void addTopic(topic newtopic1) {
        topics.add(newtopic1); 
    }

    void updateTopic(String id, topic newtopic1) {
       for(int i =0 ; i<topics.size();i++)
       {
           topic t= topics.get(i);
           if(t.getId().equals(id))
           {
               topics.set(i, newtopic1);
            return ;
           
       }
    }

  

 }
      public void deleteATopic(String id) {
     topics.removeIf(t ->t.getId().equals(id));
    }
 }