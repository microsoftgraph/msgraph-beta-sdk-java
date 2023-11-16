package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EntitlementManagementSettings extends Entity implements Parsable {
    /**
     * Instantiates a new EntitlementManagementSettings and sets the default values.
     */
    public EntitlementManagementSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EntitlementManagementSettings
     */
    @jakarta.annotation.Nonnull
    public static EntitlementManagementSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EntitlementManagementSettings();
    }
    /**
     * Gets the daysUntilExternalUserDeletedAfterBlocked property value. If externalUserLifecycleAction is BlockSignInAndDelete, the number of days after an external user is blocked from sign in before their account is deleted.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDaysUntilExternalUserDeletedAfterBlocked() {
        return this.BackingStore.get("daysUntilExternalUserDeletedAfterBlocked");
    }
    /**
     * Gets the externalUserLifecycleAction property value. One of None, BlockSignIn, or BlockSignInAndDelete.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalUserLifecycleAction() {
        return this.BackingStore.get("externalUserLifecycleAction");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("daysUntilExternalUserDeletedAfterBlocked", (n) -> { this.setDaysUntilExternalUserDeletedAfterBlocked(n.getIntegerValue()); });
        deserializerMap.put("externalUserLifecycleAction", (n) -> { this.setExternalUserLifecycleAction(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("daysUntilExternalUserDeletedAfterBlocked", this.getDaysUntilExternalUserDeletedAfterBlocked());
        writer.writeStringValue("externalUserLifecycleAction", this.getExternalUserLifecycleAction());
    }
    /**
     * Sets the daysUntilExternalUserDeletedAfterBlocked property value. If externalUserLifecycleAction is BlockSignInAndDelete, the number of days after an external user is blocked from sign in before their account is deleted.
     * @param value Value to set for the daysUntilExternalUserDeletedAfterBlocked property.
     */
    public void setDaysUntilExternalUserDeletedAfterBlocked(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("daysUntilExternalUserDeletedAfterBlocked", value);
    }
    /**
     * Sets the externalUserLifecycleAction property value. One of None, BlockSignIn, or BlockSignInAndDelete.
     * @param value Value to set for the externalUserLifecycleAction property.
     */
    public void setExternalUserLifecycleAction(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("externalUserLifecycleAction", value);
    }
}
