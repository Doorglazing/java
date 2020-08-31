package usercase.service.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import usercase.service.DeleteService;
import usercase.util.JDBCUtils;

public class DeleteServiceImpl implements DeleteService {
       private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public boolean deleteUser() {
        String sql = "delete * from user where ";
        return false;
    }
}
