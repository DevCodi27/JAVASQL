package com.db.examples.test;

import com.db.example.dao.EmployeeDao;
import com.db.examples.vo.EmployeeVo;

public class EmployeeDaoTest {

    public static void main(String[] args) throws Exception {

        EmployeeVo vo = new EmployeeVo();
        EmployeeDao er = new EmployeeDao();
        er.select();




    }

}
