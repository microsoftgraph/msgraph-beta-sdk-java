package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdentityCorrelation extends Entity implements Parsable {
    /**
     * Instantiates a new {@link IdentityCorrelation} and sets the default values.
     */
    public IdentityCorrelation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IdentityCorrelation}
     */
    @jakarta.annotation.Nonnull
    public static IdentityCorrelation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentityCorrelation();
    }
    /**
     * Gets the endDateTime property value. The date and time when the correlation process completed.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.backingStore.get("endDateTime");
    }
    /**
     * Gets the error property value. Error information if the correlation process failed. null if successful.  Supports $filter (eq).
     * @return a {@link CorrelationError}
     */
    @jakarta.annotation.Nullable
    public CorrelationError getError() {
        return this.backingStore.get("error");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(CorrelationError::createFromDiscriminatorValue)); });
        deserializerMap.put("identities", (n) -> { this.setIdentities(n.getCollectionOfObjectValues(CorrelatedIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("servicePrincipal", (n) -> { this.setServicePrincipal(n.getObjectValue(ServicePrincipal::createFromDiscriminatorValue)); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identities property value. The collection of correlated identity results for this correlation report.
     * @return a {@link java.util.List<CorrelatedIdentity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CorrelatedIdentity> getIdentities() {
        return this.backingStore.get("identities");
    }
    /**
     * Gets the servicePrincipal property value. The servicePrincipal property
     * @return a {@link ServicePrincipal}
     */
    @jakarta.annotation.Nullable
    public ServicePrincipal getServicePrincipal() {
        return this.backingStore.get("servicePrincipal");
    }
    /**
     * Gets the startDateTime property value. The date and time when the correlation process started.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this.backingStore.get("startDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
        writer.writeObjectValue("error", this.getError());
        writer.writeCollectionOfObjectValues("identities", this.getIdentities());
        writer.writeObjectValue("servicePrincipal", this.getServicePrincipal());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
    }
    /**
     * Sets the endDateTime property value. The date and time when the correlation process completed.
     * @param value Value to set for the endDateTime property.
     */
    public void setEndDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("endDateTime", value);
    }
    /**
     * Sets the error property value. Error information if the correlation process failed. null if successful.  Supports $filter (eq).
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final CorrelationError value) {
        this.backingStore.set("error", value);
    }
    /**
     * Sets the identities property value. The collection of correlated identity results for this correlation report.
     * @param value Value to set for the identities property.
     */
    public void setIdentities(@jakarta.annotation.Nullable final java.util.List<CorrelatedIdentity> value) {
        this.backingStore.set("identities", value);
    }
    /**
     * Sets the servicePrincipal property value. The servicePrincipal property
     * @param value Value to set for the servicePrincipal property.
     */
    public void setServicePrincipal(@jakarta.annotation.Nullable final ServicePrincipal value) {
        this.backingStore.set("servicePrincipal", value);
    }
    /**
     * Sets the startDateTime property value. The date and time when the correlation process started.
     * @param value Value to set for the startDateTime property.
     */
    public void setStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("startDateTime", value);
    }
}
