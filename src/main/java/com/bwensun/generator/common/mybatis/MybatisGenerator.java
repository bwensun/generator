package com.bwensun.generator.common.mybatis;

import org.mybatis.generator.api.ShellRunner;

/**
 * @author bwensun
 * @date 2019/12/17
 */
public class MybatisGenerator {
    public static void main(String[] args) {
        String path = "D:\\IdeaWorkSpace\\study\\generator\\src\\main\\resources\\generator.xml";
        args = new String[]{"-configfile", path, "-overwrite"};
        ShellRunner.main(args);
    }
}