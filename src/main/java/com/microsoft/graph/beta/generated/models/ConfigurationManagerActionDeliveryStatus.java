package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Delivery state of Configuration Manager device action
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ConfigurationManagerActionDeliveryStatus implements ValuedEnum {
    /** Pending to deliver the action to ConfigurationManager */
    Unknown("unknown"),
    /** Pending to deliver the action to ConfigurationManager */
    PendingDelivery("pendingDelivery"),
    /** Action is sent to ConfigurationManager Connector service (cloud) */
    DeliveredToConnectorService("deliveredToConnectorService"),
    /** Failed to send the action to ConfigurationManager Connector service (cloud) */
    FailedToDeliverToConnectorService("failedToDeliverToConnectorService"),
    /** Action is delivered to ConfigurationManager on-prem server */
    DeliveredToOnPremisesServer("deliveredToOnPremisesServer");
    public final String value;
    ConfigurationManagerActionDeliveryStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ConfigurationManagerActionDeliveryStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "pendingDelivery": return PendingDelivery;
            case "deliveredToConnectorService": return DeliveredToConnectorService;
            case "failedToDeliverToConnectorService": return FailedToDeliverToConnectorService;
            case "deliveredToOnPremisesServer": return DeliveredToOnPremisesServer;
            default: return null;
        }
    }
}
