package org.meerfolk.aaas.presentation

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication

@SpringBootApplication
@EntityScan("org.meerfolk.aaas.infrastructure")
@EnableJpaRepositories("org.meerfolk.aaas.infrastructure")
class AaasApplication

fun main(args: Array<String>) {
	runApplication<AaasApplication>(*args)
}
