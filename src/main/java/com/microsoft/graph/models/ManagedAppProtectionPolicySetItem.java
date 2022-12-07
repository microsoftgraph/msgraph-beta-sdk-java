package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedAppProtectionPolicySetItem extends PolicySetItem implements Parsable {
    /** TargetedAppManagementLevels of the ManagedAppPolicySetItem. */
    private String _targetedAppManagementLevels;
    /**
     * Instantiates a new ManagedAppProtectionPolicySetItem and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedAppProtectionPolicySetItem() {
        super();
        this.setOdataType("#microsoft.graph.managedAppProtectionPolicySetItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedAppProtectionPolicySetItem
     */
    @javax.annotation.Nonnull
    public static ManagedAppProtectionPolicySetItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedAppProtectionPolicySetItem();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("targetedAppManagementLevels", (n) -> { this.setTargetedAppManagementLevels(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the targetedAppManagementLevels property value. TargetedAppManagementLevels of the ManagedAppPolicySetItem.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetedAppManagementLevels() {
        return this._targetedAppManagementLevels;
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
        writer.writeStringValue("targetedAppManagementLevels", this.getTargetedAppManagementLevels());
    }
    /**
     * Sets the targetedAppManagementLevels property value. TargetedAppManagementLevels of the ManagedAppPolicySetItem.
     * @param value Value to set for the targetedAppManagementLevels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetedAppManagementLevels(@javax.annotation.Nullable final String value) {
        this._targetedAppManagementLevels = value;
    }
}
