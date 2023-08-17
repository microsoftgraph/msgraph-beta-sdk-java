package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The class used to identify an Azure Directory group for the kiosk configuration
 */
public class WindowsKioskActiveDirectoryGroup extends WindowsKioskUser implements Parsable {
    /**
     * The name of the AD group that will be locked to this kiosk configuration
     */
    private String groupName;
    /**
     * Instantiates a new windowsKioskActiveDirectoryGroup and sets the default values.
     */
    public WindowsKioskActiveDirectoryGroup() {
        super();
        this.setOdataType("#microsoft.graph.windowsKioskActiveDirectoryGroup");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsKioskActiveDirectoryGroup
     */
    @jakarta.annotation.Nonnull
    public static WindowsKioskActiveDirectoryGroup createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskActiveDirectoryGroup();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("groupName", (n) -> { this.setGroupName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupName property value. The name of the AD group that will be locked to this kiosk configuration
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getGroupName() {
        return this.groupName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("groupName", this.getGroupName());
    }
    /**
     * Sets the groupName property value. The name of the AD group that will be locked to this kiosk configuration
     * @param value Value to set for the groupName property.
     */
    public void setGroupName(@jakarta.annotation.Nullable final String value) {
        this.groupName = value;
    }
}
