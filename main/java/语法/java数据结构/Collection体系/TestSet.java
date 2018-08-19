package 语法.java数据结构.Collection体系;

import java.util.HashSet;
import java.util.Set;

public class TestSet
{

	public static void main(String[] args)
	{
		User u1 = new User();
		User u2 = new User();
		Set<User> set = new HashSet();
		set.add(u1);
		set.add(u2);
		System.out.println(set);

	}

}

