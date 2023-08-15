package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The security baseline template of the account
 */
public class SecurityBaselineTemplate extends DeviceManagementTemplate implements Parsable {
    /**
     * The security baseline per category device state summary
     */
    private java.util.List<SecurityBaselineCategoryStateSummary> categoryDeviceStateSummaries;
    /**
     * The security baseline device states
     */
    private java.util.List<SecurityBaselineDeviceState> deviceStates;
    /**
     * The security baseline device state summary
     */
    private SecurityBaselineStateSummary deviceStateSummary;
    /**
     * Instantiates a new securityBaselineTemplate and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public SecurityBaselineTemplate() {
        super();
        this.setOdataType("#microsoft.graph.securityBaselineTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a securityBaselineTemplate
     */
    @jakarta.annotation.Nonnull
    public static SecurityBaselineTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityBaselineTemplate();
    }
    /**
     * Gets the categoryDeviceStateSummaries property value. The security baseline per category device state summary
     * @return a securityBaselineCategoryStateSummary
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecurityBaselineCategoryStateSummary> getCategoryDeviceStateSummaries() {
        return this.categoryDeviceStateSummaries;
    }
    /**
     * Gets the deviceStates property value. The security baseline device states
     * @return a securityBaselineDeviceState
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecurityBaselineDeviceState> getDeviceStates() {
        return this.deviceStates;
    }
    /**
     * Gets the deviceStateSummary property value. The security baseline device state summary
     * @return a securityBaselineStateSummary
     */
    @jakarta.annotation.Nullable
    public SecurityBaselineStateSummary getDeviceStateSummary() {
        return this.deviceStateSummary;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("categoryDeviceStateSummaries", (n) -> { this.setCategoryDeviceStateSummaries(n.getCollectionOfObjectValues(SecurityBaselineCategoryStateSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceStates", (n) -> { this.setDeviceStates(n.getCollectionOfObjectValues(SecurityBaselineDeviceState::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceStateSummary", (n) -> { this.setDeviceStateSummary(n.getObjectValue(SecurityBaselineStateSummary::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("categoryDeviceStateSummaries", this.getCategoryDeviceStateSummaries());
        writer.writeCollectionOfObjectValues("deviceStates", this.getDeviceStates());
        writer.writeObjectValue("deviceStateSummary", this.getDeviceStateSummary());
    }
    /**
     * Sets the categoryDeviceStateSummaries property value. The security baseline per category device state summary
     * @param value Value to set for the categoryDeviceStateSummaries property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setCategoryDeviceStateSummaries(@jakarta.annotation.Nullable final java.util.List<SecurityBaselineCategoryStateSummary> value) {
        this.categoryDeviceStateSummaries = value;
    }
    /**
     * Sets the deviceStates property value. The security baseline device states
     * @param value Value to set for the deviceStates property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceStates(@jakarta.annotation.Nullable final java.util.List<SecurityBaselineDeviceState> value) {
        this.deviceStates = value;
    }
    /**
     * Sets the deviceStateSummary property value. The security baseline device state summary
     * @param value Value to set for the deviceStateSummary property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceStateSummary(@jakarta.annotation.Nullable final SecurityBaselineStateSummary value) {
        this.deviceStateSummary = value;
    }
}
