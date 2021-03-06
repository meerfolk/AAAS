package org.meerfolk.aaas.infrastructure.common

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class BaseEntity (
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,
)