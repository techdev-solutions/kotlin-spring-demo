package de.techdev

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MessageRepository : CrudRepository<Message, Long> {

    fun findByTextContainingIgnoreCase(query: String): Iterable<Message>

}
