package com.etc.dao;

import java.util.List;

import com.etc.entity.Message;

public interface MessageDao {

	// ����
	public boolean addMessage(Message message);

	// ɾ��
	public boolean delMessage(int messageid);

	// �޸�
	public boolean updateMessage(Message messgae);

	// ��ѯ
	public List<Message> queryAllMessage();

}
