package ru.hse.online.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import ru.hse.online.storage.UserData;

import java.util.UUID;

@Repository
public interface UserRepository extends CassandraRepository<UserData, UUID> {
}

