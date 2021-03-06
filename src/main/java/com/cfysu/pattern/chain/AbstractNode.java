package com.cfysu.pattern.chain;

/**
 * @Author canglong
 * @Date 2019/3/29
 */
public abstract class AbstractNode<I, O> implements Node<I, O>{

    protected Node<I, O> next;
    protected String nodeName = this.getClass().getSimpleName();

    protected AbstractNode(){}
    protected AbstractNode(Node<I, O> node){
        this.next = node;
    }

    @Override
    public Response<O> process(Request<I> request) {
        if(support(request)){
            request.markProcessed(nodeName);
            return doProcess(request);
        }

        if(next != null){
            return next.process(request);
        }
        return null;
    }

    /**
     * 此节点是否支持此请求
     * @param request
     * @return
     */
    public abstract boolean support(Request<I> request);

    /**
     * 实际处理请求
     * @param request
     * @return
     */
    public abstract Response<O> doProcess(Request<I> request);

}
