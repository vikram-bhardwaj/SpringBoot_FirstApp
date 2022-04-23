package com.topics.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.topics.VO.Topics;
import com.topics.services.TopicService;

@RestController
public class TopicController
{
	@Autowired
	TopicService topicService;
	@RequestMapping("/topics")
	public List<Topics> getAllTopics()
	{
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topics getTopic(@PathVariable String id)
	{
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/topics")
	public void addTopic(@RequestBody Topics topics)
	{
		topicService.addTopic(topics);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value = "/topics/{id}")
	public void updateTopic(@RequestBody Topics topics, @PathVariable String id)
	{
		topicService.updateTopic(topics, id);
	}
}
