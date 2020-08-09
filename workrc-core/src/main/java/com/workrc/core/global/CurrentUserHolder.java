package com.workrc.core.global;

/***
 * 处理当前用户的类
 */
public class CurrentUserHolder {
    private   static final ThreadLocal<Object> currentuser = new ThreadLocal<>();
    /***
     * 该方法需要在用户登录成功后调用 或者每次用户进行校验时写入该值  每次从cookie拿到用户后立即调用该函数
     * @param o 传入的当前用户参数
     */
    public static void  setUser(Object o){
        currentuser.set(o);
    }

    public static Object getCurrentUser(){
        return currentuser.get();
    }

    /**
     * 特殊情况需要手动清除用于，以免对系统造成oom风险
     */
    public static void removeCurrentUser(){
        currentuser.remove();
    }
}
