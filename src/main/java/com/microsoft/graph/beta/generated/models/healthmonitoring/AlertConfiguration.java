package com.microsoft.graph.beta.models.healthmonitoring;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AlertConfiguration extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AlertConfiguration} and sets the default values.
     */
    public AlertConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AlertConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static AlertConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AlertConfiguration();
    }
    /**
     * Gets the emailNotificationConfigurations property value. The emailNotificationConfigurations property
     * @return a {@link java.util.List<EmailNotificationConfiguration>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<EmailNotificationConfiguration> getEmailNotificationConfigurations() {
        return this.backingStore.get("emailNotificationConfigurations");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("emailNotificationConfigurations", (n) -> { this.setEmailNotificationConfigurations(n.getCollectionOfObjectValues(EmailNotificationConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("emailNotificationConfigurations", this.getEmailNotificationConfigurations());
    }
    /**
     * Sets the emailNotificationConfigurations property value. The emailNotificationConfigurations property
     * @param value Value to set for the emailNotificationConfigurations property.
     */
    public void setEmailNotificationConfigurations(@jakarta.annotation.Nullable final java.util.List<EmailNotificationConfiguration> value) {
        this.backingStore.set("emailNotificationConfigurations", value);
    }
}
