package com.panxia;

import org.mybatis.generator.api.ShellRunner;

public class GenerateMybatis {
    public static void main(String[] args) {

        args = new String[] { "-configfile",System.getProperty("user.dir")+"/src/main/resource/mybatis.xml", "-overwrite" };
        ShellRunner.main(args);
    }
}
