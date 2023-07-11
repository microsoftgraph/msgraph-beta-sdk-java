package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user base class used to identify the account info for the kiosk configuration
 */
public class WindowsKioskAzureADGroup extends WindowsKioskUser implements Parsable {
    /**
     * The display name of the AzureAD group that will be locked to this kiosk configuration
     */
    private String displayName;
    /**
     * The ID of the AzureAD group that will be locked to this kiosk configuration
     */
    private String groupId;
    /**
     * Instantiates a new windowsKioskAzureADGroup and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsKioskAzureADGroup() {
        super();
        this.setOdataType("#microsoft.graph.windowsKioskAzureADGroup");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsKioskAzureADGroup
     */
    @javax.annotation.Nonnull
    public static WindowsKioskAzureADGroup createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskAzureADGroup();
    }
    /**
     * Gets the displayName property value. The display name of the AzureAD group that will be locked to this kiosk configuration
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("groupId", (n) -> { this.setGroupId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupId property value. The ID of the AzureAD group that will be locked to this kiosk configuration
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupId() {
        return this.groupId;
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
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("groupId", this.getGroupId());
    }
    /**
     * Sets the displayName property value. The display name of the AzureAD group that will be locked to this kiosk configuration
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the groupId property value. The ID of the AzureAD group that will be locked to this kiosk configuration
     * @param value Value to set for the groupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupId(@javax.annotation.Nullable final String value) {
        this.groupId = value;
    }
}
