package com.how2java;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("驱动初始化成功");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
