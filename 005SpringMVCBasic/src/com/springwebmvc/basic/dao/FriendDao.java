package com.springwebmvc.basic.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springwebmvc.basic.bean.Friend;
import com.springwebmvc.basic.entity.FriendEntity;

@Repository("friendDao")
public class FriendDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public void saveFriend(Friend friend) {
		// TODO Auto-generated method stub
		FriendEntity friendEntity = new FriendEntity();
		friendEntity.setFriendName(friend.getFriendName());
		friendEntity.setFriendLocation(friend.getFriendLocation());
		friendEntity.setId(friend.getId());
		
		Session session = null;
		
		try { 
			session = sessionFactory.getCurrentSession();
		}catch (HibernateException e){ 
			session = sessionFactory.openSession();
		}
		
		session.saveOrUpdate(friendEntity);
		
		session.flush();
		
		
		
	}

	public List listAll() {
		// TODO Auto-generated method stub
		Session session = null;
		
		try { 
			session = sessionFactory.getCurrentSession();
		}catch (HibernateException e){ 
			session = sessionFactory.openSession();
		}
		
		return session.createCriteria(FriendEntity.class).list();
		
		
	}

	public List deleteFriend(int id) {
		// TODO Auto-generated method stub
		Session session = null;
		
		try { 
			session = sessionFactory.getCurrentSession();
		}catch (HibernateException e){ 
			session = sessionFactory.openSession();
		}
		//get the instance of FriendEntity using id which is received
		FriendEntity fe = session.get(FriendEntity.class, id);
		//delete the friendEntity instance using ORM
		session.delete(fe);
		session.flush();
		//return the list if remaining friends
		return session.createCriteria(FriendEntity.class).list();
	}

	public FriendEntity getFriendById(int id) {
		// TODO Auto-generated method stub
		Session session = null;
		
		try { 
			session = sessionFactory.getCurrentSession();
		}catch (HibernateException e){ 
			session = sessionFactory.openSession();
		}
		
		
		return session.get(FriendEntity.class, id);
		
		
		
		
	}

	public void updateFriend(FriendEntity fe) {
		// TODO Auto-generated method stub
		Session session = null;
		
		try { 
			session = sessionFactory.getCurrentSession();
		}catch (HibernateException e){ 
			session = sessionFactory.openSession();
		}
		
		session.update(fe);
		session.flush();
		
	}

}
