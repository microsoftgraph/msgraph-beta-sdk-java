package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApprovalItemResponse extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ApprovalItemResponse} and sets the default values.
     */
    public ApprovalItemResponse() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApprovalItemResponse}
     */
    @jakarta.annotation.Nonnull
    public static ApprovalItemResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApprovalItemResponse();
    }
    /**
     * Gets the comments property value. The comment made by the approver.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getComments() {
        return this.backingStore.get("comments");
    }
    /**
     * Gets the createdBy property value. The identity set of the approver.
     * @return a {@link ApprovalIdentitySet}
     */
    @jakarta.annotation.Nullable
    public ApprovalIdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. Creation date and time of the response.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("comments", (n) -> { this.setComments(n.getStringValue()); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(ApprovalIdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("owners", (n) -> { this.setOwners(n.getCollectionOfObjectValues(ApprovalIdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("response", (n) -> { this.setResponse(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the owners property value. The identity set of the principal who owns the approval item.
     * @return a {@link java.util.List<ApprovalIdentitySet>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ApprovalIdentitySet> getOwners() {
        return this.backingStore.get("owners");
    }
    /**
     * Gets the response property value. Approver response based on the response options. The default response options are &apos;Approved&apos; and &apos;Rejected&apos;. The approval item creator can also define custom response options during approval item creation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResponse() {
        return this.backingStore.get("response");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("comments", this.getComments());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeStringValue("response", this.getResponse());
    }
    /**
     * Sets the comments property value. The comment made by the approver.
     * @param value Value to set for the comments property.
     */
    public void setComments(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("comments", value);
    }
    /**
     * Sets the createdBy property value. The identity set of the approver.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final ApprovalIdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. Creation date and time of the response.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the owners property value. The identity set of the principal who owns the approval item.
     * @param value Value to set for the owners property.
     */
    public void setOwners(@jakarta.annotation.Nullable final java.util.List<ApprovalIdentitySet> value) {
        this.backingStore.set("owners", value);
    }
    /**
     * Sets the response property value. Approver response based on the response options. The default response options are &apos;Approved&apos; and &apos;Rejected&apos;. The approval item creator can also define custom response options during approval item creation.
     * @param value Value to set for the response property.
     */
    public void setResponse(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("response", value);
    }
}
