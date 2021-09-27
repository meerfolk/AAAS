package org.meerfolk.aaas.infrastructure.user

import org.springframework.data.repository.CrudRepository

import org.meerfolk.aaas.infrastructure.user.UserEntity

interface UserRepository: CrudRepository<UserEntity, Long>