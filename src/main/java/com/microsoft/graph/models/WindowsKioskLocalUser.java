package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsKioskLocalUser extends WindowsKioskUser implements Parsable {
    /** The local user that will be locked to this kiosk configuration */
    private String _userName;
    /**
     * Instantiates a new WindowsKioskLocalUser and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsKioskLocalUser() {
        super();
        this.setOdataType("#microsoft.graph.windowsKioskLocalUser");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsKioskLocalUser
     */
    @javax.annotation.Nonnull
    public static WindowsKioskLocalUser createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskLocalUser();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsKioskLocalUser currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("userName", (n) -> { currentObject.setUserName(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the userName property value. The local user that will be locked to this kiosk configuration
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserName() {
        return this._userName;
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
        writer.writeStringValue("userName", this.getUserName());
    }
    /**
     * Sets the userName property value. The local user that will be locked to this kiosk configuration
     * @param value Value to set for the userName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserName(@javax.annotation.Nullable final String value) {
        this._userName = value;
    }
}
