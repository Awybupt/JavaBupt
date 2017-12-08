package homework3;

/**
 * Employee: firstName,lastName,socialSecurityNumber
 * Employee类中定义了抽象方法earning，用于计算员工的月工资。
 *
 * Created by WeiXiao om 06/12/17
 */
public abstract class _15211301_WeiXiao_3_Employee
{
    private String firstname;
    private String lastname;
    private final String socialSecurityNumber;

    public _15211301_WeiXiao_3_Employee()//无参数构造
    {
        firstname="f";
        lastname="l";
        socialSecurityNumber="s";
    }

    public _15211301_WeiXiao_3_Employee(String f,String l,String s)//有参数构造
    {
        firstname=f;
        lastname=l;
        socialSecurityNumber=s;
    }

    public abstract int earning();//所有的子类必须重写此方法

    public final String getfirstname()
    {
        return firstname;
    }

    public final void setFirstname(String F)
    {
        firstname=F;
    }

    public final String getLastname()
    {
        return lastname;
    }

    public final void setLastname(String L)
    {
        lastname=L;
    }

    public final String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }


    public String toString()
    {
        StringBuilder employ=new StringBuilder("");
        //employ.append("\nFirst name:"+getfirstname());
        //employ.append("\nLast name:"+getLastname());
        //employ.append("\nSocial security number:"+getSocialSecurityNumber());
        employ.append("本月工资："+earning());
        return employ.toString();
    }
}
