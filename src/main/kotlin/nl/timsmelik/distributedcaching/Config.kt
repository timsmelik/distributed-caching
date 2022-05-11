package nl.timsmelik.distributedcaching

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "distributed-caching")
class Config(
    val shouldCreatePerson: Boolean
)
