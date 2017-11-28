package br.ufs.dcomp.InetAddressTest;

import java.net.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            
            String name = "www.ufs.br";
            //InetAddress address = InetAddress.getByName(name); 
            //System.out.println( "Name:      "+ name);
            //System.out.println( "Address:   "+ address.getHostAddress());
            
            InetAddress[] address = InetAddress.getAllByName(name); 
            System.out.println( "Name:      "+ name);
            
            for (int i = 0; i < address.length; i++) {
            //for (int i = 0; address[i] != null; i++) {
                
                System.out.println( "Address:   "+ address[i].getHostAddress());
                
            }
            

        } catch (UnknownHostException e){
            System.out.println(e.getMessage());
        }                
    }
}
