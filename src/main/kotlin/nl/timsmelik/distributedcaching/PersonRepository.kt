package nl.timsmelik.distributedcaching

import org.springframework.data.repository.CrudRepository

interface PersonRepository : CrudRepository<Person, Long>
