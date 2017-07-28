package de.techdev

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class MessageController @Autowired constructor(val repository: MessageRepository) {

    @GetMapping("/messages")
    fun messages() = repository.findAll()

    @GetMapping("/messages/search/{query}")
    fun search(@PathVariable query: String) = repository.findByTextContainingIgnoreCase(query)

    @PostMapping("/messages")
    fun add(@RequestBody message: Message) = repository.save(message)

}
