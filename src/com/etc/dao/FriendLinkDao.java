package com.etc.dao;

import java.util.List;

import com.etc.entity.FriendLink;

public interface FriendLinkDao {

	// ����
	public boolean addFriendLink(FriendLink friendlink);

	// ɾ��
	public boolean delFriendLink(int flid);

	// �޸�
	public boolean updateFriendLink(FriendLink friendlink);

	// ��ѯ
	public List<FriendLink> queryAllFriendLink();

}
