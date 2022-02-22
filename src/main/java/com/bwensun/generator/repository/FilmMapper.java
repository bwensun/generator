package com.bwensun.generator.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bwensun.generator.domain.FilmEntity;
import org.springframework.stereotype.Repository;

/**
 * 电影mapper
 *
 * @author 郑建雄
 * @date 2021/4/24
 */
@Repository
public interface FilmMapper extends BaseMapper<FilmEntity> {
}
