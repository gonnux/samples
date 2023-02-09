package com.example.demo

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext

//@SpringBootTest(classes = [MyTestConfig::class])
@SpringBootTest(classes = [MyConfig::class])
class DemoApplicationTests(
    private val ctx: ApplicationContext
) {

	@Test
	fun contextLoads() {
        println("---------------------------")
        ctx.getBeanDefinitionNames().forEach {
            println(it)
        }
	}

}
