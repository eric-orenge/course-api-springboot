package io.celeribyte.springquickstart.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping("/topics")
	public List<Topic> getAllTopic() {
		return Arrays.asList(
				new Topic("Spring","Spring framework","Spring framework desc"),
				new Topic("Spring 2","Spring framework 2","Spring framework desc 2")
				);
	}
}
