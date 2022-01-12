package com.pk.enablement.superadmin.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pk.enablement.superadmin.entity.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Long> {

}
