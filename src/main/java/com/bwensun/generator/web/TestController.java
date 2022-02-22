package com.bwensun.generator.web;

import com.bwensun.generator.domain.FilmEntity;
import com.bwensun.generator.service.FilmService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述
 *
 * @author 郑建雄
 * @date 2022/2/22
 */
@RestController
public class TestController {

    @Resource
    private FilmService filmService;

    @RequestMapping("test")
    public List<FilmEntity> test(){
        final List<FilmEntity> list = filmService.lambdaQuery().list();
        System.out.println("success");
        return list;
    }
}
