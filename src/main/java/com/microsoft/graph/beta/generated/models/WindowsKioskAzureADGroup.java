package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The class used to identify an AzureAD group for the kiosk configuration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsKioskAzureADGroup extends WindowsKioskUser implements Parsable {
    /**
     * Instantiates a new WindowsKioskAzureADGroup and sets the default values.
     */
    public WindowsKioskAzureADGroup() {
        super();
        this.setOdataType("#microsoft.graph.windowsKioskAzureADGroup");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsKioskAzureADGroup
     */
    @jakarta.annotation.Nonnull
    public static WindowsKioskAzureADGroup createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskAzureADGroup();
    }
    /**
     * Gets the displayName property value. The display name of the AzureAD group that will be locked to this kiosk configuration
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("groupId", (n) -> { this.setGroupId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupId property value. The ID of the AzureAD group that will be locked to this kiosk configuration
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGroupId() {
        return this.backingStore.get("groupId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("groupId", this.getGroupId());
    }
    /**
     * Sets the displayName property value. The display name of the AzureAD group that will be locked to this kiosk configuration
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the groupId property value. The ID of the AzureAD group that will be locked to this kiosk configuration
     * @param value Value to set for the groupId property.
     */
    public void setGroupId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("groupId", value);
    }
}
