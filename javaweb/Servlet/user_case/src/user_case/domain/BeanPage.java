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

    @Override
    public String toString() {
        return "BeanPage{" +
                "pageCount=" + pageCount +
                ", currentPage=" + currentPage +
                ", rows=" + rows +
                ", totalCount=" + totalCount +
                ", list=" + list +
                '}';
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
