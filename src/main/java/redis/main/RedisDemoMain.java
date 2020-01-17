/**
 * 
 */
package redis.main;

import redis.clients.jedis.Jedis;

/**
 * @author nepula
 *
 */
public class RedisDemoMain {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.printf("%s#main(): %s%n", RedisDemoMain.class.getSimpleName(), "START");

		
		try (Jedis jedis = new Jedis()) {

			jedis.set("aaa/bbb/ccc", "val1");
			String abc = jedis.get("aaa/bbb/ccc");
	
			System.out.printf("%s#main(): abc=%s%n", RedisDemoMain.class.getSimpleName(), abc);
				
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
