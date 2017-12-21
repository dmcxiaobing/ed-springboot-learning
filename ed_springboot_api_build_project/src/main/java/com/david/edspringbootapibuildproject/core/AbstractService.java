package com.david.edspringbootapibuildproject.core;

/**
 * @Author ：David
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 */
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Condition;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * 基于通用MyBatis Mapper插件的Service接口的实现
 */
public abstract class AbstractService<T> implements Service<T> {

    @Autowired
    protected Mapper<T> mapper;

    private Class<T> modelClass;    // 当前泛型真实类型的Class
    /**
     * 构造实际的Class model类型
     */
    public AbstractService() {
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
        modelClass = (Class<T>) pt.getActualTypeArguments()[0];
    }
    /**
     * 保存，插入一个model
     */
    public void save(T model) {
        mapper.insertSelective(model);
    }
    /**
     * 插入集合。
     */
    public void save(List<T> models) {
        mapper.insertList(models);
    }
    /**
     * 根据主键id删除
     */
    public void deleteById(Integer id) {
        mapper.deleteByPrimaryKey(id);
    }
    /**
     * 根据id删除
     */
    public void deleteByIds(String ids) {
        mapper.deleteByIds(ids);
    }
    /**
     * 更新model
     */
    public void update(T model) {
        mapper.updateByPrimaryKeySelective(model);
    }
    /**
     * 根据主键id查找对象
     */
    public T findById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public T findBy(String fieldName, Object value) throws TooManyResultsException {
        try {
            T model = modelClass.newInstance();
            Field field = modelClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(model, value);
            return mapper.selectOne(model);
        } catch (ReflectiveOperationException e) {
            throw new ServiceException(e.getMessage(), e);
        }
    }

    public List<T> findByIds(String ids) {
        return mapper.selectByIds(ids);
    }

    public List<T> findByCondition(Condition condition) {
        return mapper.selectByCondition(condition);
    }

    public List<T> findAll() {
        return mapper.selectAll();
    }
}
