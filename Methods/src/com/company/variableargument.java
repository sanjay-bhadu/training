package com.company;

public class variableargument {
    static int sum(int ...arr)//with the help of this we can take variable parameters as input.
    {
        int result=0;
        for(int a: arr)
        {
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        int r=sum(1,2,3,4,4);
        System.out.println(r);
    }
}
