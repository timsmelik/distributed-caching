package nl.timsmelik.distributedcaching

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.InitializingBean
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.stereotype.Component

@Component
@ConditionalOnProperty(prefix = "distributed-caching", name = ["should-create-person"])
class CreatePerson(
    private val personRepository: PersonRepository
) : InitializingBean {
    override fun afterPropertiesSet() {
        logger.info("Creating person")
        personRepository.save(Person(name = "Tim"))
    }

    companion object {
        val logger = LoggerFactory.getLogger(javaClass)
    }
}
