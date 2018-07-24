import java.io.*;
class pwdcheck
{
    public static void main(String[] args)throws IOException
    {
        System.out.println((char)12);
        System.out.println("1.Your password must contain a Uppercase letter\n2.Your password must contain a lowercase letter\n"+
        "3.Your password must contain a  Number\n4.Your password must contain special character"+
        "\nYour password length should be atleast 8\nNever Enter sequence they are easily HACKABLE");
        System.out.println("Enter your password");
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s=in.readLine();int cw=0,lw=0,no=0,sp=0,sq=0;
        
        
        for(int i=0;i<s.length()-2;i++)
        {

            char a=s.charAt(i);
            char b=s.charAt(i+1);
            char c=s.charAt(i+2);
            int d=(int)a;
            int e=(int)b;
            int f=(int)c;
            
            if(((d+1)==e) && ((e+1)==f))
            sq++;
            if(a>=65 && a<=90)
            cw++;
            if(a>=97 && a<=122)
            lw++;
            if(a>=48 && a<=57)
            no++;
            if((a>=1 && a<47) ||(a>=58 && a<=64) || (a>=123 && a<=500) || (a>=91 && a<=96))
            sp++;
        
        }
        
        if(cw<1)
        System.out.println("Please Provide atleast one uppercase letters");
        if(lw<1)
        System.out.println("Please Provide atleast one lowercase letters");
        if(no<1)
        System.out.println("Please Provide atleast one Numbers");
        if(sp<1)
        System.out.println("Please Provide atleast one Special Letters");
        if(sq>=1)
        System.out.println("You have entered a sequence please change your Password");
        if(s.length()>=8 && no>=1 && cw>=1 && lw>=1 && sp>=1 && sq==0)
        System.out.println("Perfect Password");
        else
            System.out.println("Password is also not strong enough");
            
    }
}