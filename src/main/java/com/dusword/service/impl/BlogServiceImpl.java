package com.dusword.service.impl;

import com.dusword.entity.Blog;
import com.dusword.mapper.BlogMapper;
import com.dusword.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lixiangjie
 * @since 2021-02-08
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
