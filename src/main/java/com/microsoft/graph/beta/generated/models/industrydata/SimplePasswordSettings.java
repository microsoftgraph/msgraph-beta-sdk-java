package com.microsoft.graph.beta.models.industrydata;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SimplePasswordSettings extends PasswordSettings implements Parsable {
    /**
     * Instantiates a new {@link SimplePasswordSettings} and sets the default values.
     */
    public SimplePasswordSettings() {
        super();
        this.setOdataType("#microsoft.graph.industryData.simplePasswordSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SimplePasswordSettings}
     */
    @jakarta.annotation.Nonnull
    public static SimplePasswordSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SimplePasswordSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("password", (n) -> { this.setPassword(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the password property value. The password for the user.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPassword() {
        return this.backingStore.get("password");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("password", this.getPassword());
    }
    /**
     * Sets the password property value. The password for the user.
     * @param value Value to set for the password property.
     */
    public void setPassword(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("password", value);
    }
}
