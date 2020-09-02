package user_case.domain;

import java.util.List;

public class BeanPage<T> {

    //  从客户端获取
    //  总页数
    private int pageCount;
    // 当前页数
    private int currentPage;
    // 每页显示条数
    private int rows;

    //  从服务端获取
    //  总条数
    private int totalCount;
    // 查询的每一页的所有记录
    private List<T> list;
}
