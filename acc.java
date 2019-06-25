import java.util.*;
class Account
{
int ac_no,withdraw,deposit,cur_bal;
String name;
Account(String n,int a,int w,int d,int c)
{
name=n;
ac_no=a;
withdraw=w;
deposit=d;
cur_bal=c;
}
public static void main(String st[])
{
ArrayList<Account> a=new ArrayList<Account>();
for(int i=0;i<4;i++)
{
a.add(new Account("x",656565,30000,10000,50000));
}
for(Account i:a)
{
System.out.println(i.name+"\t"+i.ac_no);
}
Iterator x=a.iterator();
while(x.hasNext())
{
Account aa=(Account)x.next();
System.out.println(aa.name+"\t"+aa.ac_no);
}

}
}