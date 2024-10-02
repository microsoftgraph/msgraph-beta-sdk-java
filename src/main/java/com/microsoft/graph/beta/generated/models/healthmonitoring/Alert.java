package com.microsoft.graph.beta.models.healthmonitoring;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Alert extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Alert} and sets the default values.
     */
    public Alert() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Alert}
     */
    @jakarta.annotation.Nonnull
    public static Alert createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Alert();
    }
    /**
     * Gets the alertType property value. The alertType property
     * @return a {@link AlertType}
     */
    @jakarta.annotation.Nullable
    public AlertType getAlertType() {
        return this.backingStore.get("alertType");
    }
    /**
     * Gets the category property value. The category property
     * @return a {@link Category}
     */
    @jakarta.annotation.Nullable
    public Category getCategory() {
        return this.backingStore.get("category");
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the documentation property value. The documentation property
     * @return a {@link Documentation}
     */
    @jakarta.annotation.Nullable
    public Documentation getDocumentation() {
        return this.backingStore.get("documentation");
    }
    /**
     * Gets the enrichment property value. The enrichment property
     * @return a {@link Enrichment}
     */
    @jakarta.annotation.Nullable
    public Enrichment getEnrichment() {
        return this.backingStore.get("enrichment");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alertType", (n) -> { this.setAlertType(n.getEnumValue(AlertType::forValue)); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(Category::forValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("documentation", (n) -> { this.setDocumentation(n.getObjectValue(Documentation::createFromDiscriminatorValue)); });
        deserializerMap.put("enrichment", (n) -> { this.setEnrichment(n.getObjectValue(Enrichment::createFromDiscriminatorValue)); });
        deserializerMap.put("scenario", (n) -> { this.setScenario(n.getEnumValue(Scenario::forValue)); });
        deserializerMap.put("signals", (n) -> { this.setSignals(n.getObjectValue(Signals::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(AlertState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the scenario property value. The scenario property
     * @return a {@link Scenario}
     */
    @jakarta.annotation.Nullable
    public Scenario getScenario() {
        return this.backingStore.get("scenario");
    }
    /**
     * Gets the signals property value. The signals property
     * @return a {@link Signals}
     */
    @jakarta.annotation.Nullable
    public Signals getSignals() {
        return this.backingStore.get("signals");
    }
    /**
     * Gets the state property value. The state property
     * @return a {@link AlertState}
     */
    @jakarta.annotation.Nullable
    public AlertState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("alertType", this.getAlertType());
        writer.writeEnumValue("category", this.getCategory());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("documentation", this.getDocumentation());
        writer.writeObjectValue("enrichment", this.getEnrichment());
        writer.writeEnumValue("scenario", this.getScenario());
        writer.writeObjectValue("signals", this.getSignals());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the alertType property value. The alertType property
     * @param value Value to set for the alertType property.
     */
    public void setAlertType(@jakarta.annotation.Nullable final AlertType value) {
        this.backingStore.set("alertType", value);
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final Category value) {
        this.backingStore.set("category", value);
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the documentation property value. The documentation property
     * @param value Value to set for the documentation property.
     */
    public void setDocumentation(@jakarta.annotation.Nullable final Documentation value) {
        this.backingStore.set("documentation", value);
    }
    /**
     * Sets the enrichment property value. The enrichment property
     * @param value Value to set for the enrichment property.
     */
    public void setEnrichment(@jakarta.annotation.Nullable final Enrichment value) {
        this.backingStore.set("enrichment", value);
    }
    /**
     * Sets the scenario property value. The scenario property
     * @param value Value to set for the scenario property.
     */
    public void setScenario(@jakarta.annotation.Nullable final Scenario value) {
        this.backingStore.set("scenario", value);
    }
    /**
     * Sets the signals property value. The signals property
     * @param value Value to set for the signals property.
     */
    public void setSignals(@jakarta.annotation.Nullable final Signals value) {
        this.backingStore.set("signals", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final AlertState value) {
        this.backingStore.set("state", value);
    }
}
