package com.cfysu.pattern.chain;

/**
 * @Author canglong
 * @Date 2020/5/13
 */
public interface Node<I, O> {
    Response<O> process(Request<I> request);
}
