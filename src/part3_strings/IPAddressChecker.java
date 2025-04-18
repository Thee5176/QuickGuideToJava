package part3_strings;

import java.util.Scanner;

//https://www.brianheinold.net/java/java_book.html#sec_varloopifexercises
//8.2.40 differentiate between zlocal addresses(10.*.*.* and 192.168.*.*) and global address (the rest)
public class IPAddressChecker {
    public static void main(String[] args){
        System.out.println("Enter IPv4 address: ");
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();

        if(ip.startsWith("10.") || ip.startsWith("192.168.")){
            System.out.println("Route to local address");
        } else {
            System.out.println("Route to global address");
        }
    }
}
