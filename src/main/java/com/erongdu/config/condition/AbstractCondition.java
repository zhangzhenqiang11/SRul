package com.erongdu.config.condition;

import com.erongdu.config.build.RuleBuilder;
import com.erongdu.config.build.RuleConfigurerAdapter;
import com.erongdu.config.rule.Rule;
import com.erongdu.utils.ConditionOpt;

/**
 * Created by syq on 2016/12/12.
 */
public class AbstractCondition<T> implements Condition<T> {


    protected ConditionOpt conditionOpt;


    protected T value;


    @Override
    public Condition<T> opt(ConditionOpt opt) {
        this.conditionOpt = opt;
        return this;
    }


    @Override
    public Condition<T> value(T t) {
        this.value = t;
        return this;
    }

    @Override
    public ConditionOpt getOpt() {
        return conditionOpt;
    }


    @Override
    public T getValue() {
        return value;
    }
}