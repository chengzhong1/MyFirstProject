package com.neuedu;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File f=new File("d:\\a.txt");
        f.mkdirs();
        System.out.println(f);
        f.renameTo(new File("d:/bb.txt"));
        System.out.println("user.dir");
        File f2=new File("gg.txt");
        System.out.println("File是否存在："+f2.exists());
        System.out.println("File是否是目录："+f2.isDirectory());
        System.out.println("File是否是文件："+f2.isFile());
        File f3=new File("d:/电影/华语/大陆");
        boolean flag=f3.mkdir();
        System.out.println(flag);
    }
}
