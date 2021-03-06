package com.douma.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.douma.entity.ExamManager;

import java.util.List;

public interface ExamService {

    /**
     * 分页查询所有的测验科目
     * @param page
     * @return
     */
    IPage<ExamManager> findAll(Page<ExamManager> page);


    /**
     * 不要忘记不分页返回的是一个 list 集合
     * @return
     */
    List<ExamManager> findAllUnPage();

    /**
     * 查询最后一条记录
     * @return
     */
    ExamManager findByPaperId();

    /**
     * 添加一场考试
     * @param examManager
     * @return
     */
    int add(ExamManager examManager);

    /**
     * 根据考试编码查找试卷信息
     * @param examCode
     * @return
     */
    ExamManager findByExamCode(Integer examCode);

    /**
     *更新试卷的数据
     * @param examManager
     * @return
     */
    int save(ExamManager examManager);

    /**
     *删除试卷信息
     * @param examCode
     * @return
     */
    int move(Integer examCode);
}
