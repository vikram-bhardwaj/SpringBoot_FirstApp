package com.topics.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.topics.VO.Topics;

@Service
public class TopicService
{
	private List<Topics> topics = new ArrayList<>(Arrays.asList(
			new Topics("1", "Vikram", "this is desc"),
			new Topics("2", "Chaitra", "this is desc"),
			new Topics("3", "Harry", "this is desc"),
			new Topics("4", "Ron", "this is desc")
			));
	
	public List<Topics> getAllTopics()
	{
		return topics;
	}
	
	public Topics getTopic(String id)
	{
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topics t1)
	{
		topics.add(t1);
	}

	public void updateTopic(Topics t2, String id)
	{
		for(int i = 0; i < topics.size(); i++)
		{
			Topics ts = topics.get(i);
			if(ts.getId().equals(id))
			{
				topics.set(i, t2);
				return;
			}
		}
	}
}
