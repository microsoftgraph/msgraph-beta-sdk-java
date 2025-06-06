package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserCloudCommunication extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UserCloudCommunication} and sets the default values.
     */
    public UserCloudCommunication() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserCloudCommunication}
     */
    @jakarta.annotation.Nonnull
    public static UserCloudCommunication createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserCloudCommunication();
    }
    /**
     * Gets the callSettings property value. The call settings assigned to the user.
     * @return a {@link CallSettings}
     */
    @jakarta.annotation.Nullable
    public CallSettings getCallSettings() {
        return this.backingStore.get("callSettings");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("callSettings", (n) -> { this.setCallSettings(n.getObjectValue(CallSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("callSettings", this.getCallSettings());
    }
    /**
     * Sets the callSettings property value. The call settings assigned to the user.
     * @param value Value to set for the callSettings property.
     */
    public void setCallSettings(@jakarta.annotation.Nullable final CallSettings value) {
        this.backingStore.set("callSettings", value);
    }
}
