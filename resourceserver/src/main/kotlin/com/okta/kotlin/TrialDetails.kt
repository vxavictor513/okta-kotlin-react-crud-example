package com.okta.kotlin

import java.math.BigDecimal

data class TrialDetails(
        var osName: String?,
        var osArchitecture: String?,
        var osVersion: String?,
        var systemCpuLoad: BigDecimal?,
        var freePhysicalMemorySize: BigDecimal?,
        var totalPhysicalMemorySize: BigDecimal?,
) {}
