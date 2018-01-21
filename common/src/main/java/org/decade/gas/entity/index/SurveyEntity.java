package org.decade.gas.entity.index;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class For:
 *  网上调查
 * @auther: decade
 * @date: 17-12-25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SurveyEntity {
    private int id;
    private String surveyId;    /*事务id*/
    private String title;       /*标题*/
    private String content;     /*内容*/
    private String startTime;   /*调查时间*/
    private String endTime;     /*结束时间*/
    private int state;          /*状态*/
    private String updateTime;  /*更新时间*/
    private String createTime;  /*创建时间*/

}
