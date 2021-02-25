package com.okta.kotlin

import com.sun.management.OperatingSystemMXBean
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.lang.management.ManagementFactory

@RestController
class MyController {

    @GetMapping("/trialDetails")
    fun getTrialDetails(): TrialDetails {
        return TrialDetails(
            System.getProperty("os.name"),
            System.getProperty("os.arch"),
            System.getProperty("os.version"),
            ManagementFactory.getPlatformMXBean(OperatingSystemMXBean::class.java).systemCpuLoad.toBigDecimal(),
            ManagementFactory.getPlatformMXBean(OperatingSystemMXBean::class.java).freePhysicalMemorySize.toBigDecimal(),
            ManagementFactory.getPlatformMXBean(OperatingSystemMXBean::class.java).totalPhysicalMemorySize.toBigDecimal(),
        )
    }

}