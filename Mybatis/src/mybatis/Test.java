package mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test {
	public static void main(String[] args) throws IOException {
		String resource = "config.xml";
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
		
		SqlSession session = sqlMapper.openSession();
		
//		String statment = "userMapper.insertUser";
//		User u = new User();
//		u.setId(10);
//		u.setName("1000");
//		u.setPass("1000");
//		session.insert(statment, u);
//		session.commit();

//		String statment = "userMapper.updateUser";
//		User u1 = new User();
//		u1.setId(10);
//		u1.setName("1001");
//		u1.setPass("1001");
//		session.update(statment, u1);
//		//insert update delete执行完成后必须提交或回滚事务
//		session.commit();
//		
//		String statment = "userMapper.deleteUser";
//		User u1 = new User();
//		u1.setId(1);
//		session.delete(statment, u1);
//		session.commit();
//		
		
//String statment = "userMapper.selectUserByUp";
//		
//		User u = new User();
//		u.setId(1);
//		u.setName("555");
//		u.setPass("dsd");
//		
//		User u1 = new User();
//		u1.setId(10);
//		u1.setName("1000");
//		u1.setPass("1000");
//		
//		session.insert(statment, u1);
//		session.insert(statment, u);
//		//insert update delete执行完成后必须提交或回滚事务
//		session.commit();
		
			
//		String statment = "userMapper.selectUserByUp";
//		
//		User u = new User();
//		u.setName("aaa");
//		u.setPass("111");
//		User u1 = session.selectOne(statment, u);
//		System.out.println(u1);
//		
		String statment = "userMapper.selectUser";
		List<User> list = session.selectList(statment);
		System.out.println(list);
	
	}

}
