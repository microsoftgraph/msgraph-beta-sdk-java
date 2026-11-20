package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A credit request submitted by a user and acted on by an administrator.Derives from entity; the client-visible identifier is id.ETag-based optimistic concurrency is enforced via the standard OData ETag mechanism.Individual PATCH uses If-Match; the bulk action uses each item&apos;s etag field.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreditRequest extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CreditRequest} and sets the default values.
     */
    public CreditRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CreditRequest}
     */
    @jakarta.annotation.Nonnull
    public static CreditRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreditRequest();
    }
    /**
     * Gets the createdDateTime property value. The date and time the request was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the decisionBy property value. The identity of the administrator who approved or rejected the request.Only the user facet is populated. Null until the request is decided.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getDecisionBy() {
        return this.backingStore.get("decisionBy");
    }
    /**
     * Gets the expirationDateTime property value. The date and time the request expires. The backing service sets this to 90 days aftercreation and resets it to 90 days after a state-changing update.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("decisionBy", (n) -> { this.setDecisionBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("requestedBy", (n) -> { this.setRequestedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("requestType", (n) -> { this.setRequestType(n.getEnumValue(CreditRequestType::forValue)); });
        deserializerMap.put("serviceId", (n) -> { this.setServiceId(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(CreditRequestState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time the request was last modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the requestedBy property value. The requestedBy property
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getRequestedBy() {
        return this.backingStore.get("requestedBy");
    }
    /**
     * Gets the requestType property value. The reason or trigger that caused a credit request to be created.
     * @return a {@link CreditRequestType}
     */
    @jakarta.annotation.Nullable
    public CreditRequestType getRequestType() {
        return this.backingStore.get("requestType");
    }
    /**
     * Gets the serviceId property value. The open, extensible service identifier associated with this credit request,using the same values as other Copilot Cost Management APIs, such as cowork and workIQ.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServiceId() {
        return this.backingStore.get("serviceId");
    }
    /**
     * Gets the state property value. The state of a credit request in the approval workflow.
     * @return a {@link CreditRequestState}
     */
    @jakarta.annotation.Nullable
    public CreditRequestState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("requestedBy", this.getRequestedBy());
        writer.writeEnumValue("requestType", this.getRequestType());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the createdDateTime property value. The date and time the request was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the decisionBy property value. The identity of the administrator who approved or rejected the request.Only the user facet is populated. Null until the request is decided.
     * @param value Value to set for the decisionBy property.
     */
    public void setDecisionBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("decisionBy", value);
    }
    /**
     * Sets the expirationDateTime property value. The date and time the request expires. The backing service sets this to 90 days aftercreation and resets it to 90 days after a state-changing update.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time the request was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the requestedBy property value. The requestedBy property
     * @param value Value to set for the requestedBy property.
     */
    public void setRequestedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("requestedBy", value);
    }
    /**
     * Sets the requestType property value. The reason or trigger that caused a credit request to be created.
     * @param value Value to set for the requestType property.
     */
    public void setRequestType(@jakarta.annotation.Nullable final CreditRequestType value) {
        this.backingStore.set("requestType", value);
    }
    /**
     * Sets the serviceId property value. The open, extensible service identifier associated with this credit request,using the same values as other Copilot Cost Management APIs, such as cowork and workIQ.
     * @param value Value to set for the serviceId property.
     */
    public void setServiceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("serviceId", value);
    }
    /**
     * Sets the state property value. The state of a credit request in the approval workflow.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final CreditRequestState value) {
        this.backingStore.set("state", value);
    }
}
