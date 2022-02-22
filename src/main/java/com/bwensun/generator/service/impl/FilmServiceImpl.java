package com.bwensun.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bwensun.generator.domain.FilmEntity;
import com.bwensun.generator.repository.FilmMapper;
import com.bwensun.generator.service.FilmService;
import org.springframework.stereotype.Service;

/**
 * 电影服务实现
 *
 * @author 郑建雄
 * @date 2021/4/24
 */
@Service
public class FilmServiceImpl extends ServiceImpl<FilmMapper, FilmEntity> implements FilmService {

}
