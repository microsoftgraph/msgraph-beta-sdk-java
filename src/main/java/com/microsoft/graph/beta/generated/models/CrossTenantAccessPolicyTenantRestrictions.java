package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CrossTenantAccessPolicyTenantRestrictions extends CrossTenantAccessPolicyB2BSetting implements Parsable {
    /**
     * Instantiates a new CrossTenantAccessPolicyTenantRestrictions and sets the default values.
     */
    public CrossTenantAccessPolicyTenantRestrictions() {
        super();
        this.setOdataType("#microsoft.graph.crossTenantAccessPolicyTenantRestrictions");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CrossTenantAccessPolicyTenantRestrictions
     */
    @jakarta.annotation.Nonnull
    public static CrossTenantAccessPolicyTenantRestrictions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantAccessPolicyTenantRestrictions();
    }
    /**
     * Gets the devices property value. Defines the rule for filtering devices and whether devices satisfying the rule should be allowed or blocked. Not implemented.
     * @return a DevicesFilter
     */
    @jakarta.annotation.Nullable
    public DevicesFilter getDevices() {
        return this.backingStore.get("devices");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("devices", (n) -> { this.setDevices(n.getObjectValue(DevicesFilter::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("devices", this.getDevices());
    }
    /**
     * Sets the devices property value. Defines the rule for filtering devices and whether devices satisfying the rule should be allowed or blocked. Not implemented.
     * @param value Value to set for the devices property.
     */
    public void setDevices(@jakarta.annotation.Nullable final DevicesFilter value) {
        this.backingStore.set("devices", value);
    }
}
