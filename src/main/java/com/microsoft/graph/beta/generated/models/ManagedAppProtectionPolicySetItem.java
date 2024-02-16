package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A class containing the properties used for managed app protection PolicySetItem.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedAppProtectionPolicySetItem extends PolicySetItem implements Parsable {
    /**
     * Instantiates a new {@link ManagedAppProtectionPolicySetItem} and sets the default values.
     */
    public ManagedAppProtectionPolicySetItem() {
        super();
        this.setOdataType("#microsoft.graph.managedAppProtectionPolicySetItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ManagedAppProtectionPolicySetItem}
     */
    @jakarta.annotation.Nonnull
    public static ManagedAppProtectionPolicySetItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedAppProtectionPolicySetItem();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("targetedAppManagementLevels", (n) -> { this.setTargetedAppManagementLevels(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the targetedAppManagementLevels property value. TargetedAppManagementLevels of the ManagedAppPolicySetItem.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetedAppManagementLevels() {
        return this.backingStore.get("targetedAppManagementLevels");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("targetedAppManagementLevels", this.getTargetedAppManagementLevels());
    }
    /**
     * Sets the targetedAppManagementLevels property value. TargetedAppManagementLevels of the ManagedAppPolicySetItem.
     * @param value Value to set for the targetedAppManagementLevels property.
     */
    public void setTargetedAppManagementLevels(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetedAppManagementLevels", value);
    }
}
