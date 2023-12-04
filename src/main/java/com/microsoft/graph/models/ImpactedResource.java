package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ImpactedResource extends Entity implements Parsable {
    /**
     * Instantiates a new ImpactedResource and sets the default values.
     */
    public ImpactedResource() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ImpactedResource
     */
    @jakarta.annotation.Nonnull
    public static ImpactedResource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImpactedResource();
    }
    /**
     * Gets the addedDateTime property value. The date and time when the impactedResource object was initially associated with the recommendation.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getAddedDateTime() {
        return this.backingStore.get("addedDateTime");
    }
    /**
     * Gets the additionalDetails property value. Additional information unique to the impactedResource to help contextualize the recommendation.
     * @return a java.util.List<KeyValue>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValue> getAdditionalDetails() {
        return this.backingStore.get("additionalDetails");
    }
    /**
     * Gets the apiUrl property value. The URL link to the corresponding Microsoft Entra resource.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getApiUrl() {
        return this.backingStore.get("apiUrl");
    }
    /**
     * Gets the displayName property value. Friendly name of the Microsoft Entra resource.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("addedDateTime", (n) -> { this.setAddedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("additionalDetails", (n) -> { this.setAdditionalDetails(n.getCollectionOfObjectValues(KeyValue::createFromDiscriminatorValue)); });
        deserializerMap.put("apiUrl", (n) -> { this.setApiUrl(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getStringValue()); });
        deserializerMap.put("owner", (n) -> { this.setOwner(n.getStringValue()); });
        deserializerMap.put("portalUrl", (n) -> { this.setPortalUrl(n.getStringValue()); });
        deserializerMap.put("postponeUntilDateTime", (n) -> { this.setPostponeUntilDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("rank", (n) -> { this.setRank(n.getIntegerValue()); });
        deserializerMap.put("recommendationId", (n) -> { this.setRecommendationId(n.getStringValue()); });
        deserializerMap.put("resourceType", (n) -> { this.setResourceType(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(RecommendationStatus::forValue)); });
        deserializerMap.put("subjectId", (n) -> { this.setSubjectId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. Name of the user or service that last updated the status.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time when the status was last updated.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the owner property value. The user responsible for maintaining the resource.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOwner() {
        return this.backingStore.get("owner");
    }
    /**
     * Gets the portalUrl property value. The URL link to the corresponding Microsoft Entra admin center page of the resource.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPortalUrl() {
        return this.backingStore.get("portalUrl");
    }
    /**
     * Gets the postponeUntilDateTime property value. The future date and time when the status of a postponed impactedResource will be active again.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getPostponeUntilDateTime() {
        return this.backingStore.get("postponeUntilDateTime");
    }
    /**
     * Gets the rank property value. Indicates the importance of the resource. A resource with a rank equal to 1 is of the highest importance.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRank() {
        return this.backingStore.get("rank");
    }
    /**
     * Gets the recommendationId property value. The unique identifier of the recommendation that the resource is associated with.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRecommendationId() {
        return this.backingStore.get("recommendationId");
    }
    /**
     * Gets the resourceType property value. Indicates the type of Microsoft Entra resource. Examples include user, application.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceType() {
        return this.backingStore.get("resourceType");
    }
    /**
     * Gets the status property value. The status property
     * @return a RecommendationStatus
     */
    @jakarta.annotation.Nullable
    public RecommendationStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the subjectId property value. The related unique identifier, depending on the resourceType. For example, this property is set to the applicationId if the resourceType is an application.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubjectId() {
        return this.backingStore.get("subjectId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("addedDateTime", this.getAddedDateTime());
        writer.writeCollectionOfObjectValues("additionalDetails", this.getAdditionalDetails());
        writer.writeStringValue("apiUrl", this.getApiUrl());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeStringValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("owner", this.getOwner());
        writer.writeStringValue("portalUrl", this.getPortalUrl());
        writer.writeOffsetDateTimeValue("postponeUntilDateTime", this.getPostponeUntilDateTime());
        writer.writeIntegerValue("rank", this.getRank());
        writer.writeStringValue("recommendationId", this.getRecommendationId());
        writer.writeStringValue("resourceType", this.getResourceType());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("subjectId", this.getSubjectId());
    }
    /**
     * Sets the addedDateTime property value. The date and time when the impactedResource object was initially associated with the recommendation.
     * @param value Value to set for the addedDateTime property.
     */
    public void setAddedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("addedDateTime", value);
    }
    /**
     * Sets the additionalDetails property value. Additional information unique to the impactedResource to help contextualize the recommendation.
     * @param value Value to set for the additionalDetails property.
     */
    public void setAdditionalDetails(@jakarta.annotation.Nullable final java.util.List<KeyValue> value) {
        this.backingStore.set("additionalDetails", value);
    }
    /**
     * Sets the apiUrl property value. The URL link to the corresponding Microsoft Entra resource.
     * @param value Value to set for the apiUrl property.
     */
    public void setApiUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("apiUrl", value);
    }
    /**
     * Sets the displayName property value. Friendly name of the Microsoft Entra resource.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the lastModifiedBy property value. Name of the user or service that last updated the status.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time when the status was last updated.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the owner property value. The user responsible for maintaining the resource.
     * @param value Value to set for the owner property.
     */
    public void setOwner(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("owner", value);
    }
    /**
     * Sets the portalUrl property value. The URL link to the corresponding Microsoft Entra admin center page of the resource.
     * @param value Value to set for the portalUrl property.
     */
    public void setPortalUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("portalUrl", value);
    }
    /**
     * Sets the postponeUntilDateTime property value. The future date and time when the status of a postponed impactedResource will be active again.
     * @param value Value to set for the postponeUntilDateTime property.
     */
    public void setPostponeUntilDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("postponeUntilDateTime", value);
    }
    /**
     * Sets the rank property value. Indicates the importance of the resource. A resource with a rank equal to 1 is of the highest importance.
     * @param value Value to set for the rank property.
     */
    public void setRank(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("rank", value);
    }
    /**
     * Sets the recommendationId property value. The unique identifier of the recommendation that the resource is associated with.
     * @param value Value to set for the recommendationId property.
     */
    public void setRecommendationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recommendationId", value);
    }
    /**
     * Sets the resourceType property value. Indicates the type of Microsoft Entra resource. Examples include user, application.
     * @param value Value to set for the resourceType property.
     */
    public void setResourceType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceType", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final RecommendationStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the subjectId property value. The related unique identifier, depending on the resourceType. For example, this property is set to the applicationId if the resourceType is an application.
     * @param value Value to set for the subjectId property.
     */
    public void setSubjectId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subjectId", value);
    }
}
