package com.chentao.sqlmap;

public interface Excutor {

    <T> T query(String sql, Object parameter);

}
