package com.etc.service;

import java.util.List;

import com.etc.entity.FriendLink;

public interface FrinendLinkService {
	
	//����
	public boolean addFriendLink(FriendLink friendlink);
	
	
	//ɾ��
	public boolean delFriendLink(int eid);
	
	
	//�޸�
	public boolean updateFriendLink(FriendLink friendlink);
	
	
	
	//��ѯ
	public List<FriendLink> getAllFriendLink();
}
