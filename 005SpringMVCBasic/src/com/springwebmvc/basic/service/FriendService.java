package com.springwebmvc.basic.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springwebmvc.basic.bean.Friend;
import com.springwebmvc.basic.dao.FriendDao;
import com.springwebmvc.basic.entity.FriendEntity;

@Service("friendService")
public class FriendService {
	
	@Autowired
	FriendDao friendDao;

	@Transactional
	public void saveFriend(Friend friend) {
		// TODO Auto-generated method stub
		
		friendDao.saveFriend(friend);
	}

	@Transactional
	public List listAll() {
		// TODO Auto-generated method stub
		return friendDao.listAll();
	}

	@Transactional
	public List deleteFriend(int id) {
		// TODO Auto-generated method stub
		return friendDao.deleteFriend(id);
	}

	@Transactional
	public FriendEntity getFriendById(int id) {
		// TODO Auto-generated method stub
		return friendDao.getFriendById(id);
	}

	@Transactional
	public void updateFriend(FriendEntity fe) {
		// TODO Auto-generated method stub
		friendDao.updateFriend(fe);
	}

}
