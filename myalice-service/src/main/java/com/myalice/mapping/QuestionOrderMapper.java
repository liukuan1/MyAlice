package com.myalice.mapping;

import com.myalice.domain.QuestionOrder;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface QuestionOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_order
     *
     * @mbg.generated
     */
    @Delete({
        "delete from question_order",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_order
     *
     * @mbg.generated
     */
    @Insert({
        "insert into question_order (id, create_time, ",
        "create_user, solved_time, ",
        "state, question_type, ",
        "question_summary, question_content)",
        "values (#{id,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{createUser,jdbcType=VARCHAR}, #{solvedTime,jdbcType=TIMESTAMP}, ",
        "#{state,jdbcType=TINYINT}, #{questionType,jdbcType=TINYINT}, ",
        "#{questionSummary,jdbcType=VARCHAR}, #{questionContent,jdbcType=VARCHAR})"
    })
    int insert(QuestionOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_order
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, create_time, create_user, solved_time, state, question_type, question_summary, ",
        "question_content",
        "from question_order",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.VARCHAR),
        @Result(column="solved_time", property="solvedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="state", property="state", jdbcType=JdbcType.TINYINT),
        @Result(column="question_type", property="questionType", jdbcType=JdbcType.TINYINT),
        @Result(column="question_summary", property="questionSummary", jdbcType=JdbcType.VARCHAR),
        @Result(column="question_content", property="questionContent", jdbcType=JdbcType.VARCHAR)
    })
    QuestionOrder selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_order
     *
     * @mbg.generated
     */
    @Select({
    	"<script>" ,
        "select",
        "id, create_time, create_user, solved_time, state, question_type, question_summary, ",
        "question_content",
        "from question_order" ,
        "<trim prefix=\"WHERE\" prefixOverrides=\"AND\">" 
       , "<if test=\"qo.id != null and qo.id != ''\">AND id=#{qo.id,jdbcType=VARCHAR}</if>"
       , "<if test=\"qo.createUser != null and qo.createUser != ''\">AND create_user=#{qo.createUser,jdbcType=VARCHAR}</if>" 
       , "<if test=\"qo.questionContent != null and qo.questionContent != ''\">AND question_content like CONCAT('%' , #{qo.questionContent,jdbcType=VARCHAR} , '%')</if>"
       , "<if test=\"sTime != null\">AND create_time &gt; #{eTime,jdbcType=DATETIME}</if>"
       , "<if test=\"eTime != null\">AND create_time &lt; #{eTime,jdbcType=DATETIME}</if>"
        ,  "</trim>" , 
    	"</script>"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_user", property="createUser", jdbcType=JdbcType.VARCHAR),
        @Result(column="solved_time", property="solvedTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="state", property="state", jdbcType=JdbcType.TINYINT),
        @Result(column="question_type", property="questionType", jdbcType=JdbcType.TINYINT),
        @Result(column="question_summary", property="questionSummary", jdbcType=JdbcType.VARCHAR),
        @Result(column="question_content", property="questionContent", jdbcType=JdbcType.VARCHAR)
    })
    List<QuestionOrder> query(@Param("qo")QuestionOrder qo,@Param("sTime") Date sTime,@Param("eTime") Date eTime);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_order
     *
     * @mbg.generated
     */
    @Update({
        "update question_order",
        "set create_time = #{createTime,jdbcType=TIMESTAMP},",
          "create_user = #{createUser,jdbcType=VARCHAR},",
          "solved_time = #{solvedTime,jdbcType=TIMESTAMP},",
          "state = #{state,jdbcType=TINYINT},",
          "question_type = #{questionType,jdbcType=TINYINT},",
          "question_summary = #{questionSummary,jdbcType=VARCHAR},",
          "question_content = #{questionContent,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(QuestionOrder record);
}