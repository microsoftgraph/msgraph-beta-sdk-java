package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecommendationConfiguration extends Entity implements Parsable {
    /**
     * Instantiates a new {@link RecommendationConfiguration} and sets the default values.
     */
    public RecommendationConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RecommendationConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static RecommendationConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecommendationConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isNotificationEnabled", (n) -> { this.setIsNotificationEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isNotificationEnabled property value. Indicates whether notifications for recommendations are enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsNotificationEnabled() {
        return this.backingStore.get("isNotificationEnabled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isNotificationEnabled", this.getIsNotificationEnabled());
    }
    /**
     * Sets the isNotificationEnabled property value. Indicates whether notifications for recommendations are enabled.
     * @param value Value to set for the isNotificationEnabled property.
     */
    public void setIsNotificationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isNotificationEnabled", value);
    }
}
