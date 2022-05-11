package nl.timsmelik.distributedcaching

import org.slf4j.LoggerFactory
import org.springframework.data.repository.findByIdOrNull
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service
import java.util.concurrent.TimeUnit.SECONDS

@Service
class Scheduler(
    val personRepository: PersonRepository
) {

    @Scheduled(fixedRate = 3, timeUnit = SECONDS)
    fun query() {
        personRepository.findByIdOrNull(1)
            ?.let { logger.info("Person found: ${it.name}") }
            ?: logger.warn("Person not found")
    }

    companion object {
        val logger = LoggerFactory.getLogger(javaClass)
    }
}
