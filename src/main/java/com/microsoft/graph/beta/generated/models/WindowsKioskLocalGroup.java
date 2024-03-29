package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The class used to identify a local group for the kiosk configuration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsKioskLocalGroup extends WindowsKioskUser implements Parsable {
    /**
     * Instantiates a new {@link WindowsKioskLocalGroup} and sets the default values.
     */
    public WindowsKioskLocalGroup() {
        super();
        this.setOdataType("#microsoft.graph.windowsKioskLocalGroup");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsKioskLocalGroup}
     */
    @jakarta.annotation.Nonnull
    public static WindowsKioskLocalGroup createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskLocalGroup();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("groupName", (n) -> { this.setGroupName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupName property value. The name of the local group that will be locked to this kiosk configuration
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getGroupName() {
        return this.backingStore.get("groupName");
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
     * Sets the groupName property value. The name of the local group that will be locked to this kiosk configuration
     * @param value Value to set for the groupName property.
     */
    public void setGroupName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("groupName", value);
    }
}
