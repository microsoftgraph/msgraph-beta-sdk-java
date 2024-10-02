package com.microsoft.graph.beta.models.healthmonitoring;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HealthMonitoringRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link HealthMonitoringRoot} and sets the default values.
     */
    public HealthMonitoringRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link HealthMonitoringRoot}
     */
    @jakarta.annotation.Nonnull
    public static HealthMonitoringRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HealthMonitoringRoot();
    }
    /**
     * Gets the alertConfigurations property value. The alertConfigurations property
     * @return a {@link java.util.List<AlertConfiguration>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AlertConfiguration> getAlertConfigurations() {
        return this.backingStore.get("alertConfigurations");
    }
    /**
     * Gets the alerts property value. The alerts property
     * @return a {@link java.util.List<Alert>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Alert> getAlerts() {
        return this.backingStore.get("alerts");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alertConfigurations", (n) -> { this.setAlertConfigurations(n.getCollectionOfObjectValues(AlertConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("alerts", (n) -> { this.setAlerts(n.getCollectionOfObjectValues(Alert::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("alertConfigurations", this.getAlertConfigurations());
        writer.writeCollectionOfObjectValues("alerts", this.getAlerts());
    }
    /**
     * Sets the alertConfigurations property value. The alertConfigurations property
     * @param value Value to set for the alertConfigurations property.
     */
    public void setAlertConfigurations(@jakarta.annotation.Nullable final java.util.List<AlertConfiguration> value) {
        this.backingStore.set("alertConfigurations", value);
    }
    /**
     * Sets the alerts property value. The alerts property
     * @param value Value to set for the alerts property.
     */
    public void setAlerts(@jakarta.annotation.Nullable final java.util.List<Alert> value) {
        this.backingStore.set("alerts", value);
    }
}
