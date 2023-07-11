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
public class WindowsKioskLocalGroup extends WindowsKioskUser implements Parsable {
    /**
     * The name of the local group that will be locked to this kiosk configuration
     */
    private String groupName;
    /**
     * Instantiates a new windowsKioskLocalGroup and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsKioskLocalGroup() {
        super();
        this.setOdataType("#microsoft.graph.windowsKioskLocalGroup");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsKioskLocalGroup
     */
    @javax.annotation.Nonnull
    public static WindowsKioskLocalGroup createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskLocalGroup();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("groupName", (n) -> { this.setGroupName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupName property value. The name of the local group that will be locked to this kiosk configuration
     * @return a string
     */
    @javax.annotation.Nullable
    public String getGroupName() {
        return this.groupName;
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
        writer.writeStringValue("groupName", this.getGroupName());
    }
    /**
     * Sets the groupName property value. The name of the local group that will be locked to this kiosk configuration
     * @param value Value to set for the groupName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupName(@javax.annotation.Nullable final String value) {
        this.groupName = value;
    }
}
