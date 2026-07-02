package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CorrelatedIdentity extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CorrelatedIdentity} and sets the default values.
     */
    public CorrelatedIdentity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CorrelatedIdentity}
     */
    @jakarta.annotation.Nonnull
    public static CorrelatedIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CorrelatedIdentity();
    }
    /**
     * Gets the correlatedDateTime property value. The date and time when the identity was correlated.  Supports $orderby.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCorrelatedDateTime() {
        return this.backingStore.get("correlatedDateTime");
    }
    /**
     * Gets the error property value. Error information if the correlation for this identity failed. null if successful.  Supports $filter (eq).
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
        deserializerMap.put("correlatedDateTime", (n) -> { this.setCorrelatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(CorrelationError::createFromDiscriminatorValue)); });
        deserializerMap.put("sourceIdentity", (n) -> { this.setSourceIdentity(n.getObjectValue(IdentityInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("targetIdentity", (n) -> { this.setTargetIdentity(n.getObjectValue(IdentityInfo::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the sourceIdentity property value. The source identity information from the on-premises directory.  Supports $filter (eq).
     * @return a {@link IdentityInfo}
     */
    @jakarta.annotation.Nullable
    public IdentityInfo getSourceIdentity() {
        return this.backingStore.get("sourceIdentity");
    }
    /**
     * Gets the status property value. The correlation and assignment status. Possible values include: uncorrelated, correlatedNotAssigned, correlatedAssigned and failToCorrelate.  Supports $filter (eq), $count.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the targetIdentity property value. The target identity information from Microsoft Entra ID.  Supports $filter (eq).
     * @return a {@link IdentityInfo}
     */
    @jakarta.annotation.Nullable
    public IdentityInfo getTargetIdentity() {
        return this.backingStore.get("targetIdentity");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("correlatedDateTime", this.getCorrelatedDateTime());
        writer.writeObjectValue("error", this.getError());
        writer.writeObjectValue("sourceIdentity", this.getSourceIdentity());
        writer.writeStringValue("status", this.getStatus());
        writer.writeObjectValue("targetIdentity", this.getTargetIdentity());
    }
    /**
     * Sets the correlatedDateTime property value. The date and time when the identity was correlated.  Supports $orderby.
     * @param value Value to set for the correlatedDateTime property.
     */
    public void setCorrelatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("correlatedDateTime", value);
    }
    /**
     * Sets the error property value. Error information if the correlation for this identity failed. null if successful.  Supports $filter (eq).
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final CorrelationError value) {
        this.backingStore.set("error", value);
    }
    /**
     * Sets the sourceIdentity property value. The source identity information from the on-premises directory.  Supports $filter (eq).
     * @param value Value to set for the sourceIdentity property.
     */
    public void setSourceIdentity(@jakarta.annotation.Nullable final IdentityInfo value) {
        this.backingStore.set("sourceIdentity", value);
    }
    /**
     * Sets the status property value. The correlation and assignment status. Possible values include: uncorrelated, correlatedNotAssigned, correlatedAssigned and failToCorrelate.  Supports $filter (eq), $count.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the targetIdentity property value. The target identity information from Microsoft Entra ID.  Supports $filter (eq).
     * @param value Value to set for the targetIdentity property.
     */
    public void setTargetIdentity(@jakarta.annotation.Nullable final IdentityInfo value) {
        this.backingStore.set("targetIdentity", value);
    }
}
