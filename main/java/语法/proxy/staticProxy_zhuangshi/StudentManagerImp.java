package 语法.proxy.staticProxy_zhuangshi;

// ѧ��������ֻרע��ѧ������ɾ�Ĳ飬������Ȩ����֤����־��¼�ȵ��޹�ҵ��
public class StudentManagerImp implements InterfaceStudentManager
{

	@Override
	public void add(String name, int id)
	{
		System.out.println("���ѧ��");
	}

	@Override
	public void delete(String name, int id)
	{
		System.out.println("ɾ��ѧ��");
	}

	@Override
	public void update(String name, int id)
	{
		System.out.println("�޸�ѧ��");
	}

	@Override
	public void find(String name, int id)
	{
		System.out.println("����ѧ��");
	}

}
