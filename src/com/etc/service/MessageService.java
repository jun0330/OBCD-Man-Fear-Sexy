package com.etc.service;

import java.util.List;

import com.etc.entity.Message;

public interface MessageService {

	// ����
	public boolean addMessage(Message message);

	// ɾ��
	public boolean delMessage(int messageid);

	// �޸�
	public boolean updateMessage(Message message);

	// ��ѯ
	public List<Message> getAllMessage();

}
