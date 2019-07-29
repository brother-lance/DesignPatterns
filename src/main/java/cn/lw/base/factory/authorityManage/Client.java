package cn.lw.base.factory.authorityManage;

/**
 * 项目名称：DesignPatterns
 * 类 名 称：Client
 * 类 描 述：客户端测试类
 * 创建时间：2019-07-29 23:10
 * 创 建 人：Lance.WU
 */
public class Client {

    public static void main(String[] args) {
        try{
            User user;
            UserDAO userDAO = new UserDAO();
            int permission = userDAO.findPermission("zhangsan", "123456");


            User userInfo = UserFactory.getUser(permission);

            userInfo.sameOpertaion();
            userInfo.diffOperation();

        }catch (Exception e){
            e.printStackTrace();
        }
        
    }
}
