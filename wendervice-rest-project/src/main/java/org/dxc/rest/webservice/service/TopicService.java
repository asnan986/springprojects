package org.dxc.rest.webservice.service;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.dxc.rest.webservice.model.Topic;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	List<Topic> topics = new LinkedList<Topic>(
			Arrays.asList(new Topic("Spring", "Springframework", "springframeworkdescription"),
					new Topic("Java", "Core Java", "corejavadescription"),
					new Topic("JavaScript", "JavaScript", "JavaScriptdescription")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		// TODO Auto-generated method stub

		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();

	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}

}
