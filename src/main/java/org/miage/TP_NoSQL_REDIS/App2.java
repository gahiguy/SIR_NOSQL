package org.miage.TP_NoSQL_REDIS;

import redis.clients.jedis.Jedis;

public class App2 {

	public static void main(String[] args) {
		
		Jedis jedis = new Jedis("localhost");
        System.out.println(jedis.get("counter"));
        jedis.incr("counter");
        System.out.println(jedis.get("counter"));
	}

}
