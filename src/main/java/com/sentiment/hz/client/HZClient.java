package com.sentiment.hz.client;

import java.util.Map;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;

public class HZClient {


	public static Map<String,String> load19972000Map(){
		return getHZClientInstance().getMap("map19972000");
	}
	
	private static HazelcastInstance getHZClientInstance(){
		ClientConfig clientConfig = new ClientConfig();
		clientConfig.getGroupConfig().setName("dev").setPassword("dev-pass");
		clientConfig.addAddress("10.100.8.55", "10.100.8.56:5701");
		
		HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);
		return client;
	}
	
	public static Map<String,String> load20012004Map(){
		return getHZClientInstance().getMap("map20012004");
	}
	
	public static Map<String,String> load20052008Map(){
		return getHZClientInstance().getMap("map20052008");
	}
	
	public static Map<String,String> load20092012Map(){
		return getHZClientInstance().getMap("map20092012");
	}
}
