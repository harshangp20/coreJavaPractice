package com.example.Demo_;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class net {
    public static void main(String[] args) throws UnknownHostException {
        String url = "www.youtube.com";
        InetAddress inetAddress = Inet4Address.getByName(url);
        System.out.println("Address:"+ Arrays.toString(inetAddress.getAddress()));
        System.out.println("Host Address:"+inetAddress.getHostAddress());
        System.out.println("isAnyLocalAddress: "+inetAddress.isAnyLocalAddress());
        System.out.println("isSiteLocalAddress:"+inetAddress.isSiteLocalAddress());
        System.out.println("Hashcode:"+inetAddress.hashCode());
    }
}
