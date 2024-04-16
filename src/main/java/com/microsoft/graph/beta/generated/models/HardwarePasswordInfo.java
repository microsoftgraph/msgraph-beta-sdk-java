package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Intune will provide customer the ability to configure hardware/bios settings on the enrolled windows 10 Azure Active Directory joined devices.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HardwarePasswordInfo extends Entity implements Parsable {
    /**
     * Instantiates a new {@link HardwarePasswordInfo} and sets the default values.
     */
    public HardwarePasswordInfo() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link HardwarePasswordInfo}
     */
    @jakarta.annotation.Nonnull
    public static HardwarePasswordInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HardwarePasswordInfo();
    }
    /**
     * Gets the currentPassword property value. Current device password
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCurrentPassword() {
        return this.backingStore.get("currentPassword");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("currentPassword", (n) -> { this.setCurrentPassword(n.getStringValue()); });
        deserializerMap.put("previousPasswords", (n) -> { this.setPreviousPasswords(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("serialNumber", (n) -> { this.setSerialNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the previousPasswords property value. List of previous device passwords
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPreviousPasswords() {
        return this.backingStore.get("previousPasswords");
    }
    /**
     * Gets the serialNumber property value. Device serial number
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSerialNumber() {
        return this.backingStore.get("serialNumber");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("currentPassword", this.getCurrentPassword());
        writer.writeCollectionOfPrimitiveValues("previousPasswords", this.getPreviousPasswords());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
    }
    /**
     * Sets the currentPassword property value. Current device password
     * @param value Value to set for the currentPassword property.
     */
    public void setCurrentPassword(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("currentPassword", value);
    }
    /**
     * Sets the previousPasswords property value. List of previous device passwords
     * @param value Value to set for the previousPasswords property.
     */
    public void setPreviousPasswords(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("previousPasswords", value);
    }
    /**
     * Sets the serialNumber property value. Device serial number
     * @param value Value to set for the serialNumber property.
     */
    public void setSerialNumber(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serialNumber", value);
    }
}
