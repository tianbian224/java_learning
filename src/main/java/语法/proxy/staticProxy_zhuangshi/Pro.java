package 语法.proxy.staticProxy_zhuangshi;//  Lvcang created at  2017-11-09 16:23

public class Pro
{

    public static void main(String[] args)
    {
        InterfaceStudentManager manager = new StudentManagerImp();
        StudentManagerImpProxy proxy = new StudentManagerImpProxy(manager);// ����
        proxy.add("", 112);
        proxy.delete("", 45);
        proxy.find("", 15);
        // ����Ϊֹ��ɾ�̬����
        // �ŵ㣺
        // ----- 1.��̬����ʵ��������Ҫҵ��Ļ�������ӹ���,�����޸�Դ���룬���㿪��ԭ��
        // ȱ�㣺
        // ----- 1.������ֻ�Ƿ�����ѧ�����������Ժ��½�����TeacherManager��WorkerManager�������ٴ���
        // -------���������ģ��Ǿ���Ҫд�ܶ������

    }

}

