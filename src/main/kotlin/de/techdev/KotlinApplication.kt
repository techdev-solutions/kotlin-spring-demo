package de.techdev

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import javax.annotation.PostConstruct

@SpringBootApplication
class KotlinApplication {

    @Autowired lateinit var repository: MessageRepository

    @PostConstruct
    private fun init() {
        with(repository) {
            save(Message("Message #1"))
            save(Message("Message #2"))
            save(Message("Message #3"))
        }
    }

}

fun main(args: Array<String>) {
    SpringApplication.run(KotlinApplication::class.java, *args)
}
