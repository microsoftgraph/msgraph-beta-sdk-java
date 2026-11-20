package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcBulkSetDeviceName extends CloudPcBulkAction implements Parsable {
    /**
     * Instantiates a new {@link CloudPcBulkSetDeviceName} and sets the default values.
     */
    public CloudPcBulkSetDeviceName() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcBulkSetDeviceName");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcBulkSetDeviceName}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcBulkSetDeviceName createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcBulkSetDeviceName();
    }
    /**
     * Gets the deviceNamingTemplate property value. The template used to generate a unique device name for each Cloud PC. Required when creating the action. Use an optional prefix followed by one %RAND:x% macro, where x is the number of random alphanumeric characters and is at least 5. The generated name must be 515 characters long. The prefix can contain ASCII letters, digits, and hyphens, and must not start with a hyphen. The prefix length plus x must not exceed 15. For example, ACRA-%RAND:5% generates a ten-character name such as ACRA-A1B2C.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeviceNamingTemplate() {
        return this.backingStore.get("deviceNamingTemplate");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceNamingTemplate", (n) -> { this.setDeviceNamingTemplate(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("deviceNamingTemplate", this.getDeviceNamingTemplate());
    }
    /**
     * Sets the deviceNamingTemplate property value. The template used to generate a unique device name for each Cloud PC. Required when creating the action. Use an optional prefix followed by one %RAND:x% macro, where x is the number of random alphanumeric characters and is at least 5. The generated name must be 515 characters long. The prefix can contain ASCII letters, digits, and hyphens, and must not start with a hyphen. The prefix length plus x must not exceed 15. For example, ACRA-%RAND:5% generates a ten-character name such as ACRA-A1B2C.
     * @param value Value to set for the deviceNamingTemplate property.
     */
    public void setDeviceNamingTemplate(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceNamingTemplate", value);
    }
}
