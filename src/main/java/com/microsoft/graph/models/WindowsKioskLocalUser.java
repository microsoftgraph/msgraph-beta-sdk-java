package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The class used to identify a local account for the kiosk configuration
 */
public class WindowsKioskLocalUser extends WindowsKioskUser implements Parsable {
    /**
     * The local user that will be locked to this kiosk configuration
     */
    private String userName;
    /**
     * Instantiates a new windowsKioskLocalUser and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public WindowsKioskLocalUser() {
        super();
        this.setOdataType("#microsoft.graph.windowsKioskLocalUser");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsKioskLocalUser
     */
    @jakarta.annotation.Nonnull
    public static WindowsKioskLocalUser createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskLocalUser();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("userName", (n) -> { this.setUserName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the userName property value. The local user that will be locked to this kiosk configuration
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getUserName() {
        return this.userName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("userName", this.getUserName());
    }
    /**
     * Sets the userName property value. The local user that will be locked to this kiosk configuration
     * @param value Value to set for the userName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserName(@jakarta.annotation.Nullable final String value) {
        this.userName = value;
    }
}
