package 语法.proxy.staticProxy_zhuangshi;//package ����_��̬����__װ�����ģʽ;

// ������Ҫ��������ѧ���������ϼ��ϣ���־��¼��Ȩ�޼��ȵȹ���
public class StudentManagerImpProxy implements InterfaceStudentManager
{

	private InterfaceStudentManager manager;

	public StudentManagerImpProxy(InterfaceStudentManager manager)
	{
		this.manager = manager;
	}

	@Override
	public void add(String name, int id)
	{
		System.out.println("�����־");
		System.out.println("Ȩ�޼��");
		manager.add(name, id);
		System.out.println("�����ʼ�");
	}

	@Override
	public void delete(String name, int id)
	{
		System.out.println("�����־");
		System.out.println("Ȩ�޼��");
		manager.delete(name, id);
		System.out.println("�����ʼ�");
	}

	@Override
	public void update(String name, int id)
	{
		System.out.println("�����־");
		System.out.println("Ȩ�޼��");
		manager.update(name, id);
		System.out.println("�����ʼ�");
	}

	@Override
	public void find(String name, int id)
	{
		System.out.println("�����־");
		System.out.println("Ȩ�޼��");
		manager.find(name, id);
		System.out.println("�����ʼ�");
	}

}
