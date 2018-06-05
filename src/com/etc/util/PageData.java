package com.etc.util;


import java.util.List;

/**
 * ��ҳ������
 * @param <T>
 */
public class PageData<T> {
	private List<T> data; // ���ҵ�����

	private Integer total; // �ܼ�¼��

	private Integer pageSize;// ÿҳ����

	private Integer page;// �ڼ�ҳҳ��
	
	private Integer toTalPage;

	public PageData() {
		super();
	}

	public PageData(List<T> data, Integer total, Integer pageSize, Integer page) {
		super();
		this.data = data;
		this.total = total;
		this.pageSize = pageSize;
		this.page = page;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public int getTotalPage() {
		//		20(��)/5(��)=4(ҳ)
		int num = total / pageSize; 
		//����ܼ�¼����ҳ���ļ�¼������,��ô������һҳ
		if (total % pageSize != 0)
			num++;
		return num;
	}

	@Override
	public String toString() {
		return "{total:" + total + ",data:" + data + "}";
	}
}
