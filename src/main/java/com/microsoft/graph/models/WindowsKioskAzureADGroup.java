package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsKioskAzureADGroup extends WindowsKioskUser implements Parsable {
    /** The display name of the AzureAD group that will be locked to this kiosk configuration */
    private String _displayName;
    /** The ID of the AzureAD group that will be locked to this kiosk configuration */
    private String _groupId;
    /**
     * Instantiates a new WindowsKioskAzureADGroup and sets the default values.
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
     * @return a WindowsKioskAzureADGroup
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
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsKioskAzureADGroup currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("groupId", (n) -> { currentObject.setGroupId(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the groupId property value. The ID of the AzureAD group that will be locked to this kiosk configuration
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupId() {
        return this._groupId;
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
        this._displayName = value;
    }
    /**
     * Sets the groupId property value. The ID of the AzureAD group that will be locked to this kiosk configuration
     * @param value Value to set for the groupId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupId(@javax.annotation.Nullable final String value) {
        this._groupId = value;
    }
}
