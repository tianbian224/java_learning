package 语法.io.FileOutputstream练习;

import java.io.Serializable;

public class Person implements Serializable
{
	//ע�⣺serializable����û�з���������Ҫ����
	//��Ϊ����һ����ǽӿڣ�������ǲ���Ҫ���Ƿ�����������������
	String name;
	int age;
	public static final long serialVersionUID=10l;
	//�Լ�����ָ��������룬�������仯ʱ�� �������ǿ��Զ�ȡ���� 
	public void Run()
	{
		System.out.println("I can Run"+90);
	}
}
