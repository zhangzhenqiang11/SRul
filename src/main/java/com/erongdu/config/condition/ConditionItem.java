package com.erongdu.config.condition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 条件收集器
 * Created by syq on 2016/12/13.
 */
public class ConditionItem<T> implements Iterator<Object[]> {


    private List<String> opts;

    private List<T> values;

    private int point = 0;//初始化时循环计数point指向表头

    private int length = 0;//初始化表长为0，此时表中无数据


    public ConditionItem() {
        this.opts = new ArrayList<>();
        this.values = new ArrayList<>();
    }


    /**
     * 没添加一组元素，就增加表的长度，这两个list的长度毕竟保证统一
     *
     * @param opt
     * @param value
     */
    public void add(String opt, T value) {
        opts.add(opt);
        values.add(value);
        length++;
    }


    @Override
    public boolean hasNext() {
        if (point >= length) {
            this.reset();
            return false;
        }
        return true;
    }

    @Override
    public Object[] next() {
        Object[] objs = new Object[2];
        objs[0] = opts.get(point);
        objs[1] = values.get(point);
        point++;
        return objs;
    }

    @Override
    public void remove() {
    }

    private void reset() {
        this.point = 0;
    }
}