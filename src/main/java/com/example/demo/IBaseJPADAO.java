package com.example.demo;

public interface IBaseJPADAO {

	<T extends JPAEntity> T create(T entity);
}
