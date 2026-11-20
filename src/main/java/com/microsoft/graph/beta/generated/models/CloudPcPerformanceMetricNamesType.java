package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcPerformanceMetricNamesType implements ValuedEnum {
    CpuUsageInPercentage("cpuUsageInPercentage"),
    AvailableMemoryInPercentage("availableMemoryInPercentage"),
    VmAvailability("vmAvailability"),
    NetworkInboundInBytes("networkInboundInBytes"),
    NetworkOutboundInBytes("networkOutboundInBytes"),
    InboundFlowsCount("inboundFlowsCount"),
    OutboundFlowsCount("outboundFlowsCount"),
    DiskReadInBytes("diskReadInBytes"),
    DiskWriteInBytes("diskWriteInBytes"),
    DiskReadOperationsPerSecond("diskReadOperationsPerSecond"),
    DiskWriteOperationsPerSecond("diskWriteOperationsPerSecond"),
    OsDiskLatencyInMs("osDiskLatencyInMs"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcPerformanceMetricNamesType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcPerformanceMetricNamesType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "cpuUsageInPercentage": return CpuUsageInPercentage;
            case "availableMemoryInPercentage": return AvailableMemoryInPercentage;
            case "vmAvailability": return VmAvailability;
            case "networkInboundInBytes": return NetworkInboundInBytes;
            case "networkOutboundInBytes": return NetworkOutboundInBytes;
            case "inboundFlowsCount": return InboundFlowsCount;
            case "outboundFlowsCount": return OutboundFlowsCount;
            case "diskReadInBytes": return DiskReadInBytes;
            case "diskWriteInBytes": return DiskWriteInBytes;
            case "diskReadOperationsPerSecond": return DiskReadOperationsPerSecond;
            case "diskWriteOperationsPerSecond": return DiskWriteOperationsPerSecond;
            case "osDiskLatencyInMs": return OsDiskLatencyInMs;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
