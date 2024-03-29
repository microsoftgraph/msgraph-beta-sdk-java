package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The security baseline template of the account
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SecurityBaselineTemplate extends DeviceManagementTemplate implements Parsable {
    /**
     * Instantiates a new {@link SecurityBaselineTemplate} and sets the default values.
     */
    public SecurityBaselineTemplate() {
        super();
        this.setOdataType("#microsoft.graph.securityBaselineTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SecurityBaselineTemplate}
     */
    @jakarta.annotation.Nonnull
    public static SecurityBaselineTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SecurityBaselineTemplate();
    }
    /**
     * Gets the categoryDeviceStateSummaries property value. The security baseline per category device state summary
     * @return a {@link java.util.List<SecurityBaselineCategoryStateSummary>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecurityBaselineCategoryStateSummary> getCategoryDeviceStateSummaries() {
        return this.backingStore.get("categoryDeviceStateSummaries");
    }
    /**
     * Gets the deviceStates property value. The security baseline device states
     * @return a {@link java.util.List<SecurityBaselineDeviceState>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecurityBaselineDeviceState> getDeviceStates() {
        return this.backingStore.get("deviceStates");
    }
    /**
     * Gets the deviceStateSummary property value. The security baseline device state summary
     * @return a {@link SecurityBaselineStateSummary}
     */
    @jakarta.annotation.Nullable
    public SecurityBaselineStateSummary getDeviceStateSummary() {
        return this.backingStore.get("deviceStateSummary");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
     */
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
     */
    public void setCategoryDeviceStateSummaries(@jakarta.annotation.Nullable final java.util.List<SecurityBaselineCategoryStateSummary> value) {
        this.backingStore.set("categoryDeviceStateSummaries", value);
    }
    /**
     * Sets the deviceStates property value. The security baseline device states
     * @param value Value to set for the deviceStates property.
     */
    public void setDeviceStates(@jakarta.annotation.Nullable final java.util.List<SecurityBaselineDeviceState> value) {
        this.backingStore.set("deviceStates", value);
    }
    /**
     * Sets the deviceStateSummary property value. The security baseline device state summary
     * @param value Value to set for the deviceStateSummary property.
     */
    public void setDeviceStateSummary(@jakarta.annotation.Nullable final SecurityBaselineStateSummary value) {
        this.backingStore.set("deviceStateSummary", value);
    }
}
