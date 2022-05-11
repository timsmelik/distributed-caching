package nl.timsmelik.distributedcaching

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.hazelcast.HazelcastAutoConfiguration
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

// @SpringBootApplication(exclude = [HazelcastAutoConfiguration::class])
@SpringBootApplication
@EnableScheduling
@ConfigurationPropertiesScan
class DistributedCachingApplication

fun main(args: Array<String>) {
    runApplication<DistributedCachingApplication>(*args)
}
