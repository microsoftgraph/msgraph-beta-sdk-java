package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The importedDeviceIdentityResult resource represents the result of attempting to import a device identity.
 */
public class ImportedDeviceIdentityResult extends ImportedDeviceIdentity implements Parsable {
    /**
     * Status of imported device identity
     */
    private Boolean status;
    /**
     * Instantiates a new importedDeviceIdentityResult and sets the default values.
     */
    public ImportedDeviceIdentityResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a importedDeviceIdentityResult
     */
    @jakarta.annotation.Nonnull
    public static ImportedDeviceIdentityResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImportedDeviceIdentityResult();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("status", (n) -> { this.setStatus(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the status property value. Status of imported device identity
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("status", this.getStatus());
    }
    /**
     * Sets the status property value. Status of imported device identity
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final Boolean value) {
        this.status = value;
    }
}
