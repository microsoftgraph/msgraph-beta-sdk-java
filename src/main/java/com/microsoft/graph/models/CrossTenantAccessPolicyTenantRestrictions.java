package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CrossTenantAccessPolicyTenantRestrictions extends CrossTenantAccessPolicyB2BSetting implements Parsable {
    /** The devices property */
    private DevicesFilter _devices;
    /**
     * Instantiates a new CrossTenantAccessPolicyTenantRestrictions and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CrossTenantAccessPolicyTenantRestrictions() {
        super();
        this.setOdataType("#microsoft.graph.crossTenantAccessPolicyTenantRestrictions");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CrossTenantAccessPolicyTenantRestrictions
     */
    @javax.annotation.Nonnull
    public static CrossTenantAccessPolicyTenantRestrictions createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantAccessPolicyTenantRestrictions();
    }
    /**
     * Gets the devices property value. The devices property
     * @return a devicesFilter
     */
    @javax.annotation.Nullable
    public DevicesFilter getDevices() {
        return this._devices;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CrossTenantAccessPolicyTenantRestrictions currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("devices", (n) -> { currentObject.setDevices(n.getObjectValue(DevicesFilter::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("devices", this.getDevices());
    }
    /**
     * Sets the devices property value. The devices property
     * @param value Value to set for the devices property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDevices(@javax.annotation.Nullable final DevicesFilter value) {
        this._devices = value;
    }
}
